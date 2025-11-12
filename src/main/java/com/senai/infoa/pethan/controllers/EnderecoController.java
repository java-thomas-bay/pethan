package com.senai.infoa.pethan.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

       @GetMapping("/buscar/{id}")
    public String buscar(@PathVariable Integer id) {
        boolean buscou = enderecoService.buscar(id);
        if (buscou) {
            String texto = "Endereço " + id + "encontrado com sucesso";
            return texto;
        }
        return "Falha ao buscar o usuário";
    }
}
