package br.com.cuidebem.models.acompanhante;

import br.com.cuidebem.models.Curso;
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
@Getter
@Setter
@Table(name = "acompanhantes")
public class Acompanhante {
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

    private List<Curso> cursos;
}
