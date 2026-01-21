package com.loomi.loomi.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.loomi.loomi.domain.usuario.Usuario;
import com.loomi.loomi.domain.usuario.UsuarioRepository;
import com.loomi.loomi.dto.UsuarioDto;

public class UsuarioService {
    
    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario criarUsuario(UsuarioDto usuariodto){
        return usuarioRepository.save(usuariodto);
    }
}
