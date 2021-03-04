package me.parkprin.microservice.licensingservice.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
@Table(name="EMPLOYEE")
public class Employee {

    @Id
    @GeneratedValue
    @Column(name = "EMPLOYEE_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ORGANIZATION_ID")
    private Organization organization;

    @Column(length = 150, name = "EMPLOYEE_NAME", nullable = false)
    private String employeeName;

    @Column(length = 100, name = "EMPLOYEE_EMAIL", nullable = false)
    private String employeeEmail;

    @Column(length = 11, name = "EMPLOYEE_PHONE", nullable = false)
    private String employeePhone;

}
