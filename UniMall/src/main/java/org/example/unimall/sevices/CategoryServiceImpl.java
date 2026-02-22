package org.example.unimall.sevices;

import org.example.unimall.model.Category;
import org.example.unimall.model.Product;
import org.example.unimall.repositories.CategoryRepository;
import org.example.unimall.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service("categoryServiceImpl")
public class CategoryServiceImpl implements CategoryService{

    private CategoryRepository categoryRepository;

    private ProductRepository productRepository;

    public CategoryServiceImpl(ProductRepository productRepository,CategoryRepository categoryRepository)
    {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }
    @Override
    public List<String> getAllCategories() {

        List<Category> response = categoryRepository.findAll();
        System.out.println(response);
        List<String> categories = new ArrayList<>();
        for(Category i: response)
            categories.add(i.getName());

        return categories;
    }

    @Override
    public List<Product> getInCategories(String category) {
        Category cat =  categoryRepository.findByName(category);
        return productRepository.findAllByCategory(cat);
    }

    @Override
    public Category deleteById(Long id) {
        Category category = categoryRepository.findById(id).get();
        categoryRepository.deleteById(id);
        return category;
    }

}
