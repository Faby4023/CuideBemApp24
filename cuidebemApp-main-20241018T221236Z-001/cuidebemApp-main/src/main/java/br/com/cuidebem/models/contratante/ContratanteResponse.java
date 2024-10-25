package br.com.cuidebem.models.contratante;

import br.com.cuidebem.models.Endereco;
import br.com.cuidebem.models.contratante.Contratante;

import java.time.LocalDate;

public record ContratanteResponse(
        String cpf,
        String nome,
        String sobrenome,
        LocalDate dataNascimento,
        String telefone,
        String grauDeParentesco,
        String motivoDaContratacao,
        Endereco endereco) {
    public ContratanteResponse(Contratante contratante){
        this(contratante.getCpf(), contratante.getNome(), contratante.getSobreNome(), contratante.getDataNascimento(), contratante.getTelefone(), contratante.getGrauDeParentesco(), contratante.getMotivoDaContratacao(), contratante.getEndereco());
    }
}
