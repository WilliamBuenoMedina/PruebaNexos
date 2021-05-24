package com.inventario.prueba.domain.service;


import com.inventario.prueba.domain.repository.MercanciaRepository;
import com.inventario.prueba.persistence.entity.Mercancia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class MercanciaService {

    @Autowired
    private MercanciaRepository mercanciaRepository;


   public List<Mercancia> getAll() {
        return mercanciaRepository.getAll();
    }

    public List<Mercancia> getByNombreProducto(String nombreProducto){
       return mercanciaRepository.getByNombreProducto(nombreProducto);
    }

    public Optional<Mercancia> getMercancia (int idMercancia){
       return mercanciaRepository.getMercancia(idMercancia);
    }

    public Mercancia saveMercancia (Mercancia mercancia){
        return mercanciaRepository.saveMercancia(mercancia);
    }

    public void deleteMercancia (int idMercancia){
      mercanciaRepository.deleteMercancia(idMercancia);
    }


}
