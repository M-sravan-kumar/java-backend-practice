package galaxy.universe.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode
@Embeddable
public class CountrylanguageId implements Serializable {
    private static final long serialVersionUID = -3758659956172895972L;
    @ColumnDefault("''")
    @Column(name = "CountryCode", nullable = false, length = 3)
    private String countryCode;

    @ColumnDefault("''")
    @Column(name = "Language", nullable = false, length = 30)
    private String language;

}