package me.parkprin.microservice.licensingservice.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Getter
@NoArgsConstructor
@Entity
@Table(name="ORGANIZATION")
public class Organization {

    @Id
    @GeneratedValue
    @Column(name = "ORGANIZATION_ID")
    private Long id;

    @OneToMany(mappedBy = "organization")
    private List<Employee> employees;

    @ManyToOne
    @JoinColumn(name = "EMPLOYEE_ID")
    @Column(name = "CONTACT_EMPLOYEE_ID")
    private Employee contactEmployeeId;

    @Column(length = 150, name = "ORGANIZATION_NAME", nullable = false)
    private String organizationName;

}
