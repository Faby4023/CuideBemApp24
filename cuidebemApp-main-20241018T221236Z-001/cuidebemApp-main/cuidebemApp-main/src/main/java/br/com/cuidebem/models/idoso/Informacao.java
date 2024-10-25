package br.com.cuidebem.models.idoso;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class Informacao {
    @Id
    @GeneratedValue
    private Long id;
    private String titulo;
    private String descricao;
    private String tipo;

}
