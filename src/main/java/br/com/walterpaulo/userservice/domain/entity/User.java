package br.com.walterpaulo.userservice.domain.entity;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
// @Entity
// @Table(name = "user")
public class User {

    // @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String sobrenome;
    private String email;
    private String cpf;
    private LocalDateTime dataCadastro;
    // @OneToMany
    // @JoinColumn(name = "paciente_id")
    private List<Endereco> enderecos;
}
