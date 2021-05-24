package com.inventario.prueba.persistence.crud;

import com.inventario.prueba.persistence.entity.Cargo;
import org.springframework.data.repository.CrudRepository;

public interface CargoCrudRepository  extends CrudRepository<Cargo,Integer> {
}
