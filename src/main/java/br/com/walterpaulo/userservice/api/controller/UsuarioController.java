package br.com.walterpaulo.userservice.api.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.walterpaulo.userservice.api.mapper.UserMapper;
import br.com.walterpaulo.userservice.api.response.UsuarioResponse;
import br.com.walterpaulo.userservice.domain.service.UsuarioService;

/**
 * UserController
 */
@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService service;
    @Autowired
    private UserMapper mapper;

    @GetMapping
    public ResponseEntity<List<UsuarioResponse>> listarTodos() {

        List<UsuarioResponse> userResponses = service.getUsuarios()
                .stream()
                .map(mapper::toUserResponse)
                .collect(Collectors.toList());

        return ResponseEntity.status(HttpStatus.OK).body(userResponses);
    }

    

    
}