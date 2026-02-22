package world.shopping.Ecommerce.services;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import world.shopping.Ecommerce.dto.ProductDto;
import world.shopping.Ecommerce.repositories.ProductRepository;
import world.shopping.Ecommerce.schema.Product;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductService {

    private ProductRepository productRepository;

    public void addProduct(ProductDto productDto)
    {
        Product product = new Product().builder()
                .name(productDto.getName())
                .price(productDto.getPrice())
                .description(productDto.getDescription())
                .avgRating(productDto.getAvgRating()).build();
        productRepository.save(product);
    }

    public List<Product> getAllProducts()
    {
        return productRepository.findAll();
    }

    public Product getProductById(int id)
    {
        return productRepository.findById(id).orElseThrow(()->new RuntimeException("Product not found"));
    }

}
