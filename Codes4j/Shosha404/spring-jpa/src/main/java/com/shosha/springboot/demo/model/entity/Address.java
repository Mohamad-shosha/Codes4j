package com.shosha.springboot.demo.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@Builder
@Table(name = "address")
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    @Id
    @Column(name = "address_id")
    private String id;

    @Column(name = "street_address")
    private String street;

    private String city;

    private String state;

    @Column(name = "postal_code")
    private String zipCode;

    private String country;

    @OneToMany(mappedBy = "address")
    private List<Instructor> instructors;
}
