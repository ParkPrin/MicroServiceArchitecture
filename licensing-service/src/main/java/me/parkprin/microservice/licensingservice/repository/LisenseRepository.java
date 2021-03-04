package me.parkprin.microservice.licensingservice.repository;

import me.parkprin.microservice.licensingservice.model.Lisense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LisenseRepository extends JpaRepository<Lisense, Long> {
}
