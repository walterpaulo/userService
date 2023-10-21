package br.com.walterpaulo.userservice.api.controller;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
@RequestMapping("/")
public class UserController {

    private final UserService service;
    private final UserMapper mapper;
    private final Logger log = LoggerFactory.getLogger(UserController.class);


    @GetMapping
    public ResponseEntity<List<UserResponse>> listarTodos() {

        log.trace("trace");
        log.debug("debug");
        log.info("info");
        log.warn("warn");
        log.error("error");

        List<UserResponse> userResponses = service.getUsers()
                .stream()
                .map(mapper::toUserResponse)
                .collect(Collectors.toList());

        return ResponseEntity.status(HttpStatus.OK).body(userResponses);
    }

    
}