package com.inventario.prueba.TestService;

import com.inventario.prueba.domain.repository.CargoRepository;
import com.inventario.prueba.domain.service.CargoService;
import com.inventario.prueba.persistence.crud.CargoCrudRepository;
import com.inventario.prueba.persistence.entity.Cargo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestCargoService {

    @InjectMocks
    private CargoService cargoService;

    @Mock
    private CargoRepository repository;

    @Mock
    private CargoCrudRepository crudRepository;

    private static final Integer ID =1;
    private static final String NOMBRECARGO= "ADMINISTRATIVO";

    public List<Cargo> ListaCargos(){
        List<Cargo> cargos =  new ArrayList<>();
        Cargo cargo = new Cargo();
        cargo.setIdCargo(ID);
        cargo.setNombreCargo(NOMBRECARGO);
        cargos.add(cargo);
        return cargos;
    }
    @Test
    public void TestAll(){
        Mockito.when(repository.getAll()).thenReturn(ListaCargos());
        List<Cargo> resultado = cargoService.getAll();
        assertEquals(resultado, repository.getAll());
    }

}
