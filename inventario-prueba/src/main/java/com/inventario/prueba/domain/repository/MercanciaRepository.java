package com.inventario.prueba.domain.repository;

import com.inventario.prueba.persistence.crud.MercanciaCrudRepository;
import com.inventario.prueba.persistence.entity.Mercancia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;


@Repository
public class MercanciaRepository {

    @Autowired
    private MercanciaCrudRepository mercanciaCrudRepository;

    public List<Mercancia> getAll(){
        return (List<Mercancia>) mercanciaCrudRepository.findAll();
    }

    public  List<Mercancia> getByNombreProducto(String nombreProducto){
        return mercanciaCrudRepository.findByNombreProducto(nombreProducto);
    }

    public Optional<Mercancia> getMercancia (int idMercancia){
        return  mercanciaCrudRepository.findById(idMercancia);
    }

    public Mercancia saveMercancia (Mercancia mercancia){
        return mercanciaCrudRepository.save(mercancia);
    }

    public void deleteMercancia (int idMercancia){
        mercanciaCrudRepository.deleteById(idMercancia);

    }

}
