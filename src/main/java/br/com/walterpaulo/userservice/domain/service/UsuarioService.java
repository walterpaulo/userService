package br.com.walterpaulo.userservice.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.walterpaulo.userservice.domain.entity.Usuario;
import br.com.walterpaulo.userservice.domain.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository persistence;

    public List<Usuario> getUsuarios() {
        return persistence.findAll();
    }
}
