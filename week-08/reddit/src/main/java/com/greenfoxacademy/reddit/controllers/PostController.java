package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.services.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping ("/")
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public String home(Model model){
        model.addAttribute("posts", postService.pageablePostByLikes(0));
        model.addAttribute("currentPage", 0);
        return "home";
    }

    @GetMapping("/{currentPage}")
    public String currentPage(Model model, @PathVariable(name = "currentPage") int currentPage) {
        int nextPage = postService.validPage(currentPage);
        if (nextPage != currentPage) {
            return "redirect:/" + nextPage;
        }
        model.addAttribute("posts", postService.pageablePostByLikes(currentPage));
        return "home";
    }

    @GetMapping("/submit")
    public String submitPage(){
        return "submit";
    }

    @PostMapping("/submit")
    public String submitPost(@ModelAttribute Post post){
        postService.addPost(post);
        return "redirect:/";
    }

    @GetMapping("/{currentPage}/{id}/increment")
    public String incrementLikes(@PathVariable Long id, @PathVariable(name = "currentPage") int currentPage){
        postService.incrementLikes(id);
        return "redirect:/" + currentPage;
    }

    @GetMapping("/{currentPage}/{id}/decrement")
    public String decrementLikes(@PathVariable Long id, @PathVariable(name = "currentPage") int currentPage){
        postService.decrementLikes(id);
        return "redirect:/"+ currentPage;
    }

}
