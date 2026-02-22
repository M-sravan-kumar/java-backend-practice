package galaxy.universe.repositories;

import galaxy.universe.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CityRepository extends JpaRepository<City, Integer> {
}
