package org.example.unimall.dtos;

import lombok.Getter;
import lombok.Setter;
import org.example.unimall.model.Category;
import org.example.unimall.model.Product;

@Getter
@Setter
public class FakeApiProduct {
      Long  id;
      String title;
      int price;
      String description;
      String category;
      String image;
      RatingDto rating;

    public Product toProduct()
    {
        Product p = new Product();
        p.setId(id);
        p.setDescription(description);
        p.setImage(image);
        p.setPrice(price);
        p.setTitle(title);
        Category cat = new Category();
        cat.setName(category);
        p.setCategory(cat);
        return p;
    }

}
