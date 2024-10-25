package br.com.cuidebem.controllers;

import br.com.cuidebem.models.Curso;
import br.com.cuidebem.models.curso.Curso;
import br.com.cuidebem.models.curso.CursoRequest;
import br.com.cuidebem.models.curso.CursoResponse;
import br.com.cuidebem.services.CursoService;
import br.com.cuidebem.services.CursoService;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public class CursoController {

    private final CursoService cursoService;

    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    @PostMapping
    public ResponseEntity save(@RequestBody CursoRequest curso){
        var aux = cursoService.criar(curso.toCurso());
        return ResponseEntity.ok(new CursoResponse(aux));
    }

    @GetMapping
    public ResponseEntity findAll(@PageableDefault(size = 10, sort = {"nome"}) Pageable pageable){
        return ResponseEntity.ok(cursoService.findAll());
    }

    @GetMapping("/{cpf}")
    public ResponseEntity findById(@PathVariable String cpf) {
        var curso = cursoService.buscarPorId(id);
        return ResponseEntity.ok(curso);
    }

    @PutMapping("/{id}")
    public ResponseEntity atualizar(@PathVariable Long id,  @RequestBody Curso curso) {
        var cursoAtualizado = cursoService.atualizar(id, curso);
        return ResponseEntity.ok(cursoAtualizado);
    }


    @DeleteMapping("/{cpf}")
    public ResponseEntity deletar(@PathVariable String cpf) {
        cursoService.deletar(cpf);
        return ResponseEntity.noContent().build();
    }

}

