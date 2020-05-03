package com.lsc.learning.rest.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LecturerResponse {
    private String name;
    private String address;
    private Integer age;

    public LecturerResponse(Lecturer lecturer) {
        this.name = lecturer.getName();
        this.address = lecturer.getAddress();
        this.age = lecturer.getAge();
    }
}
