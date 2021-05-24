package com.inventario.prueba.domain.service;

import com.inventario.prueba.domain.repository.CargoRepository;
import com.inventario.prueba.persistence.entity.Cargo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CargoService {

    @Autowired
    private CargoRepository cargoRepository;

    public List<Cargo> getAll(){
        return (List<Cargo>) cargoRepository.getAll();
    }


}
