package com.greenfoxacademy.reddit;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.services.PostService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditApplication {

    PostService postService;

    public RedditApplication(PostService postService) {
        this.postService = postService;
        postService.addPost(new Post("Where", "https://www.facebook.com/", 0));
    }

    public static void main(String[] args) {
        SpringApplication.run(RedditApplication.class, args);
    }

}
