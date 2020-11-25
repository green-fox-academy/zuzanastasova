package com.greenfoxacademy.workshop.Controllers;

import com.greenfoxacademy.workshop.Models.DTOs.AuthenticationRequestDTO;
import com.greenfoxacademy.workshop.Models.DTOs.AuthenticationResponseDTO;
import com.greenfoxacademy.workshop.Models.DTOs.GetMovieDTO;
import com.greenfoxacademy.workshop.Models.DTOs.RegisterDTO;
import com.greenfoxacademy.workshop.Models.MovieResult;
import com.greenfoxacademy.workshop.Models.MovieResults;
import com.greenfoxacademy.workshop.Models.MyUser;
import com.greenfoxacademy.workshop.Services.MovieServiceImpl;
import com.greenfoxacademy.workshop.Services.MyUserDetailsService;
import com.greenfoxacademy.workshop.Services.MyUserService;
import com.greenfoxacademy.workshop.Util.JwtUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
public class MainController {


    private final MovieServiceImpl movieService;
    private final MyUserDetailsService myUserDetailsService;
    private final JwtUtil jwtTokenUtil;
    private final MyUserService myUserService;

    public MainController(MovieServiceImpl movieService, MyUserDetailsService myUserDetailsService, JwtUtil jwtTokenUtil, MyUserService myUserService) {
        this.movieService = movieService;
        this.myUserDetailsService = myUserDetailsService;
        this.jwtTokenUtil = jwtTokenUtil;
        this.myUserService = myUserService;
    }

    @GetMapping ("/hello")
    public String helloWorld(){
        return "Hello world!";
    }

    @PostMapping("/authenticate")
    public ResponseEntity<Object> createAuthenticationToken(@RequestBody AuthenticationRequestDTO authenticationRequestDTO) {

        final UserDetails userDetails = myUserDetailsService.loadUserByUsername(authenticationRequestDTO.getUsername());

        final String jwt = jwtTokenUtil.generateToken(userDetails);

        return ResponseEntity.ok(new AuthenticationResponseDTO(jwt));
    }

    @PostMapping("/register")
    public ResponseEntity<Object> registerUser(@RequestBody RegisterDTO registerDTO){
        return myUserService.registerUser(registerDTO);
    }

    @GetMapping("/movies/{category}")
    public MovieResults getAll(@PathVariable("category") String category,
                               @RequestParam("api_key") String apiKey,
                               @RequestParam("language") String language,
                               @RequestParam("page") int page) throws Exception {

        return movieService.getMovieByCategory(category, apiKey, language, page);
    }

    @GetMapping("/movie/{movie_id}")
    public GetMovieDTO getMovie(@PathVariable("movie_id") Integer movieId,
                                @RequestParam("api_key") String apiKey,
                                @RequestParam("language") String language) throws IOException {
        return movieService.getMovie(movieId,apiKey, language);
    }

    @GetMapping("/all/movies")
    public List<MovieResult> getMovie() {
        return movieService.getAllMoviesInDatabase();
    }

}
