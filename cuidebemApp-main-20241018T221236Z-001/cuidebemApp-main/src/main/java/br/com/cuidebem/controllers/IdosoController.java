package br.com.cuidebem.controllers;

import br.com.cuidebem.models.idoso.Idoso;
import br.com.cuidebem.models.idoso.IdosoResponse;
import br.com.cuidebem.services.IdosoService;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/idoso")


public class IdosoController {
    private final IdosoService idosoService;

    public IdosoController(IdosoService idosoService) {
        this.idosoService = idosoService;
    }

    @PostMapping
    public ResponseEntity save(@RequestBody IdosoResquest idoso){
        var aux = idosoService.criar(idoso.toIdoso());
        return ResponseEntity.ok(new IdosoResponse(aux));
    }

    @GetMapping
    public ResponseEntity findAll(@PageableDefault(size = 10, sort = {"nome"}) Pageable pageable){
        return ResponseEntity.ok(idosoService.findAll());
    }

    @GetMapping("/{cpf}")
    public ResponseEntity findById(@PathVariable String cpf) {
        var idoso = idosoService.buscarPorId(cpf);
        return ResponseEntity.ok(idoso);
    }

    @PutMapping("/{id}")
    public ResponseEntity atualizar(@PathVariable String id,  @RequestBody Idoso idoso) {
        var idosoAtualizado = idosoService.atualizar(id, idoso);
        return ResponseEntity.ok(idosoAtualizado);
    }


    @DeleteMapping("/{cpf}")
    public ResponseEntity deletar(@PathVariable String cpf) {
        idosoService.deletar(cpf);
        return ResponseEntity.noContent().build();
    }

}




