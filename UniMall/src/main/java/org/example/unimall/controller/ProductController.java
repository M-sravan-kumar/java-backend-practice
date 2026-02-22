package org.example.unimall.controller;

import org.example.unimall.dtos.FakeApiProduct;
import org.example.unimall.dtos.ProductRequestDto;
import org.example.unimall.model.Product;
import org.example.unimall.sevices.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    private ProductService productService;

    public ProductController(@Qualifier("productServiceImpl") ProductService productService)
    {
        this.productService = productService;
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable("id") Long id)
    {
        Product product = productService.getSingleProduct(id);
        ResponseEntity<Product> response = new ResponseEntity<>(product, HttpStatusCode.valueOf(202));
        return  response;
    }

    @GetMapping("/allproducts")
    public ResponseEntity<List<Product>> getAllProducts()
    {
       List<Product> products=productService.getAllProducts();

        return new ResponseEntity<List<Product>>(products,HttpStatusCode.valueOf(202));}

    @PostMapping("/product")
    public ResponseEntity<Product> createProduct(@RequestBody ProductRequestDto productRequestDto)
    {
        Product response = productService.createProduct(productRequestDto);
        return new ResponseEntity<Product>(response,HttpStatusCode.valueOf(202));
    }

    @PutMapping("/updateproduct/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable("id") Long id,
                                 @RequestBody ProductRequestDto fakeApiProduct )
    {
        Product reponse =  productService.updateProduct(id,fakeApiProduct);
        return new ResponseEntity<Product>(reponse,HttpStatusCode.valueOf(202));
    }

    @DeleteMapping("/deleteproduct/{id}")
    public ResponseEntity<Product> deleteProduct(@PathVariable("id") Long id)
    {
         Product response =  productService.deleteProduct(id);
        return new ResponseEntity<Product>(response,HttpStatusCode.valueOf(202));
    }

}

