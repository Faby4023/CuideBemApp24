package br.com.cuidebem.controllers;

import br.com.cuidebem.models.Curso;
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
        var cuidador = cursoService.buscarPorId(cpf);
        return ResponseEntity.ok(curso);
    }

    @PutMapping("/{id}")
    public ResponseEntity atualizar(@PathVariable String id,  @RequestBody Curso curso) {
        var cuidadorAtualizado = cursoService.atualizar(id, curso);
        return ResponseEntity.ok(cursoAtualizado);
    }


    @DeleteMapping("/{cpf}")
    public ResponseEntity deletar(@PathVariable String cpf) {
        cursoService.deletar(cpf);
        return ResponseEntity.noContent().build();
    }

}