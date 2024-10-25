package br.com.cuidebem.models.contratante;
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
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Table(name = "contratantes")
public class Contratante {
    @Id
    private String cpf;
    private String nome;
    private String sobreNome;
    private LocalDate dataNascimento;
    private String telefone;
    private String grauDeParentesco;
    private String motivoDaContratacao;
    @Embedded
    private Endereco endereco;

}
