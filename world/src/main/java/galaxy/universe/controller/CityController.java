package galaxy.universe.controller;

import galaxy.universe.entity.City;
import galaxy.universe.services.CityService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/world")
public class CityController {

    private CityService cityService;

    @GetMapping("/cities")
    public List<City> getAllCities() {
        return cityService.findAllCities();
    }

}
