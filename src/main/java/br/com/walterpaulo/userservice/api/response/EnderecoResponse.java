package br.com.walterpaulo.userservice.api.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EnderecoResponse {
    private Long id;
    private String rua;
    private String numero;
    private String complemento;
    private String bairro;

}
