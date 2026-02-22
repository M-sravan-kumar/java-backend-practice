package org.example.unimall.sevices;

import org.example.unimall.model.Category;
import org.example.unimall.model.Product;

import java.util.List;

public interface CategoryService {

    public List<String> getAllCategories();

    public List<Product> getInCategories(String category);

    public Category deleteById(Long id);

}
