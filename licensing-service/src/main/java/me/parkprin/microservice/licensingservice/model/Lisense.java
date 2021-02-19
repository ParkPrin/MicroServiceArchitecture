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



    public enum LisenseType {
        ORDER, CANCEL
    }
}
