package com.inventario.prueba.TestService;

import com.inventario.prueba.domain.repository.MercanciaRepository;
import com.inventario.prueba.domain.service.MercanciaService;
import com.inventario.prueba.persistence.crud.MercanciaCrudRepository;
import com.inventario.prueba.persistence.entity.Mercancia;

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
public class TestMercanciaService {

    @InjectMocks
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
        Mockito.when(mercanciaRepository.getAll()).thenReturn(ListaMercancias());
        List<Mercancia> resultado = mercanciaService.getAll();
        assertEquals(resultado, mercanciaRepository.getAll());
    }


    @Test
    public void TestgetByNombreProducto(){
        Mockito.when(mercanciaRepository.getByNombreProducto(NOMBREPRODUCTO)).thenReturn(ListaMercancias());
        List<Mercancia> resultado = mercanciaService.getByNombreProducto(NOMBREPRODUCTO);
        assertEquals(resultado,mercanciaRepository.getByNombreProducto(NOMBREPRODUCTO));
    }

    @Test
    public void TestsaveMercancia(){
        Mercancia mer = new Mercancia();
        mer.setIdMercancia(IDMERCANCIA);
        mer.setIdusuario(IDUSUARIO);
        mer.setNombreProducto(NOMBREPRODUCTO);
        mer.setCantidad(CANTIDAD);
        mer.setFechaIngreso(FECHAINGRESO);

        Mockito.when(mercanciaRepository.saveMercancia(mer)).thenReturn(mer);
        Mercancia resultado = mercanciaService.saveMercancia(mer);
        assertEquals(resultado,mercanciaRepository.saveMercancia(mer));
    }
}
