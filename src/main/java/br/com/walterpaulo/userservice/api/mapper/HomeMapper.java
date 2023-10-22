package br.com.walterpaulo.userservice.api.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import br.com.walterpaulo.userservice.api.response.HomeResponse;

@Component
public class HomeMapper {
    
    // private final ModelMapper mapper;

    private final ModelMapper mapper;

    public HomeMapper(ModelMapper modelMapper) {
        this.mapper = modelMapper;
    }

    public HomeResponse toHomeResponse(String mensagem) {
        HomeResponse response = new HomeResponse();
        response.setMensagem(mensagem);
        return mapper.map(response, HomeResponse.class);
    }
}
