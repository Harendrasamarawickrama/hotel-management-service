package com.ch.hotel_system.hotel_management_service_api.entity;

import jakarta.persistence.*;

@Entity
@Table(name="facility")
public class Facility {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//id is auto incremented
    private Long roomId;

    @Column(name = "name",nullable = false,length = 100)
    private String name;
}
