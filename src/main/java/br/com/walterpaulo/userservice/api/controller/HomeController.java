package br.com.walterpaulo.userservice.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.walterpaulo.userservice.api.mapper.HomeMapper;
import br.com.walterpaulo.userservice.api.response.HomeResponse;
import br.com.walterpaulo.userservice.domain.service.HomeService;

@RestController
@RequestMapping("/")
public class HomeController {
    
    @Autowired
    private HomeService service;
    @Autowired
    private HomeMapper mapper;

    @GetMapping
    public HomeResponse name() {
        return mapper.toHomeResponse(service.getName());
    }
}
