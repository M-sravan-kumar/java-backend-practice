package galaxy.universe.repositories;

import galaxy.universe.entity.Countrylanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryLanguageRepository extends JpaRepository<Countrylanguage, Integer> {
}
