package com.inventario.prueba.TestController;

import com.inventario.prueba.domain.repository.CargoRepository;
import com.inventario.prueba.domain.service.CargoService;
import com.inventario.prueba.persistence.crud.CargoCrudRepository;
import com.inventario.prueba.persistence.entity.Cargo;
import com.inventario.prueba.web.controller.CargoController;
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
public class TestCargoController {


    @InjectMocks
    private CargoController cargoController;

    @Mock
    private CargoService cargoService;

    @Mock
    private CargoRepository repository;

    @Mock
    private CargoCrudRepository crudRepository;

    @Test
    public void TestAll(){
        ResponseEntity<List<Cargo>> response = cargoController.getAll();
        assertEquals(HttpStatus.OK, response.getStatusCode());
    }
}
