package com.senai.infoa.pethan.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.senai.infoa.pethan.models.Endereco;
import com.senai.infoa.pethan.services.EnderecoService;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {
    
    @Autowired
    private EnderecoService enderecoService;

    @PostMapping("/salvar")
    public Endereco salvar(@RequestParam String cep, @RequestParam(required=false) long numero, @RequestParam(required=false) String referencia) {
        return enderecoService.salvar(cep, numero, referencia);
    }

      @GetMapping("/listar")
    public List<Endereco> listarTodos() {
        return enderecoService.listarTodos();
    }
}
