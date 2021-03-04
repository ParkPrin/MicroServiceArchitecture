package me.parkprin.microservice.licensingservice.repository;

import me.parkprin.microservice.licensingservice.model.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationRepository extends JpaRepository<Organization, Long> {
}
