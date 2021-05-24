package com.inventario.prueba.domain.service;

import com.inventario.prueba.domain.repository.UsuarioRepository;
import com.inventario.prueba.persistence.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> getAll(){
        return (List<Usuario>) usuarioRepository.getAll();
    }
}
