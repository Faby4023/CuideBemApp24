package br.com.cuidebem.services;

import br.com.cuidebem.models.idoso.Informacao;
import br.com.cuidebem.repositories.InformacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InformacaoService {
    @Autowired

    private InformacaoRepository informacaoRepository;

    public Informacao criar(Informacao informacao) {
        return informacaoRepository.save(informacao);


    }

    public Informacao buscarPorId(Long id) {
        return informacaoRepository.findById(id).get();

    }

    public List<Informacao> findAll() {
        return informacaoRepository.findAll();
    }

    public void atualizar(Long id, Informacao informacao) {
        var informacaoAux = informacaoRepository.findById(id).get();
        if (informacaoAux != null) {
            if (informacao.getTitulo() != null) informacaoAux.setTitulo(informacao.getTitulo());

        }


    }
}







    }
