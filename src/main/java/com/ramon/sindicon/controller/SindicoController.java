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

import com.ramon.sindicon.dto.SindicoDto;
import com.ramon.sindicon.service.SindicoService;

@RestController
@RequestMapping("/sindicos")
public class SindicoController {

    @Autowired
    private SindicoService sindicoService;

    @GetMapping
    public List<SindicoDto> listarTodos() {
        return sindicoService.listar();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public SindicoDto adicionarNovo(@RequestBody SindicoDto sindicoDto) {
        return sindicoService.salvar(sindicoDto);
    }

    @PutMapping
    public ResponseEntity<SindicoDto> atualizarSindico(@RequestBody SindicoDto sindicoDto) {
        sindicoDto = sindicoService.salvar(sindicoDto);
        return ResponseEntity.ok(sindicoDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarSindico(@PathVariable Long id) {
        sindicoService.deletar(id);
        return ResponseEntity.noContent().build();
    }

}
