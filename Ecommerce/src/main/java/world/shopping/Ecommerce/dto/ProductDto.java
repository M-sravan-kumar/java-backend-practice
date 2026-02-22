package world.shopping.Ecommerce.dto;

import lombok.Getter;
import lombok.Setter;

// in this here we won't be using NoArgsConstuctor_or_AllArgsConstructor why....?
@Getter
@Setter
public class ProductDto {
    private String name;
    private Integer price;
    private Double avgRating;
    private String description;
}
