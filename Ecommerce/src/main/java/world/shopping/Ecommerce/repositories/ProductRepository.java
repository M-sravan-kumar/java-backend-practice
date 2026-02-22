package world.shopping.Ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import world.shopping.Ecommerce.schema.Product;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
