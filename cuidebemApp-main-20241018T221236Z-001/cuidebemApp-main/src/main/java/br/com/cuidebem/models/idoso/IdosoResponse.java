package br.com.cuidebem.models.idoso;


import br.com.cuidebem.models.Endereco;
import br.com.cuidebem.models.idoso.Idoso;

import java.time.LocalDate;

public record IdosoResponse(
        String cpf,
        String nome,
        String sobrenome,
        LocalDate dataNascimento,
        String telefone,
        boolean pcd,
        String mobilidade,
        Informacao informacao,
        Endereco endereco) {
    public IdosoResponse(Idoso idoso){
        this(idoso.getCpf(), idoso.getNome(), idoso.getSobreNome(), idoso.getDataNascimento(), idoso.getTelefone(), idoso.isPcd(),idoso.getMobilidade(), idoso.getInformacao(), idoso.getEndereco());
    }
}

