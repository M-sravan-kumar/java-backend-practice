package org.example.unimall.sevices;

import org.example.unimall.dtos.FakeApiProduct;
import org.example.unimall.dtos.ProductRequestDto;
import org.example.unimall.model.Product;

import java.util.List;

public interface ProductService {

    public Product getSingleProduct(Long id);

    public List<Product> getAllProducts();

    public Product createProduct(ProductRequestDto productDto);

    public Product updateProduct(Long id,ProductRequestDto productDto);

    Product deleteProduct(Long id);
}
