package br.com.cuidebem.models;

import br.com.cuidebem.models.curso.Curso;
import br.com.cuidebem.models.curso.Informacao;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;

import java.time.LocalDate;

public record CursoRequest(@NotBlank(message = "O nome não pode está vazio!")
                           String nomeDoCurso,
                           String instituicao,
                           String periodo,
                           String certificacao,


    public Curso toCurso(){
        return new Curso(nomeDoCurso(),instituicao(), periodo(), certificacao());
    }
