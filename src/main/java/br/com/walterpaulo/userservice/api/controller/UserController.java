package br.com.walterpaulo.userservice.api.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.walterpaulo.userservice.api.mapper.UserMapper;
import br.com.walterpaulo.userservice.api.response.UserResponse;
import br.com.walterpaulo.userservice.domain.service.UserService;

/**
 * UserController
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService service;
    @Autowired
    private UserMapper mapper;

    @GetMapping
    public ResponseEntity<List<UserResponse>> listarTodos() {

        List<UserResponse> userResponses = service.getUsers()
                .stream()
                .map(mapper::toUserResponse)
                .collect(Collectors.toList());

        return ResponseEntity.status(HttpStatus.OK).body(userResponses);
    }

    

    
}