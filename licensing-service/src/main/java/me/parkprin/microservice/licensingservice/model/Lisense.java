package me.parkprin.microservice.licensingservice.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
@Table(name="LISENSE")
public class Lisense {

    @Id
    @GeneratedValue
    @Column(name = "LISENSE_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ORGANIZATION_ID")
    private Organization organization;

    @OneToOne(mappedBy = "lisense")
    private Product product;

    @Column(length = 150, name = "LISENSE_TYPE", nullable = false)
    private String lisenseType;

    @Column(name = "LISENSE_MAX", nullable = false)
    private int lisenseMax;

    @Column(name = "LISENSE_ALLOCATED", nullable = false)
    private int lisenseAllocated;

    @Column(length = 2000, name = "COMMENT")
    private String comment;









}
