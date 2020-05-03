package com.lsc.learning.rest.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

// JPA = Java Persistence API

@Data
@Entity
public class Lecturer {
    @Id @GeneratedValue // id = PK, AI
    private Integer id; // INT
    private String name; // VARCHAR
    private String address; // VARCHAR
    private Integer age; // INT
}
