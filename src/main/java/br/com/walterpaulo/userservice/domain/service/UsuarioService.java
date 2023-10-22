package br.com.walterpaulo.userservice.domain.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.walterpaulo.userservice.domain.entity.Endereco;
import br.com.walterpaulo.userservice.domain.entity.Usuario;
import jakarta.annotation.PostConstruct;

@Service
public class UsuarioService {
    public static List<Usuario> usuarios = new ArrayList<>();

    @PostConstruct
    public void initiateList() {
        Usuario user1 = new Usuario();
        user1.setNome("Walter");
        user1.setCpf("123");
        user1.setEmail("walter@walter.com.br");
        user1.setSobrenome("paulo");
        user1.setDataCadastro(LocalDateTime.now());
        Endereco enderUser1 = new Endereco();
        enderUser1.setRua("rua a");
        enderUser1.setNumero("3");
        enderUser1.setId(1L);
        enderUser1.setBairro("Paraiso");
        List<Endereco> enderecoes1 = new ArrayList<>();
        enderecoes1.add(enderUser1);
        user1.setEnderecos(enderecoes1);
        usuarios.add(user1);

        Usuario user2 = new Usuario();
        user2.setNome("Walter");
        user2.setCpf("567");
        user2.setEmail("walter@walter.com.br");
        user2.setSobrenome("paulo");
        user2.setDataCadastro(LocalDateTime.now());

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

    public List<Usuario> getUsuarios(){
        if(usuarios == null){
            return new ArrayList<Usuario>();
        }
        return usuarios;
    }
}
