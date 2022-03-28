package com.ProyectoEmpresa.Proyecto.Venta;

import lombok.Data;

/**
 * Clase que define los servicios y aplica los impuestos al importe. F
 *
 */
@Data
public class Servicio implements ItemVenta {

    private double precio, impuesto;
    private String nombre;

    public Servicio() {
    }

    /**
     * Constructor parametrizado de los objetos.
     *
     * @param precio double Precio del servico.
     * @param nombre String nombre del servicio.
     * @param activo Si el servicio esta activo
     */
    public Servicio( String nombre,double precio) {
        this.precio = precio;
        this.nombre = nombre;
    }

   
   
    /**
     * Metodo implementado obligatoriamente por la interfaz IPrecio que devuelve
     * el importe total del servicio.
     *
     * @return double importe total.
     */
    @Override
    public double getImporteTotal() {
        return getPrecio() + getImpuesto();
    }

    @Override
    public String toString() {
        return "Servicio{" + "precio=" + precio + ", nombre=" + nombre + '}';
    }

}
