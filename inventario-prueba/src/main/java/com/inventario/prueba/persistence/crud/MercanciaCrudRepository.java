package com.inventario.prueba.persistence.crud;

import com.inventario.prueba.persistence.entity.Mercancia;
import org.springframework.data.repository.CrudRepository;


import java.util.List;

public interface MercanciaCrudRepository extends CrudRepository<Mercancia, Integer> {

    List<Mercancia>findByNombreProducto(String nombreProducto);
}
