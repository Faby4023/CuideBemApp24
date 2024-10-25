package br.com.cuidebem.models.cuidador;

import br.com.cuidebem.models.Endereco;
import br.com.cuidebem.models.cuidador.Cuidador;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;

import java.time.LocalDate;

public record CuidadorRequest(@NotBlank(message = "O nome não pode está vazio!")
                           String cpf,
                           String nome,
                           String sobrenome,
                              @Past
                           LocalDate dataNascimento,
                           String telefone,
                           boolean ativo,
                           String antecedente,
                           Endereco endereco) {

    public Cuidador toCuidador(){
        return new Cuidador(cpf(), nome(), sobrenome(), dataNascimento(), telefone(), antecedente(), ativo(), endereco());
    }
}


