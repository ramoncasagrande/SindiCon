package com.ramon.sindicon.dto;

import com.ramon.sindicon.model.Sindico;

import lombok.Data;

@Data
public class SindicoDto {

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
   
    public static SindicoDto converter(Sindico sindico){
        SindicoDto sindicoDto = new SindicoDto();
        sindicoDto.setId(sindico.getId());
        sindicoDto.setNome(sindico.getNome());
        sindicoDto.setNomeEdificio(sindico.getNomeEdificio());
        sindicoDto.setTelefone(sindico.getTelefone());
        sindicoDto.setEmail(sindico.getEmail());
        sindicoDto.setLogradouro(sindico.getLogradouro());
        sindicoDto.setNumero(sindico.getNumero());
        sindicoDto.setBairro(sindico.getBairro());
        sindicoDto.setCidade(sindico.getCidade());
        sindicoDto.setImagemUrl(sindico.getImagemUrl());
        return sindicoDto;
    }
}


