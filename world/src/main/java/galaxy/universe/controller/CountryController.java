package galaxy.universe.controller;

import galaxy.universe.entity.Country;
import galaxy.universe.services.CountryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/world")
public class CountryController {

    private CountryService countryService;

    @GetMapping("/countries")
    public List<Country> getAllCountries() {
        return countryService.findAllCountries();
    }
}
