package com.baeldung.springboot.validacao.service;

import com.baeldung.springboot.validacao.domain.User;
import com.baeldung.springboot.validacao.repository.UserRepository;
import com.baeldung.springboot.validacao.requests.UserPostRequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> listAll() {
        return (List<User>) userRepository.findAll();
    }

    public User save(UserPostRequestBody userPostRequestBody){
        return userRepository.save(userPostRequestBody.build());
    }

}
