package com.tecdesoftware.market.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="clientes")
public class Cliente {
    @Id
    //Porque el ID será la CURP @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String nombre;
    private String apellidos;
    private Long celular; //Se almacena como número grande 9992896754
    private String direccion;

    @Column (name="correo_electronico")
    private String correoElectronico;

    @OneToMany (mappedBy="cliente")
    private List<Compra> compras;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Long getCelular() {
        return celular;
    }

    public void setCelular(Long celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
}
