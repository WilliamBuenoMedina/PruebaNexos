package com.inventario.prueba.web.controller;


import com.inventario.prueba.domain.service.UsuarioService;
import com.inventario.prueba.persistence.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/all")

    public ResponseEntity<List<Usuario>> getAll() {
         return new ResponseEntity<>(usuarioService.getAll(), HttpStatus.OK);
    }
}
