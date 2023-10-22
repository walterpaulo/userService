package br.com.walterpaulo.userservice.domain.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.walterpaulo.userservice.domain.entity.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

    @Query("SELECT u FROM Usuario u LEFT JOIN FETCH u.enderecos WHERE u.id = ?1")
    Optional<Usuario> findUsuarioWithEnderecosById(Long userId);
    
}
