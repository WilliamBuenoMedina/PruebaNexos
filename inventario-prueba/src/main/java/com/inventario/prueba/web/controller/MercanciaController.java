package com.inventario.prueba.web.controller;


import com.inventario.prueba.domain.service.MercanciaService;
import com.inventario.prueba.persistence.entity.Mercancia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/mercancias")
public class MercanciaController {

    @Autowired
    private MercanciaService mercanciaService;

    @GetMapping("/all")
    public ResponseEntity<List<Mercancia>> getAll() {
        return new ResponseEntity<>(mercanciaService.getAll(), HttpStatus.OK);
    }


    @GetMapping("/name/{name}")
    public List<Mercancia> getByNombreProducto(@PathVariable("name") String nombreProducto){
        return mercanciaService.getByNombreProducto(nombreProducto);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Mercancia> getMercancia (@PathVariable("id") int idMercancia){
        return mercanciaService.getMercancia(idMercancia).map(mercancia -> new ResponseEntity<>(mercancia,HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<Mercancia> saveMercancia (@RequestBody Mercancia mercancia){
        return new ResponseEntity<>(mercanciaService.saveMercancia(mercancia),HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteMercancia (@PathVariable("id") int idMercancia){
        mercanciaService.deleteMercancia(idMercancia);

    }

}
