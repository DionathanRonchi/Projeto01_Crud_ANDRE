package com.example.crud_spring2931.controller;

import com.example.crud_spring2931.model.Pessoa;
import com.example.crud_spring2931.service.PessoaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;



@RestController
@RequestMapping("/pessoas")
@RequiredArgsConstructor

public class PessoaController {
    private final PessoaService service;

//GET /pessoas (listar todas)
    @GetMapping
    public List<Pessoa>listar() {
        return service.listar();
    }


//GET /pessoas/{id} (busca por id)
    @GetMapping("/{id}")
    public ResponseEntity<Pessoa> buscar(@PathVariable Long id) {
        return ResponseEntity.ok(service.buscarPorID(id));
    }


//Post /pessoa/{id}
    @PostMapping
    public ResponseEntity<Pessoa> salvar(@RequestBody Pessoa pessoa){
        return ResponseEntity.ok(service.salvar(pessoa));


//PUT /pessoa/{id} (Atualizar)
        public ResponseEntity<Pessoa> atualizar(@PathVariable Long id, @RequestBody Pessoa dados){
        return ResponseEntity.ok(service.atualizar(id, dados));
    }


//delete /pessoas/{id}
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id){
        service.excluir(id);
        return ResponseEntity.noContent().build();
    }


        
    }
