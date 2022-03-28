package com.ProyectoEmpresa.Proyecto.Venta;

import com.ProyectoEmpresa.Proyecto.Venta.ItemVenta;
import lombok.Data;

/**
 * Clase que define un producto.
 */
@Data
public class Producto implements ItemVenta {

    private double precio;
    private String tipo;
    private String nombre;

    public Producto() {
    }

    /**
     * Constructor parametrizado de los objetos de esta clase.
     *
     * @param precio double precio por unidad.
     * @param nombre String nombre del producto.
     */
    public Producto(String nombre,String tipo ,double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipo=tipo;
    }

    /**
     * Metodo implementado obligatoriamente por la interfaz IPrecio que devuelve
     * el importe total del producto.
     *
     * @return double importe total.
     */
    @Override
    public double getImporteTotal() {
        return getPrecio();
    }

}
