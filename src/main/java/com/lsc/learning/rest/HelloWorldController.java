package com.lsc.learning.rest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloWorldController {

    private final Map<Integer, Student> STUDENTS = new HashMap() {
        {
            put(1, new Student("John", "Pampang", 10));
            put(2, new Student("Mary", "Sibatua", 11));
            put(3, new Student("Eden", "Borong", 12));
        }
    };

    @GetMapping("/students/{id}")
    public Student getStudent(
        @PathVariable Integer id
    ) {
        return STUDENTS.get(id);
    }

    @GetMapping("/query")
    public String getParam(
        @RequestParam(required = false) Integer size,
        @RequestParam Integer offset
    ) {
        return String.format("Size = %d, Offset = %d", size, offset);
    }

    @GetMapping("/hello")
    public String hello(
        @RequestHeader("X-Auth-Custom") String authCustomHeader
    ) {
        return String.format("Hello world, with X-Auth-Custom: %s", authCustomHeader);
    }

    @PostMapping(value = "/hello")
    public String helloPost(
        @RequestBody Student body
    ) {
        return String.format("Body = %s %s %d", body.getName(), body.getAddress(), body.getAge());
    }
}
