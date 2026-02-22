package org.example.unimall.controller;

import org.example.unimall.model.Category;
import org.example.unimall.model.Product;
import org.example.unimall.sevices.CategoryService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {

        private CategoryService categoryService;

        public CategoryController(@Qualifier("categoryServiceImpl") CategoryService categoryService){
            this.categoryService = categoryService;
        }

        @GetMapping("/getallcategories")
        public List<String> getAllCategories()
        {
            return categoryService.getAllCategories();
        }

        @GetMapping("/getproducts/{category}")
        public List<Product> getAllProducts(@PathVariable("category") String category)
        {
            return categoryService.getInCategories(category);
        }

        @DeleteMapping("/deletecategory/{id}")
        public Category deleteCategoryByid(@PathVariable("id") Long id)
        {
            return categoryService.deleteById(id);
        }

}
