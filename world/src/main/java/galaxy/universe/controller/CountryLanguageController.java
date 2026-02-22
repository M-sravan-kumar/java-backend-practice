package galaxy.universe.controller;

import galaxy.universe.entity.Countrylanguage;
import galaxy.universe.services.CountryLanguageService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/world")
public class CountryLanguageController {

    private CountryLanguageService countryLanguageService;

    @GetMapping("/countrylanguages")
    public List<Countrylanguage> getAllCountryLanguages() {
        return countryLanguageService.findAllCountryLanguages();
    }
}
