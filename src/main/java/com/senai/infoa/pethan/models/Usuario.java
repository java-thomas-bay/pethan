package com.senai.infoa.pethan.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    protected Integer id;
    
    @Column(name = "nome_completo")
    protected String nomeCompleto;

    @Column(name = "email")
    protected String email;

    @Column(name = "senha")
    protected String senha;

    @Column(name = "data_nascimento")
    protected String dataNascimento;

    @Column(name = "cpf")
    protected String cpf;

    public Usuario (){}

    public Usuario(String cpf, String dataNascimento, String email, Integer id, String nomeCompleto, String senha) {
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.senha = senha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
