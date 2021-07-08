package com.tts.postapi.service;

import com.tts.postapi.model.Post;

import java.util.List;

public interface PostService {

    public Post makePost(Post post);

    public Post getPost(Long id);
    public List<Post> getAllPosts();

}
