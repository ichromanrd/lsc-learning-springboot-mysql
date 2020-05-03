package com.lsc.learning.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lsc.learning.rest.entity.Lecturer;

public interface LecturerRepository extends JpaRepository<Lecturer, Integer> {

}
