package br.com.cuidebem.models.cuidador;

import br.com.cuidebem.models.Endereco;
import br.com.cuidebem.models.cuidador.Cuidador;

import java.time.LocalDate;

public record CuidadorResponse(
        String cpf,
        String nome,
        String sobrenome,
        LocalDate dataNascimento,
        String telefone,
        boolean ativo,
        String antecedente,
        Endereco endereco) {
    public CuidadorResponse(Cuidador cuidador){
        this(cuidador.getCpf(),cuidador.getNome(), cuidador.getSobreNome(), cuidador.getDataNascimento(), cuidador.getTelefone(), cuidador.isAtivo(), cuidador.getAntecedentes(), cuidador.getEndereco());
    }
}


