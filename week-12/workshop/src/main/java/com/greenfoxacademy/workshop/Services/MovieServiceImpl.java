package com.greenfoxacademy.workshop.Services;

import com.greenfoxacademy.workshop.Models.DTOs.GetMovieDTO;
import com.greenfoxacademy.workshop.Models.MovieResult;
import com.greenfoxacademy.workshop.Models.MovieResults;
import com.greenfoxacademy.workshop.Repositories.MovieRepository;
import okhttp3.OkHttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.List;

@Service
public class MovieServiceImpl{

    private final MovieRepository movieRepository;

    @Autowired
    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public static String baseUrl = "https://api.themoviedb.org";

    OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .client(httpClient.build())
            .build();

    public MovieResults getMovieByCategory(String category, String apiKey, String language, int page) throws IOException {

        MovieAPIService movieAPIService = retrofit.create(MovieAPIService.class);

        Call<MovieResults> call = movieAPIService.listOfMovies(category, apiKey, language, page);

        Response<MovieResults> resultsResponse = call.execute();
        return resultsResponse.body();
    }

    public GetMovieDTO getMovie(Integer movieId, String apiKey, String language) throws IOException {
        MovieAPIService movieAPIService = retrofit.create(MovieAPIService.class);

        Call<GetMovieDTO> call = movieAPIService.getMovie(movieId, apiKey, language);

        Response<GetMovieDTO> resultsResponse = call.execute();
        assert resultsResponse.body() != null;
        MovieResult movieResult = new MovieResult(resultsResponse.body());
        movieRepository.save(movieResult);
        return resultsResponse.body();
    }

    public List<MovieResult> getAllMoviesInDatabase() {
        return movieRepository.findAll();
    }
}
