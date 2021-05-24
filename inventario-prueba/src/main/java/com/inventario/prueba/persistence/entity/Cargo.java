package com.inventario.prueba.persistence.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Cargos")
public class Cargo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cargo")
    private Integer idCargo;

    @Column(name = "nombre_Cargo")
    private String nombreCargo;


    @OneToMany(mappedBy = "cargo")
    private List<Usuario> usuarios;

    public Integer getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
    }

    public String getNombreCargo() {
        return nombreCargo;
    }

    public void setNombreCargo(String nombreCargo) {
        this.nombreCargo = nombreCargo;
    }
}
