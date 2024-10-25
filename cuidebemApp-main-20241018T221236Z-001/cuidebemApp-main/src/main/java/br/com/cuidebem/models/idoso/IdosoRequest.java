package br.com.cuidebem.models.idoso;


import br.com.cuidebem.models.Endereco;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;

import java.time.LocalDate;

public record IdosoRequest(@NotBlank(message = "O nome não pode está vazio!")
                           String cpf,
                           String nome,
                           String sobrenome,
                           @Past
                           LocalDate dataNascimento,
                           String telefone,
                           boolean pcd,
                           String mobilidade,
                           Informacao informacao,
                           Endereco endereco) {

        public Idoso toIdoso(){
            return new Idoso(cpf(),nome(),sobrenome(), dataNascimento(), telefone(), pcd(), mobilidade(), informacao(), endereco());
        }
    }

