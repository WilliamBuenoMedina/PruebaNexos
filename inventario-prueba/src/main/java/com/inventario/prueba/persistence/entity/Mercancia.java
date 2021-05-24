package com.inventario.prueba.persistence.entity;



import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "mercancias")
public class Mercancia {


    @Id
    @Column (name = "id_mercancia")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMercancia;

    @Column(name = "id_usuario")
    private Integer idusuario;

    @Column(name = "nombre_producto")
    private String nombreProducto;

    private Integer cantidad;

    @Column(name = "fecha_ingreso")
    private Date fechaIngreso;

    @ManyToOne
    @JoinColumn(name = "id_usuario", insertable = false, updatable = false)
    private Usuario usuario;


    public Integer getIdMercancia() {
        return idMercancia;
    }

    public void setIdMercancia(Integer idMercancia) {
        this.idMercancia = idMercancia;
    }

    public Integer getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
}
