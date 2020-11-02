package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.repositories.PostRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public void addPost(Post post) {
        postRepository.save(post);
    }

    @Override
    public List<Post> findAllPost() {
        return postRepository.findAll();
    }

    public void incrementLikes(Long id) {
        Optional<Post> optionalPost = postRepository.findById(id);
        if (optionalPost.isPresent()) {
            Post updatedPost = optionalPost.get();

            updatedPost.setLikes(updatedPost.getLikes() + 1);
            postRepository.save(updatedPost);
        }
    }



    public void decrementLikes(Long id) {
        Optional<Post> optionalPost = postRepository.findById(id);
        if (optionalPost.isPresent()) {
            Post updatedPost = optionalPost.get();
            updatedPost.setLikes(updatedPost.getLikes() - 1);
            postRepository.save(updatedPost);
        }
    }

    public int validPage(int nextPage) {
        if (nextPage <= 0) {
            return 0;
        } else if (nextPage > (int) (postRepository.findAll().size() / 10)) {
            return (int) (postRepository.findAll().size() / 10);
        }
        return nextPage;
    }

    public List<Post> pageablePostByLikes(Integer page) {
        Pageable sortedByLikes = PageRequest.of(page, 10, Sort.by("Likes").descending());
        List<Post> posts = postRepository.findAllByOrderByLikesDesc(sortedByLikes);
        return posts;
    }

}
