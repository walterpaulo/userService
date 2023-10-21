package br.com.walterpaulo.userservice.domain.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.walterpaulo.userservice.domain.entity.Endereco;
import br.com.walterpaulo.userservice.domain.entity.User;
import jakarta.annotation.PostConstruct;

@Service
public class UserService {
    public static List<User> usuarios = new ArrayList<>();

    @PostConstruct
    public void initiateList() {
        User user1 = new User();
        user1.setNome("Walter");
        user1.setCpf("123");
        Endereco enderUser1 = new Endereco();
        enderUser1.setRua("rua a");
        enderUser1.setNumero("3");
        enderUser1.setId(1L);
        enderUser1.setBairro("Paraiso");
        List<Endereco> enderecoes1 = new ArrayList<>();
        enderecoes1.add(enderUser1);
        user1.setEnderecos(enderecoes1);
        usuarios.add(user1);

        User user2 = new User();
        user2.setNome("Walter");
        user2.setCpf("567");
        Endereco enderUser2 = new Endereco();
        enderUser2.setRua("rua a");
        enderUser2.setNumero("3");
        enderUser2.setId(1L);
        enderUser2.setBairro("Paraiso");
        List<Endereco> enderecoes2 = new ArrayList<>();
        enderecoes2.add(enderUser2);
        user2.setEnderecos(enderecoes2);
        usuarios.add(user2);
        
    }

    public List<User> getUsers(){
        return usuarios;
    }
}
