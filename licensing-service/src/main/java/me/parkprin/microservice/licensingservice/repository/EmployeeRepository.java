package me.parkprin.microservice.licensingservice.repository;

import me.parkprin.microservice.licensingservice.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
