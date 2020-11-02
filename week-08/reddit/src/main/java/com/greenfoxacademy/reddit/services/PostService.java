package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;

import java.util.List;

public interface PostService {

    public void addPost(Post post);
    public List<Post> findAllPost();
    public void incrementLikes(Long id);
    public void decrementLikes(Long id);
    List<Post> pageablePostByLikes(Integer page);
    int validPage(int nextPage);

}
