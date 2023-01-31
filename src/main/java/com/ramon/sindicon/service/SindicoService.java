package com.ramon.sindicon.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ramon.sindicon.model.Sindico;
import com.ramon.sindicon.repository.SindicoRepository;

@Service
public class SindicoService {

    @Autowired
    private SindicoRepository sindicoRepository;
    

    public List<Sindico> listar(){
            List<Sindico> lista = sindicoRepository.findAll();
        return lista.stream()
            .collect(Collectors.toList());
    }

    public Sindico salvar(Sindico sindico){
        return sindicoRepository.save(sindico);
    }

    public void deletar(Long id){
        sindicoRepository.deleteById(id);
    }

}
