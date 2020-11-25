package com.greenfoxacademy.workshop.Repositories;

import com.greenfoxacademy.workshop.Models.MovieResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<MovieResult,Integer> {
}

