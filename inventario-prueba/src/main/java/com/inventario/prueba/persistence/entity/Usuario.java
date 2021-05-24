package com.inventario.prueba.persistence.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Integer idUsuario ;

    @Column(name = "id_cargo")
    private Integer idCargo;

    @Column(name = "nombre_usuario")
    private String nombreUsuario ;

    private Integer edad;

    @Column(name = "fecha_ingreso_compañia")
    private Date fechaIngresoCompañia;

    @OneToMany(mappedBy = "usuario")
    private List<Mercancia> mrecancias;

    @ManyToOne
    @JoinColumn(name = "id_cargo", insertable = false, updatable = false)
    private Cargo cargo;


    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Date getFechaIngresoCompañia() {
        return fechaIngresoCompañia;
    }

    public void setFechaIngresoCompañia(Date fechaIngresoCompañia) {
        this.fechaIngresoCompañia = fechaIngresoCompañia;
    }
}
