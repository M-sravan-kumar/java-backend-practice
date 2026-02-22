package galaxy.universe.services;

import galaxy.universe.entity.Country;
import galaxy.universe.repositories.CityRepository;
import galaxy.universe.repositories.CountryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CountryService {

    private CountryRepository countryRepository;

    public List<Country> findAllCountries() {
        return countryRepository.findAll();
    }
}
