package com.inventario.prueba.persistence.crud;

import com.inventario.prueba.persistence.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioCrudRepository  extends CrudRepository<Usuario, Integer> {
}
