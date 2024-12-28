package com.project.mongodb.services;

import com.project.mongodb.domain.Post;
import com.project.mongodb.domain.User;
import com.project.mongodb.dto.UserDTO;
import com.project.mongodb.repository.PostRepository;
import com.project.mongodb.repository.UserRepository;
import com.project.mongodb.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id){
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}
