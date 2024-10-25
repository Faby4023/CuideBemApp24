package br.com.cuidebem.controllers;

import br.com.cuidebem.models.cuidador.Cuidador;
import br.com.cuidebem.models.cuidador.CuidadorRequest;
import br.com.cuidebem.models.cuidador.CuidadorResponse;
import br.com.cuidebem.services.CuidadorService;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/cuidador")

   public class CuidadorController {
    private final CuidadorService cuidadorService;

    public CuidadorController(CuidadorService cuidadorService) {
            this.cuidadorService = cuidadorService;
        }

        @PostMapping
        public ResponseEntity save(@RequestBody CuidadorRequest cuidador){
            var aux = cuidadorService.criar(cuidador.toCuidador());
            return ResponseEntity.ok(new CuidadorResponse(aux));
        }

        @GetMapping
        public ResponseEntity findAll(@PageableDefault(size = 10, sort = {"nome"}) Pageable pageable){
            return ResponseEntity.ok(cuidadorService.findAll());
        }

        @GetMapping("/{cpf}")
        public ResponseEntity findById(@PathVariable String cpf) {
            var cuidador = cuidadorService.buscarPorId(cpf);
            return ResponseEntity.ok(cuidador);
        }

        @PutMapping("/{id}")
        public ResponseEntity atualizar(@PathVariable String id,  @RequestBody Cuidador cuidador) {
            var cuidadorAtualizado = cuidadorService.atualizar(id, cuidador);
            return ResponseEntity.ok(cuidadorAtualizado);
        }


        @DeleteMapping("/{cpf}")
        public ResponseEntity deletar(@PathVariable String cpf) {
            cuidadorService.deletar(cpf);
            return ResponseEntity.noContent().build();
        }

    }

