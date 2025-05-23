package com.tecdesoftware.market.persistence.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="compras")
public class Compra

{
    @Id //LLave primaria
    //Autogenera Ids autoincrementables
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_compra")
    private int idCompra;

    @Column(name="id_cliente")
    private Integer idCliente;

    private LocalDateTime fecha;

    @Column(name="medio_pago")
    private String medioPago;

    private String comentario;

    private Boolean estado;

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }



