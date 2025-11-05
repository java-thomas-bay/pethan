package com.senai.infoa.pethan.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infoa.pethan.models.Usuario;
import com.senai.infoa.pethan.repositories.UsuarioRepository;


@Service
public class UsuarioService {
    
    @Autowired
    private UsuarioRepository ur;

    public Usuario salvar(Usuario usuario, String senha, String confSenha){
        if(senha.equals(confSenha)){
            return ur.save(usuario);
        }
        return null;
    }

    public String login(String email, String senha){
        Usuario usuario = ur.findByUsuario(email, senha);
        if(usuario != null && senha.equals(usuario.getSenha())){
            return "Login efetuado com sucesso!";
        }
        return "Falha ao realizar o login";
    }
}
