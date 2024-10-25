package br.com.cuidebem.services;

import br.com.cuidebem.models.cuidador.Cuidador;
import br.com.cuidebem.repositories.CuidadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CuidadorService {
    @Autowired

    private CuidadorRepository cuidadorRepository;

    public CuidadorService(CuidadorRepository cuidadorRepository) {
        this.cuidadorRepository = cuidadorRepository;
    }

    public Cuidador criar(Cuidador cuidador) {
        return cuidadorRepository.save(cuidador);
    }

    public Cuidador buscarPorId(String id) {
        return cuidadorRepository.findById(id).orElse(null);
    }

    public void deletar(String id) {
        cuidadorRepository.deleteById(id);
    }

    public List<Cuidador> findAll() {
        return cuidadorRepository.findAll();
    }

    public Cuidador atualizar(String id, Cuidador cuidador) {
        var cuidadorAux = cuidadorRepository.findById(id).orElse(null);
        if (cuidadorAux != null) {
            if (cuidador.getTelefone() != null) cuidadorAux.setTelefone(cuidador.getTelefone());
            if (cuidador.getEndereco() != null) cuidadorAux.setEndereco(cuidador.getEndereco());
            if (cuidador.getSobreNome() != null) cuidadorAux.setSobreNome(cuidador.getSobreNome());


            return cuidadorRepository.save(cuidadorAux);
        }
        return null;
    }
}
