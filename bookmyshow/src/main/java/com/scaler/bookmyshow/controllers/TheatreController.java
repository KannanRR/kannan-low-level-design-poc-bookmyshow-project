package com.scaler.bookmyshow.controllers;

import com.scaler.bookmyshow.dtos.CreateTheatreRequest;
import com.scaler.bookmyshow.models.Theatre;
import com.scaler.bookmyshow.services.TheatreService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/theatre")
@AllArgsConstructor
public class TheatreController {

    private TheatreService theatreService;
    @PostMapping
    public Theatre createTheatre(@RequestBody CreateTheatreRequest request) {
        return theatreService.createTheatre(request);
    }
}
