package br.com.cuidebem.models.cuidador;
import br.com.cuidebem.models.Endereco;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Table(name = "cuidadores")
public class Cuidador {

    @Id
    private String cpf;
    private String nome;
    private String sobreNome;
    private LocalDate dataNascimento;
    private String telefone;
    private String antecedentes;
    private boolean ativo;
    @Embedded
    private Endereco endereco;


}
