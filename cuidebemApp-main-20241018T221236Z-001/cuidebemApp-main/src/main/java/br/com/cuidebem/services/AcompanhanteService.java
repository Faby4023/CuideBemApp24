package br.com.cuidebem.services;

import br.com.cuidebem.models.acompanhante.Acompanhante;
import br.com.cuidebem.models.idoso.Informacao;
import br.com.cuidebem.repositories.AcompanhanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AcompanhanteService {

    @Autowired
    private AcompanhanteRepository acompanhanteRepository;

    public AcompanhanteService(AcompanhanteRepository acompanhanteRepository) {
        this.acompanhanteRepository = acompanhanteRepository;
    }
    public Acompanhante criar(Acompanhante acompanhante) {
        return acompanhanteRepository.save(acompanhante);
    }

    public Acompanhante buscarPorId(String id) {
        return acompanhanteRepository.findById(id).orElse(null);
    }
    public void deletar(String id) {
        acompanhanteRepository.deleteById(id);

    }
    public List<Acompanhante> findAll() {
        return acompanhanteRepository.findAll();
    }
    public Acompanhante atualizar(String id, Acompanhante acompanhante) {
        var acompanhanteAux = acompanhanteRepository.findById(id).orElse(null);
        if (acompanhanteAux != null) {
            if (acompanhante.getTelefone() != null) acompanhanteAux.setTelefone(acompanhante.getTelefone());
            if (acompanhante.getEndereco() != null) acompanhanteAux.setEndereco(acompanhante.getEndereco());
            if (acompanhante.getSobreNome() != null) acompanhanteAux.setSobreNome(acompanhante.getSobreNome());

            return acompanhanteRepository.save(acompanhanteAux);
        }
        return null;
    }
}
