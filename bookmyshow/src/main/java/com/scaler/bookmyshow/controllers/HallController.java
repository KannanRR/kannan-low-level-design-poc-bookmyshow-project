package com.scaler.bookmyshow.controllers;

import com.scaler.bookmyshow.dtos.CreateHallRequest;
import com.scaler.bookmyshow.models.City;
import com.scaler.bookmyshow.models.Hall;
import com.scaler.bookmyshow.services.HallService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hall")
@AllArgsConstructor
public class HallController {

    private HallService hallService;
    @PostMapping
    public Hall createHall(@RequestBody CreateHallRequest request) {
        //System.out.println(request.getName());
        //System.out.println(request.getFeatures());
        //System.out.println(request.getSeatRanges());
        return hallService.createHall(request);
    }

    @GetMapping("/{id}")
    public Hall getHall(@PathVariable Long id) {
        return hallService.getHall(id);
    }
}
