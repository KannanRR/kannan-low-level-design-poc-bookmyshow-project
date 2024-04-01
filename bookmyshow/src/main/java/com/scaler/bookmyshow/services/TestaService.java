package com.scaler.bookmyshow.services;

import com.scaler.bookmyshow.exceptions.CityNotFoundException;
import com.scaler.bookmyshow.models.Testa;
import com.scaler.bookmyshow.repositories.TestaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TestaService {
    private TestaRepository testaRepository;
    public Testa createTesta(Testa request) {
        return testaRepository.save(request);
    }

    public Testa getTesta(Long id) {
        return testaRepository.findById(id)
                .orElseThrow(() -> new CityNotFoundException(id));
    }

    public List<Testa> getallTesta() {
        return testaRepository.findAll();
    }
}
