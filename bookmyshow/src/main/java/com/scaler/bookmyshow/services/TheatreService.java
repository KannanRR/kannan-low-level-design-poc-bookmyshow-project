package com.scaler.bookmyshow.services;
import com.scaler.bookmyshow.dtos.CreateHallRequest;
import com.scaler.bookmyshow.dtos.CreateTheatreRequest;
import com.scaler.bookmyshow.models.*;
import com.scaler.bookmyshow.repositories.TheatreRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TheatreService {

    private HallService hallService;
    private ShowService showService;
    private CityService cityService;
    private TheatreRepository theatreRepository;
    public Theatre createTheatre(CreateTheatreRequest request) {
        System.out.println(request.getHalls());
        List<Hall> halls = hallService.getHalls(request.getHalls());
        List<Show> shows = showService.getShows(request.getShows());
        City city = cityService.getCity(request.getCityid());

        System.out.println(halls);
        System.out.println(shows);
        return theatreRepository.save(Theatre.builder().city(city).name(request.getName())
                .address(request.getAddress())
                .halls(halls).shows(shows)
                .build());
    }

    public Theatre getTheatre(Long id) {
        return null;
    }
}