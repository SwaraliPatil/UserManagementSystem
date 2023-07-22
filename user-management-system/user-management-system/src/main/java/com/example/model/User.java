package com.example.model;

import lombok.Data;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
@Data
public class User {

    @Id
    @Generated(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String name;
    private String userName;
    private String address;
    private String phoneNumber;
}
