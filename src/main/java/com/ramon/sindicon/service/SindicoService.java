package com.ramon.sindicon.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ramon.sindicon.dto.SindicoDto;
import com.ramon.sindicon.model.Sindico;
import com.ramon.sindicon.repository.SindicoRepository;

@Service
public class SindicoService {

    @Autowired
    private SindicoRepository sindicoRepository;

    public List<SindicoDto> listar() {
        List<Sindico> lista = sindicoRepository.findAll();
        return lista.stream()
                .map(SindicoDto::converter)
                .collect(Collectors.toList());
    }

    public SindicoDto salvar(SindicoDto sindicoDto) {
        Sindico sindico = Sindico.converter(sindicoDto);
        sindicoRepository.save(sindico);
        return SindicoDto.converter(sindico);
    }

    public void deletar(Long id) {
        sindicoRepository.deleteById(id);
    }

}
