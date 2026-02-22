package galaxy.universe.services;

import galaxy.universe.entity.Countrylanguage;
import galaxy.universe.repositories.CountryLanguageRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CountryLanguageService {

    private CountryLanguageRepository countryLanguageRepository;

    public List<Countrylanguage> findAllCountryLanguages() {
        return countryLanguageRepository.findAll();
    }
}
