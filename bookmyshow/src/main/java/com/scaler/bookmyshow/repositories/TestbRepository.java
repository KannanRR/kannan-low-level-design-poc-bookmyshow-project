package com.scaler.bookmyshow.repositories;

import com.scaler.bookmyshow.models.Testb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestbRepository extends JpaRepository<Testb, Long> {
}
