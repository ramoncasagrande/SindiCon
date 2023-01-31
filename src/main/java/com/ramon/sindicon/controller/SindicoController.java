package com.ramon.sindicon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ramon.sindicon.model.Sindico;
import com.ramon.sindicon.service.SindicoService;

@RestController
@RequestMapping("/sindicos")
public class SindicoController {

    @Autowired
    private SindicoService sindicoService;

    @GetMapping
    public List<Sindico> listarTodos() {
        return sindicoService.listar();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Sindico adicionarNovo(@RequestBody Sindico sindico) {
        return sindicoService.salvar(sindico);
    }

    @PutMapping
    public ResponseEntity<Sindico> atualizarSindico(@RequestBody Sindico sindico) {
        sindico = sindicoService.salvar(sindico);
        return ResponseEntity.ok(sindico);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarSindico(@PathVariable Long id) {
        sindicoService.deletar(id);
        return ResponseEntity.noContent().build();
    }

}
