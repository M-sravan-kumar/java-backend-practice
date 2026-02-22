package org.example.unimall.sevices;

import org.example.unimall.dtos.FakeApiProduct;
import org.example.unimall.model.Category;
import org.example.unimall.model.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service("FakeStoreCategoryServiceImpl")
public class FakeStoreCategoryServiceImpl implements CategoryService{

    private RestTemplate restTemplate;

    private FakeStoreCategoryServiceImpl(RestTemplate restTemplate)
    {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<String> getAllCategories() {
        String[] response =  restTemplate
                .getForObject("https://fakestoreapi.com/products/categories",
                        String[].class );

        List<String> categories = new ArrayList<>();

        for(String i: response)
            categories.add(i);

        return categories;
    }

    @Override
    public List<Product> getInCategories(String category) {

        FakeApiProduct[] response =  restTemplate.getForObject("https://fakestoreapi.com/products/category/"+category,
                FakeApiProduct[].class);

        List<Product> finalresponse = new ArrayList<>();
        for(FakeApiProduct i:response)
        {
            finalresponse.add(i.toProduct());
        }

        return finalresponse;
    }

    @Override
    public Category deleteById(Long id) {
        return null;
    }
}
