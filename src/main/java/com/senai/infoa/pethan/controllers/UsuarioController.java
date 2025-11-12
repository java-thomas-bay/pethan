package com.senai.infoa.pethan.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.senai.infoa.pethan.models.Usuario;
import com.senai.infoa.pethan.services.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    
    @Autowired
    private UsuarioService us;

   @PostMapping("/cadastrar")
    public Usuario salvar(@RequestBody Usuario usuario, @RequestParam String senha, @RequestParam String confSenha) {
        return us.salvar(usuario, senha, confSenha);
    }

   @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String senha) {
        return us.login(email, senha);
    }

     @PutMapping("/atualizar/{id}")
    public Usuario atualizar(@PathVariable Integer id, @RequestBody Usuario usuario) {
        return us.atualizar(usuario, id);
        
    }

    @GetMapping("/listar")
    public List<Usuario> listarTodos() {
        return us.listarTodos();
    }

     @GetMapping("/buscar/{id}")
    public String buscar(@PathVariable Integer id) {
        boolean buscou = us.buscar(id);
        if (buscou) {
            String texto = "Usuário " + id + "encontrado com sucesso";
            return texto;
        }
        return "Falha ao buscar o usuário";
    }
}
    