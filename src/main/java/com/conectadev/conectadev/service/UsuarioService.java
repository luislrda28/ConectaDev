package com.conectadev.conectadev.service;

import com.conectadev.conectadev.model.Usuario;
import com.conectadev.conectadev.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;


    @GetMapping
    public List<Usuario> listarTodos(){
        return usuarioRepository.findAll();
    }

    @PostMapping
    public Usuario criarUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    @DeleteMapping
    public void deletarUsuario(Long id){
        if(!usuarioRepository.existsById(id)){
            throw new RuntimeException("Usuário não encontrado.");
        }
        usuarioRepository.deleteById(id);
    }
}
