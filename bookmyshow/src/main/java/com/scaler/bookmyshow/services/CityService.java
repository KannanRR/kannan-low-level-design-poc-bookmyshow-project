package com.scaler.bookmyshow.services;

import com.scaler.bookmyshow.exceptions.CityNotFoundException;
import com.scaler.bookmyshow.exceptions.CustomerNotFoundException;
import com.scaler.bookmyshow.models.City;
import com.scaler.bookmyshow.repositories.CityRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CityService {
    private CityRepository cityRepository;
    public City createCity(City request) {
        return cityRepository.save(request);
    }

    public City getCity(Long id) {
        return cityRepository.findById(id)
                .orElseThrow(() -> new CityNotFoundException(id));
    }

    public List<City> getallCity() {
        return cityRepository.findAll();
    }
}
