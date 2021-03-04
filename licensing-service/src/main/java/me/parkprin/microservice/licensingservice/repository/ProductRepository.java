package me.parkprin.microservice.licensingservice.repository;

import me.parkprin.microservice.licensingservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
