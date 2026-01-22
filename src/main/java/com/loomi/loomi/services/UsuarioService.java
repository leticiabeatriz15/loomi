package com.loomi.loomi.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.loomi.loomi.domain.usuario.Usuario;
import com.loomi.loomi.domain.usuario.UsuarioRepository;

public class UsuarioService {
    
    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario criarUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }
}
