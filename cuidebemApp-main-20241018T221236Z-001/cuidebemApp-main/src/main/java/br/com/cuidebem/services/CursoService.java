package br.com.cuidebem.services;

import br.com.cuidebem.models.Curso;
import br.com.cuidebem.models.acompanhante.Acompanhante;
import br.com.cuidebem.models.cuidador.Cuidador;
import br.com.cuidebem.repositories.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    public CursoService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }
    public Curso criar(Curso curso) {
        return cursoRepository.save(curso);
    }

    public Curso buscarPorId(Long id) {
        return cursoRepository.findById(id).orElse(null);
    }
    public void deletar(Long id) {
        cursoRepository.deleteById(id);
    }
    public List<Curso> findAll() {
        return cursoRepository.findAll();
    }
}
