package com.aamir.spring.security.entity;

import lombok.Data;

import jakarta.persistence.*;


@Data
@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
}
