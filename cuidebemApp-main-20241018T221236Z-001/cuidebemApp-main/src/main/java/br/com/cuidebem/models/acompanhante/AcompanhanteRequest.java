package br.com.cuidebem.models.acompanhante;

import br.com.cuidebem.models.Endereco;
import br.com.cuidebem.models.acompanhante.Acompanhante;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;

import java.time.LocalDate;

public record AcompanhanteRequest(@NotBlank(message = "O nome não pode está vazio!")
                               String cpf,
                               String nome,
                               String sobrenome,

                               @Past
                               LocalDate dataNascimento,
                               String telefone,
                               String antecedentes,
                               boolean ativo,
                               Endereco endereco) {

        public Acompanhante toAcompanhante(){
            return new Acompanhante(cpf(),nome(),sobrenome(), dataNascimento(), telefone(), antecedentes(), ativo(), endereco(), null);
        }
    }



