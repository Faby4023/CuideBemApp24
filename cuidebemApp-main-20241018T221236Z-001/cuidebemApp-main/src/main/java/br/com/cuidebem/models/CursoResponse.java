package br.com.cuidebem.models;

import br.com.cuidebem.models.curso.Curso;
import br.com.cuidebem.models.curso.Informacao;

import java.time.LocalDate;

public record CursoResponse<Curso>(
        String nomeDoCurso,
        String instituicao,
        String periodo,
        String certificacao,

    public CursoResponse(Curso curso){
        this(curso.getNomeDoCurso(), curso.getInstituicao(), curso.getPeriodo(), curso.getCertificacao());
    }
}
