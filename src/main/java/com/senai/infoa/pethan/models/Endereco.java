package com.senai.infoa.pethan.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "endereco")
public class Endereco {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    protected Integer id;

    @Column(name = "logradouro")
    protected String logradouro;

    @Column(name = "localidade")
    protected String localidade;

    @Column(name = "cep")
    protected String cep;

    @Column(name = "numero")
    protected long numero;

    @Column(name = "complemento")
    protected String complemento;

    @Column(name = "bairro")
    protected String bairro;

    @Column(name = "referencia")
    protected String referencia;

    
    public Endereco (){}


    public Endereco(Integer id, String logradouro, String localidade, String cep, long numero, String complemento,
            String bairro, String referencia) {
        this.id = id;
        this.logradouro = logradouro;
        this.localidade = localidade;
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.referencia = referencia;
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getLogradouro() {
        return logradouro;
    }


    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }


    public String getLocalidade() {
        return localidade;
    }


    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }


    public String getCep() {
        return cep;
    }


    public void setCep(String cep) {
        this.cep = cep;
    }


    public long getNumero() {
        return numero;
    }


    public void setNumero(long numero) {
        this.numero = numero;
    }


    public String getComplemento() {
        return complemento;
    }


    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }


    public String getBairro() {
        return bairro;
    }


    public void setBairro(String bairro) {
        this.bairro = bairro;
    }


    public String getReferencia() {
        return referencia;
    }


    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    

}
