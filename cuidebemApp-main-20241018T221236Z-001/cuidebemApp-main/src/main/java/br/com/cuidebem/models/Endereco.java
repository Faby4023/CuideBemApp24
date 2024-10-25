package br.com.cuidebem.models;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class Endereco {
    private String rua;
    private  String numero;
    private  String bairro;
    private String cidade;
    private String cep;
    private String estado;
    

}
