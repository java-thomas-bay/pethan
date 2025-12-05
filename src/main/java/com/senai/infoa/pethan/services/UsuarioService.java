package com.senai.infoa.pethan.services;

import java.util.List;

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

    public Usuario login(String email, String senha){
        Usuario usuario = ur.findByUsuario(email, senha);
        if(usuario != null && senha.equals(usuario.getSenha())){
            return usuario;
        }
        return null;
    }

    public Usuario atualizar(Usuario usuario, Integer id){
    Usuario usuario2 = ur.findById(id).get();
    if(usuario2 != null){
        usuario.setId(id);
        return ur.save(usuario);
    }
    return null;
}

public List<Usuario> listarTodos(){
        return ur.findAll();
    }

     public boolean buscar(Integer Id) {
        Usuario usuario = ur.findById(Id).get();
        if(usuario != null){
           ur.findById(Id);
            return true;
  
        }

        return false;

}
}
