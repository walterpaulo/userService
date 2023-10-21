package br.com.walterpaulo.userservice.domain.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
// @Entity
// @Table(name = "endereco")
public class Endereco {

    // @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String rua;
    private String numero;
    private String complemento;
    private String bairro;
}
