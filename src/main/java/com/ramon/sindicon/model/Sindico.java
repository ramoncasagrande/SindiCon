package com.ramon.sindicon.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.ramon.sindicon.dto.SindicoDto;

import lombok.Data;

@Data
@Entity
public class Sindico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String nomeEdificio;
    private String telefone;
    private String email;
    private String Logradouro;
    private String numero;
    private String bairro;
    private String cidade;
    private String imagemUrl;

    public static Sindico converter(SindicoDto sindicoDto){
        Sindico sindico = new Sindico();
        sindico.setId(sindicoDto.getId());
        sindico.setNome(sindicoDto.getNome());
        sindico.setNomeEdificio(sindicoDto.getNomeEdificio());
        sindico.setTelefone(sindicoDto.getTelefone());
        sindico.setEmail(sindicoDto.getEmail());
        sindico.setLogradouro(sindicoDto.getLogradouro());
        sindico.setNumero(sindicoDto.getNumero());
        sindico.setBairro(sindicoDto.getBairro());
        sindico.setCidade(sindicoDto.getCidade());
        sindico.setImagemUrl(sindicoDto.getImagemUrl());
        return sindico;
    }
}
