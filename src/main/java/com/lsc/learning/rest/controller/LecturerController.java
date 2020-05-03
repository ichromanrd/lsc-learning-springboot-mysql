package com.lsc.learning.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lsc.learning.rest.entity.Lecturer;
import com.lsc.learning.rest.entity.LecturerResponse;
import com.lsc.learning.rest.repository.LecturerRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/lecturer")
public class LecturerController {

    private final LecturerRepository repository;

    @PostMapping
    public Lecturer save(
        @RequestBody Lecturer lecturer
    ) {
        return repository.save(lecturer); // insert into lecturer (f1, f2, f3) values (?, ?, ?)
    }

    @GetMapping(value = "/{id}")
    public LecturerResponse getLecturerById(
        @PathVariable Integer id
    ) {
        return new LecturerResponse(repository.getOne(id)); // select * from lecturer where id = ?
    }
}
