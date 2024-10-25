package br.com.cuidebem.controllers;

import br.com.cuidebem.models.acompanhante.Acompanhante;
import br.com.cuidebem.models.acompanhante.AcompanhanteRequest;
import br.com.cuidebem.models.acompanhante.AcompanhanteResponse;
import br.com.cuidebem.services.AcompanhanteService;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/acompanhante")
public class AcompanhanteController {

    private final AcompanhanteService acompanhanteService;

    public AcompanhanteController(AcompanhanteService acompanhanteService) {
        this.acompanhanteService = acompanhanteService;
    }

    @PostMapping
    public ResponseEntity save(@RequestBody AcompanhanteRequest acompanhante){
        var aux = acompanhanteService.criar(acompanhante.toAcompanhante());
        return ResponseEntity.ok(new AcompanhanteResponse(aux));
    }

    @GetMapping
    public ResponseEntity findAll(@PageableDefault(size = 10, sort = {"nome"}) Pageable pageable){
        return ResponseEntity.ok(acompanhanteService.findAll());
    }

    @GetMapping("/{cpf}")
    public ResponseEntity findById(@PathVariable String cpf) {
        var acompanhante = acompanhanteService.buscarPorId(cpf);
        return ResponseEntity.ok(acompanhante);
    }

    @PutMapping("/{id}")
    public ResponseEntity atualizar(@PathVariable String id,  @RequestBody Acompanhante acompanhante) {
        var acompanhanteAtualizado = acompanhanteService.atualizar(id, acompanhante);
        return ResponseEntity.ok(acompanhanteAtualizado);
    }


    @DeleteMapping("/{cpf}")
    public ResponseEntity deletar(@PathVariable String cpf) {
        acompanhanteService.deletar(cpf);
        return ResponseEntity.noContent().build();
    }

}
