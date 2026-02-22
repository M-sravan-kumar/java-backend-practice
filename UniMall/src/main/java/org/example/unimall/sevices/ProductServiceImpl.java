package org.example.unimall.sevices;

import org.example.unimall.dtos.FakeApiProduct;
import org.example.unimall.dtos.ProductRequestDto;
import org.example.unimall.model.Category;
import org.example.unimall.model.Product;
import org.example.unimall.repositories.CategoryRepository;
import org.example.unimall.repositories.ProductRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    private ProductRepository productRepository;

    private CategoryRepository categoryRepository;

    public ProductServiceImpl(ProductRepository productRepository,CategoryRepository categoryRepository)
    {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Product getSingleProduct(Long id) {
        return productRepository.findById(id).get();
    }

    @Override
    public List<Product> getAllProducts() {
        List<Product> products = productRepository.findAll();
        return products;
    }

    @Override
    public Product createProduct(ProductRequestDto productDto) {

        Product product = productDto.toProduct();

        String categoryName = productDto.getCategory();
        Category categoryFromDatabase =  categoryRepository.findByName(categoryName);
        if(categoryFromDatabase==null)
        {
            Category cat = new Category();
            cat.setName(categoryName);
//            categoryFromDatabase=categoryRepository.save(cat);
            categoryFromDatabase = cat;
        }
        product.setCategory(categoryFromDatabase);

        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Long id, ProductRequestDto productDto) {

        Product responseFromDatabase =  productRepository.findById(id).get();
        if(responseFromDatabase!=null)
        {
            String inputData =  productDto.getCategory();
            String database =  responseFromDatabase.getCategory().getName();
            if(!inputData.equals(database))
            {
                Category cat = new Category();
                cat.setName(inputData);

                // If category was found from DB, then no new category will be created
                // If category is not found in the DB, a new category will be created because of cascade persist type
                responseFromDatabase.setCategory(cat);
            }
            responseFromDatabase.setPrice(productDto.getPrice());
            responseFromDatabase.setTitle(productDto.getTitle());
            responseFromDatabase.setImage(productDto.getImage());
            responseFromDatabase.setDescription(productDto.getDescription());

            return productRepository.save(responseFromDatabase);
        }

        return responseFromDatabase;
    }

    @Override
    public Product deleteProduct(Long id) {
        Product product = productRepository.findById(id).get();
        productRepository.delete(product);
       return product;
    }

}
