package com.greenfoxacademy.workshop.Service;

import com.greenfoxacademy.workshop.Models.MovieResult;
import com.greenfoxacademy.workshop.Repositories.MovieRepository;
import com.greenfoxacademy.workshop.Services.MovieServiceImpl;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.when;

public class MovieServiceImplTest {

    MovieResult movie;

    //Create a mock for MovieRepository
    @Mock
    MovieRepository movieRepository;

    //Inject the mocks as dependencies into MovieServiceImpl
    @InjectMocks
    MovieServiceImpl movieService;
    List<MovieResult> list = null;


    @BeforeEach
    public void setUp(){
        //Initialising the mock object
        MockitoAnnotations.openMocks(this);
        movie = new MovieResult();
        movie.setTitle("Lion King");
        movie.setStatus("Released");
        list = new ArrayList();
        list.add(movie);

    }

    @Test
    public void saveMovieTest() throws Exception {
        when(movieRepository.save(any())).thenReturn(movie);
        MovieResult savedMovie = movieService.saveMovieResult(movie);
        Assert.assertEquals(movie,savedMovie);
        verify(movieRepository,times(1)).save(movie);
    }


    @Test
    public void getAllMoviesTest() {
        movieRepository.save(movie);
        when(movieRepository.findAll()).thenReturn(list);
        List<MovieResult> getList = movieService.getAllMoviesInDatabase();
        Assert.assertEquals(list, getList);
        verify(movieRepository,times(1)).findAll();
    }

    @Test
    public void updateMovieTest() throws Exception {
        movieRepository.save(movie);
        when(movieRepository.save(any())).thenReturn(movie);
        MovieResult updatedMovie = movieService.saveMovieResult(movie);
        Assert.assertEquals(movie,updatedMovie);
    }

    @Test
    public void deleteMovieTest() {
        movieRepository.delete(movie);
        boolean deletedMovie = movieRepository.existsById(1);
        Assert.assertFalse(deletedMovie);
    }
}
