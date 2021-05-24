package com.inventario.prueba.domain.repository;

import com.inventario.prueba.persistence.crud.CargoCrudRepository;
import com.inventario.prueba.persistence.entity.Cargo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CargoRepository {
    @Autowired
    private CargoCrudRepository cargoCrudRepository;

    public List<Cargo> getAll(){
        return (List<Cargo>) cargoCrudRepository.findAll();
    }
}
