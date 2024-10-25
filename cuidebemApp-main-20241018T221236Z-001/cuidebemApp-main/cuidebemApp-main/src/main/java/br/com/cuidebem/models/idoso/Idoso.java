package br.com.cuidebem.models.idoso;

import br.com.cuidebem.models.Endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Table(name = "idosos")
public class Idoso {
    @Id
    private String cpf;
    private String nome;
    private String sobreNome;
    private String dataNascimento;
    private String telefone;
    private boolean pcd;
    private String mobilidade;
    @OneToMany
    private Informacao informacao;
    @Embedded
    private Endereco endereco;
}
