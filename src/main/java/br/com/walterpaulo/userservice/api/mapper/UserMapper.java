package br.com.walterpaulo.userservice.api.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import br.com.walterpaulo.userservice.api.response.UsuarioResponse;
import br.com.walterpaulo.userservice.domain.entity.Usuario;
import lombok.RequiredArgsConstructor;

@Component
public class UserMapper {
    
    // private final ModelMapper mapper;

    private final ModelMapper mapper;

    public UserMapper(ModelMapper modelMapper) {
        this.mapper = modelMapper;
    }

    public UsuarioResponse toUserResponse(Usuario user) {
        return mapper.map(user, UsuarioResponse.class);
    }

    public List<UsuarioResponse> toUserResponseList(List<Usuario> Users) {
        return Users.stream()
                .map(this::toUserResponse)
                .collect(Collectors.toList());
    }
}
