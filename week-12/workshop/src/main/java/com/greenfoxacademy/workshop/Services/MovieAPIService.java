package com.greenfoxacademy.workshop.Services;

import com.greenfoxacademy.workshop.Models.DTOs.GetMovieDTO;
import com.greenfoxacademy.workshop.Models.MovieResults;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

@Service
public interface MovieAPIService {

    @GET("/3/movie/{movie_id}")
    Call<GetMovieDTO> getMovie(@Path("movie_id") Integer movieId,
                               @Query("api_key") String apiKey,
                               @Query("language") String language);

    @GET("/3/movie/{category}")
    Call<MovieResults> listOfMovies(@Path("category") String category,
                                    @Query("api_key") String apiKey,
                                    @Query("language") String language,
                                    @Query("page") int page);
}
