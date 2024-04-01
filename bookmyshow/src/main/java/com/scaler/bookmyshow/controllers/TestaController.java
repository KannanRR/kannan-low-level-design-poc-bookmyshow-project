package com.scaler.bookmyshow.controllers;

import com.scaler.bookmyshow.models.City;
import com.scaler.bookmyshow.models.Testa;
import com.scaler.bookmyshow.services.CityService;
import com.scaler.bookmyshow.services.TestaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/testa")
@AllArgsConstructor
public class TestaController {

    private TestaService testaService;

    @PostMapping
    public Testa createTesta(@RequestBody Testa request) {
        return testaService.createTesta(request);
    }

    @GetMapping("/{id}")
    public Testa getTesta(@PathVariable Long id) {
        return testaService.getTesta(id);
    }

    @GetMapping("/all")
    public List<Testa> getallTesta() {
        return testaService.getallTesta();
    }
}
