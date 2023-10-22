package br.com.walterpaulo.userservice.api.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import br.com.walterpaulo.userservice.api.response.UserResponse;
import br.com.walterpaulo.userservice.domain.entity.User;
import lombok.RequiredArgsConstructor;

@Component
public class UserMapper {
    
    // private final ModelMapper mapper;

    private final ModelMapper mapper;

    public UserMapper(ModelMapper modelMapper) {
        this.mapper = modelMapper;
    }

    public UserResponse toUserResponse(User user) {
        return mapper.map(user, UserResponse.class);
    }

    public List<UserResponse> toUserResponseList(List<User> Users) {
        return Users.stream()
                .map(this::toUserResponse)
                .collect(Collectors.toList());
    }
}
