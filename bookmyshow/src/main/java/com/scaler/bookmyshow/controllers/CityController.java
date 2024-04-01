package com.scaler.bookmyshow.controllers;

import com.scaler.bookmyshow.models.City;
import com.scaler.bookmyshow.services.CityService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/city")
@AllArgsConstructor
public class CityController {

    private CityService cityService;

    @PostMapping
    public City createCity(@RequestBody City request) {
        return cityService.createCity(request);
    }

    @GetMapping("/{id}")
    public City getCity(@PathVariable Long id) {
        return cityService.getCity(id);
    }

    @GetMapping("/all")
    public List<City> getallCity() {
        return cityService.getallCity();
    }
}
