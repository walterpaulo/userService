package br.com.walterpaulo.userservice.domain.service;

import org.springframework.stereotype.Service;

import lombok.Getter;

@Service
@Getter
public class HomeService {

    private String mensagem = "UserService - API";
    
    public String getName() {
        return getMensagem();
    }
}
