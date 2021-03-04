package me.parkprin.microservice.licensingservice.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
@Table(name="PRODUCT")
public class Product {

    @Id
    @GeneratedValue
    @Column(name = "PRODUCT_ID")
    private Long id;

    @Column(name = "PRODUCT_NAME", nullable = false)
    private String productName;

    @OneToOne(mappedBy = "product")
    private Lisense lisense;

    @Builder
    public Product(String productName){
        this.productName = productName;
    }

    public void setLisense(Lisense lisense){
        this.lisense = lisense;
    }
}
