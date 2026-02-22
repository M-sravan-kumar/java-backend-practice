package org.example.unimall.dtos;

import lombok.Getter;
import lombok.Setter;
import org.example.unimall.model.Category;
import org.example.unimall.model.Product;

@Getter
@Setter
public class ProductRequestDto {
        String title;
        int price;
        String category;
        String description;
        String image;

         public Product toProduct()
        {
                Product p = new Product();
                p.setDescription(description);
                p.setImage(image);
                p.setPrice(price);
                p.setTitle(title);
                return p;
        }
}


