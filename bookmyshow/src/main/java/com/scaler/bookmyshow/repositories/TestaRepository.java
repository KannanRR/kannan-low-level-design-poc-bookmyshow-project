package com.scaler.bookmyshow.repositories;

import com.scaler.bookmyshow.models.City;
import com.scaler.bookmyshow.models.Testa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestaRepository extends JpaRepository<Testa, Long> {
}
