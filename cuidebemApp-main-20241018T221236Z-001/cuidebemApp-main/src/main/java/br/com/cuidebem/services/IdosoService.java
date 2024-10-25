package br.com.cuidebem.services;

import br.com.cuidebem.models.idoso.Idoso;
import br.com.cuidebem.repositories.IdosoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IdosoService {
    @Autowired

    private IdosoRepository idosoRepository;

    public IdosoService(IdosoRepository idosoRepository) {
        this.idosoRepository = idosoRepository;
    }
    public Idoso criar(Idoso idoso) {
        return idosoRepository.save(idoso);
    }

    public Idoso buscarPorId(String id) {
        return idosoRepository.findById(id).orElse(null);
    }
    public void deletar(String id) {
        idosoRepository.deleteById(id);
    }
    public List<Idoso> findAll() {
        return idosoRepository.findAll();
    }

    public Idoso atualizar(String id, Idoso idoso) {
        var idosoAux = idosoRepository.findById(id).orElse(null);
        if (idosoAux != null) {
            if (idoso.getTelefone() != null) idosoAux.setTelefone(idoso.getTelefone());
            if (idoso.getEndereco() != null) idosoAux.setEndereco(idoso.getEndereco());
            if (idoso.getMobilidade() != null) idosoAux.setMobilidade(idoso.getMobilidade());
            if (idoso.getInformacao() != null) idosoAux.setInformacao(idoso.getInformacao());

            return idosoRepository.save(idosoAux);
        }
        return null;
    }
}
