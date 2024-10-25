package br.com.cuidebem.models.contratante;

import br.com.cuidebem.models.Endereco;
import br.com.cuidebem.models.contratante.Contratante;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;

import java.time.LocalDate;

public record ContratanteRequest(@NotBlank(message = "O nome não pode está vazio!")
                              String cpf,
                              String nome,
                              String sobrenome,
                              @Past
                              LocalDate dataNascimento,
                              String telefone,
                              String grauDeParentesco,
                              String motivoDaContratacao,
                              Endereco endereco) {

    public Contratante toContratante(){
        return new Contratante(cpf(), nome(), sobrenome(), dataNascimento(), telefone(), grauDeParentesco(), motivoDaContratacao(), endereco());
    }
}

