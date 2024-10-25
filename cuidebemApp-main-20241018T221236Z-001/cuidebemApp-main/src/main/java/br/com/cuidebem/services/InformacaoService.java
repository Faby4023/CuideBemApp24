package br.com.cuidebem.services;

import br.com.cuidebem.models.idoso.Informacao;
import br.com.cuidebem.repositories.InformacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InformacaoService {

    private InformacaoRepository informacaoRepository;

    public InformacaoService(InformacaoRepository informacaoRepository) {
        this.informacaoRepository = informacaoRepository;
    }

    public Informacao save(Informacao informacao) {
        return informacaoRepository.save(informacao);
    }

    public List<Informacao> findAll() {
        return informacaoRepository.findAll();
    }

    public Informacao find(Long id) {
        var aux = informacaoRepository.findById(id);
        if (aux.isEmpty())
            throw new RuntimeException("Não existe essa informação");
        return aux.get();
    }

    public Informacao Atualizar(Long id, Informacao informacao) {
        var informacaoAux = informacaoRepository.findById(id).orElse(null);
        if (informacaoAux != null) {
            if (informacao.getTitulo() != null) informacaoAux.setTitulo(informacao.getTitulo());
            if (informacao.getDescricao() != null) informacaoAux.setDescricao(informacao.getDescricao());
            if (informacao.getTipo() != null) informacaoAux.setTipo(informacao.getTipo());

            return informacaoRepository.save(informacaoAux);
        }
        return null;
    }

    public void deletar(Long id) {
        informacaoRepository.deleteById(id);
    }

    public Informacao buscarPorId(Long id) {
        return informacaoRepository.findById(id).orElse(null);
    }
}
