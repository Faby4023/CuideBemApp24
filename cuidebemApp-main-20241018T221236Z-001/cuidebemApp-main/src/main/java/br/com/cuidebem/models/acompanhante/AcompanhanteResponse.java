package br.com.cuidebem.models.acompanhante;

import br.com.cuidebem.models.Endereco;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;

import java.time.LocalDate;

public record AcompanhanteResponse(
                                   String cpf,
                                   String nome,
                                   String sobrenome,
                                   LocalDate dataNascimento,
                                   String telefone,
                                   boolean ativo,
                                   String antecedente,
                                   Endereco endereco) {
    public AcompanhanteResponse(Acompanhante acompanhante){
        this(acompanhante.getCpf(), acompanhante.getNome(), acompanhante.getSobreNome(), acompanhante.getDataNascimento(), acompanhante.getTelefone(), acompanhante.isAtivo(), acompanhante.getAntecedentes(), acompanhante.getEndereco());
    }
}
