package com.greenfoxacademy.workshop.Models;

import com.greenfoxacademy.workshop.Models.DTOs.GetMovieDTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MovieResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer movieId;
    private String status;
    private String title;
    private double vote_count;

    public MovieResult() {
    }

    public MovieResult(Integer movieId, String status, String title, double vote_count) {
        this.id = null;
        this.movieId = movieId;
        this.status = status;
        this.title = title;
        this.vote_count = vote_count;
    }

    public MovieResult(GetMovieDTO getMovieDTO) {
        this.id = null;
        this.movieId = getMovieDTO.getId();
        this.status = getMovieDTO.getStatus();
        this.title = getMovieDTO.getTitle();
        this.vote_count = getMovieDTO.getVoteCount();
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getVote_count() {
        return vote_count;
    }

    public void setVote_count(float vote_count) {
        this.vote_count = vote_count;
    }
}
