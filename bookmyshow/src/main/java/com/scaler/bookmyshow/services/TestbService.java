package com.scaler.bookmyshow.services;

import com.scaler.bookmyshow.dtos.CreateTestbRequest;
import com.scaler.bookmyshow.exceptions.CityNotFoundException;
import com.scaler.bookmyshow.models.Testa;
import com.scaler.bookmyshow.models.Testb;
import com.scaler.bookmyshow.repositories.TestaRepository;
import com.scaler.bookmyshow.repositories.TestbRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TestbService {
    private TestbRepository testbRepository;
    private TestaService testaService;
    public Testb createTestb(CreateTestbRequest request) {

        Testa testa = testaService.getTesta(request.getTestaid());
        Testb testb = testbRepository.save(Testb.builder().bname(request.getBname())
                .testa(testa).build());

        return getTestb(testb.getId());
    }

    public Testb getTestb(Long id) {
        return testbRepository.findById(id)
                .orElseThrow(() -> new CityNotFoundException(id));
    }

    public List<Testb> getallTestb() {
        return testbRepository.findAll();
    }
}
