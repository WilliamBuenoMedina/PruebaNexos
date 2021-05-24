package com.inventario.prueba.TestService;


import com.inventario.prueba.domain.repository.UsuarioRepository;
import com.inventario.prueba.domain.service.UsuarioService;
import com.inventario.prueba.persistence.crud.UsuarioCrudRepository;
import com.inventario.prueba.persistence.entity.Usuario;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestUsuarioService {

    @InjectMocks
    private UsuarioService usuarioService;

    @Mock
    private UsuarioRepository usuarioRepository;

    @Mock
    private UsuarioCrudRepository usuarioCrudRepository;

    private static final Integer ID = 1;
    private static final Integer IDCARGO = 1;
    private static final String NOMBREUSUARIO = "WILLIAM";
    private static final Integer EDAD = 27;
    private static final Date  FECHAINGRESOCOMPAÑIA = new Date();

    public List<Usuario> ListaUsuarios(){
        List<Usuario> usuarios =  new ArrayList<>();
        Usuario usuario= new Usuario();
        usuario.setIdUsuario(ID);
        usuario.setIdCargo(IDCARGO);
        usuario.setNombreUsuario(NOMBREUSUARIO);
        usuario.setEdad(EDAD);
        usuario.setFechaIngresoCompañia(FECHAINGRESOCOMPAÑIA);
        usuarios.add(usuario);
        return usuarios;
    }

    @Test
    public void TestAll(){
        Mockito.when(usuarioRepository.getAll()).thenReturn(ListaUsuarios());
        List<Usuario> resultado = usuarioService.getAll();
        assertEquals(resultado, usuarioRepository.getAll());
    }



}
