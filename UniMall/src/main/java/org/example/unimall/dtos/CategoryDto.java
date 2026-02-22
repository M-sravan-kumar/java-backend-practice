package org.example.unimall.dtos;

import lombok.Getter;
import lombok.Setter;
import org.example.unimall.model.Category;

@Getter
@Setter
public class CategoryDto {
    String name;

    public Category toCategory(){
        Category cat = new Category();
        cat.setName(name);
        return cat;
    }
}
