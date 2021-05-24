package com.inventario.prueba.TestController;

import com.inventario.prueba.domain.repository.UsuarioRepository;
import com.inventario.prueba.domain.service.UsuarioService;
import com.inventario.prueba.persistence.crud.UsuarioCrudRepository;
import com.inventario.prueba.persistence.entity.Usuario;
import com.inventario.prueba.web.controller.UsuarioController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestUsuarioController {

    @InjectMocks
    private UsuarioController usuarioController;

    @Mock
    private UsuarioService usuarioService;

    @Mock
    private UsuarioRepository usuarioRepository;

    @Mock
    private UsuarioCrudRepository usuarioCrudRepository;


    @Test
    public void TestAll(){
        ResponseEntity<List<Usuario>> response = usuarioController.getAll();
        assertEquals(HttpStatus.OK, response.getStatusCode());
    }

}
