package com.hotel.hotelManagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class HotelRoom {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(unique = true)
    private Integer roomNo;

    @Column
    private Double roomPrice;

    @Column
    private Boolean roomStatus;

    @Column
    @Enumerated(EnumType.STRING)
    private Type roomType;

}
