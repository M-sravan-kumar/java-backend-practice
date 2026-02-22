package org.example.unimall.sevices;

import org.example.unimall.dtos.FakeApiProduct;
import org.example.unimall.dtos.ProductRequestDto;
import org.example.unimall.model.Product;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class FakeStoreProductServiceImpl implements ProductService {

    private RestTemplate restTemplate;

    public FakeStoreProductServiceImpl(RestTemplate restTemplate)
    {
        this.restTemplate = restTemplate;
    }

    @Override
    public Product getSingleProduct(Long id) {
        FakeApiProduct product =  restTemplate.
                getForEntity("https://fakestoreapi.com/products/"+id,
                        FakeApiProduct.class).getBody();
        return product.toProduct();
    }

    @Override
    public List<Product> getAllProducts() {
        FakeApiProduct[] response =  restTemplate
                .getForObject("https://fakestoreapi.com/products",
                        FakeApiProduct[].class );
        List<Product> products = new ArrayList<>();
        for(FakeApiProduct p:response)
        {
            products.add(p.toProduct());
        }
        return products;
    }

    @Override
    public Product createProduct(ProductRequestDto productRequestDto) {
        ProductRequestDto response =  restTemplate.postForObject("https://fakestoreapi.com/products",
                productRequestDto,
                ProductRequestDto.class);

        return response.toProduct();
    }

//        restTemplate.exchange(url, HttpMethod.PUT, requestEntity, Void.class, resourceId);
    @Override
    public Product updateProduct(Long id, ProductRequestDto productRequestDto) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        // Create request entity with updated data and headers
        HttpEntity<ProductRequestDto> requestEntity = new HttpEntity<>(productRequestDto, headers);

        FakeApiProduct response = restTemplate.
                exchange("https://fakestoreapi.com/products/{id}",
                HttpMethod.PUT,requestEntity,
                FakeApiProduct.class,id).getBody();
        return response.toProduct();
    }

    @Override
    public Product deleteProduct(Long id) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        // Create request entity with updated data and headers
        HttpEntity<?> requestEntity = new HttpEntity<>(headers);

        ResponseEntity<FakeApiProduct> response = restTemplate.exchange("https://fakestoreapi.com/products/{id}",
                HttpMethod.DELETE, requestEntity, FakeApiProduct.class, id);

        if(response.getStatusCode().is2xxSuccessful()){
            System.out.println("Resource deleted successfully");
        }else{
            System.err.println("Failed to delete resource. Status code: "+response.getStatusCode());
        }

        return response.getBody().toProduct();

    }
}

