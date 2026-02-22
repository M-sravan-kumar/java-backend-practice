package world.shopping.Ecommerce.controller;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import world.shopping.Ecommerce.dto.ProductDto;
import world.shopping.Ecommerce.schema.Product;
import world.shopping.Ecommerce.services.ProductService;

import java.util.List;

@RestController
//@NoArgsConstructor
@AllArgsConstructor
@RequestMapping("/api/v1/product")
public class ProductController {

    private ProductService productService;

    @PostMapping("/add")
    public void addProduct(@RequestBody ProductDto productDto)
    {
        productService.addProduct(productDto);
    }

    @GetMapping("/all")
    public List<Product> findAll(){
        return productService.getAllProducts();
    }

    @GetMapping("/all/{id}")
    public Product getById(@PathVariable int id){
        return productService.getProductById(id);
    }

}
