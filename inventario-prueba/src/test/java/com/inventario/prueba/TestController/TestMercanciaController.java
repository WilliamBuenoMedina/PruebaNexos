package com.inventario.prueba.TestController;

import com.inventario.prueba.domain.repository.MercanciaRepository;
import com.inventario.prueba.domain.repository.UsuarioRepository;
import com.inventario.prueba.domain.service.MercanciaService;
import com.inventario.prueba.domain.service.UsuarioService;
import com.inventario.prueba.persistence.crud.MercanciaCrudRepository;
import com.inventario.prueba.persistence.crud.UsuarioCrudRepository;
import com.inventario.prueba.persistence.entity.Mercancia;
import com.inventario.prueba.persistence.entity.Usuario;
import com.inventario.prueba.web.controller.MercanciaController;
import com.inventario.prueba.web.controller.UsuarioController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestMercanciaController {

    @InjectMocks
    private MercanciaController mercanciaController;

    @Mock
    private MercanciaService mercanciaService;

    @Mock
    private MercanciaRepository mercanciaRepository;

    @Mock
    private MercanciaCrudRepository mercanciaCrudRepository;

    private static final Integer IDMERCANCIA = 1;
    private static final Integer IDUSUARIO = 1;
    private static final String NOMBREPRODUCTO = "MOTOS";
    private static final Integer CANTIDAD = 20;
    private static final Date FECHAINGRESO = new Date();


    public List<Mercancia> ListaMercancias(){
        List<Mercancia> mercancias =  new ArrayList<>();
        Mercancia mercancia = new Mercancia();
        mercancia.setIdMercancia(IDMERCANCIA);
        mercancia.setIdusuario(IDUSUARIO);
        mercancia.setNombreProducto(NOMBREPRODUCTO);
        mercancia.setCantidad(CANTIDAD);
        mercancia.setFechaIngreso(FECHAINGRESO);
        mercancias.add(mercancia);
        return mercancias;
    }
    @Test
    public void TestAll(){
        ResponseEntity<List<Mercancia>> response = mercanciaController.getAll();
        assertEquals(HttpStatus.OK, response.getStatusCode());
    }

    @Test
    public void TestgetByNombreProducto(){
        Mockito.when(mercanciaService.getByNombreProducto(NOMBREPRODUCTO)).thenReturn(ListaMercancias());
        List<Mercancia> resultado = mercanciaController.getByNombreProducto(NOMBREPRODUCTO);
        assertEquals(resultado,mercanciaService.getByNombreProducto(NOMBREPRODUCTO));
    }

    @Test
    public void getMercancia(){
        ResponseEntity<Mercancia> response = mercanciaController.getMercancia(IDMERCANCIA);
        assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());
    }

    @Test
    public void saveMercancia(){
        Mercancia mer = new Mercancia();
        mer.setIdMercancia(IDMERCANCIA);
        mer.setIdusuario(IDUSUARIO);
        mer.setNombreProducto(NOMBREPRODUCTO);
        mer.setCantidad(CANTIDAD);
        mer.setFechaIngreso(FECHAINGRESO);
        ResponseEntity<Mercancia> response = mercanciaController.saveMercancia(mer);
        assertEquals(HttpStatus.CREATED, response.getStatusCode());
    }


}
