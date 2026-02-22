package org.example.unimall.model;

//import jakarta.persistence.Entity;
//import jakarta.persistence.ManyToOne;
import jakarta.persistence.*;
import lombok.*;
//import org.springframework.data.annotation.Id;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Product extends BaseModel{

    private String title;
    private int price;
    private String description;
    private String image;
    @ManyToOne(cascade = {CascadeType.PERSIST})
    private Category category;

}
