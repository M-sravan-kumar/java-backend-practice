package galaxy.universe.services;

import galaxy.universe.entity.City;
import galaxy.universe.repositories.CityRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CityService {

    private CityRepository cityRepository;

    public List<City> findAllCities() {
        return cityRepository.findAll();
    }
}
