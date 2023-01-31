package com.ramon.sindicon.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
}
