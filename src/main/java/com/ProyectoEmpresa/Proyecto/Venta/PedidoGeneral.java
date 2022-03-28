package com.ProyectoEmpresa.Proyecto.Venta;

import com.ProyectoEmpresa.Proyecto.Cliente;
import java.util.ArrayList;
import java.util.Iterator;
import lombok.Data;

/**
 *
 * @author brian
 */
@Data
public class PedidoGeneral implements ItemVenta {

    /**
     * Coleccion de elementos que implementan la interfaz IPrecio y que componen
     * el producto compuesto.
     */
    private ArrayList<Pedido> pedido;
    private Cliente cliente, personaresponsable;

    /**
     * Constructor minimo que inicializa el array.
     *
     * @param cliente
     * @param personaresp
     */
    public PedidoGeneral(Cliente cliente, Cliente personaresp) {
        pedido = new ArrayList<>();
        this.cliente = cliente;
        this.personaresponsable = personaresp;
    }

    /**
     * Metodo para añadir elementos al array.
     *
     * @param pedido
     */
    public void addProducto(Pedido pedido) {
        this.pedido.add(pedido);
    }

    /**
     * Metodo que elimina elementos del producto.
     *
     * @param item
     */
    public void removeItem(Pedido item) {
        pedido.remove(item);
    }
//
//    /**
//     * Metodo quu devuelve el ArrayList de productos IPrecio.
//     *
//     * @return ArrayList<> productos.
//     */
//    public ArrayList<Producto> getProductos() {
//        ArrayList<Producto> productos = new ArrayList<>();
//        for (ItemVenta producto : pedido) {
//            if (producto instanceof Producto) {
//                productos.add((Producto) producto);
//                System.out.println("producto: " + ((Producto) producto).getNombre());
//            }
//        }
//        return productos;
//    }

    /**
     * Devuelve una lista de los servicios adquiridos en la compra.
     *
     * @return ArrayList<> servicios.
     */
//    public ArrayList<Servicio> getServicios() {
//        ArrayList<Servicio> servicios = new ArrayList<>();
//        for (ItemVenta pedidoe : pedido) {
//            if ((pedidoe instanceof Servicio)) {
//                servicios.add((Servicio) pedidoe);
//            }
//        }
//        return servicios;
//    }
    /**
     * Metodo que calcula el importe total de todos los productos y sus
     * componentes implementado obligatoriamente por la interfaz IPrecio.
     *
     * @return double importe total.
     */
    @Override
    public double getImporteTotal() {
        double importeTotal = 0;
        for (Iterator<Pedido> it = pedido.iterator(); it.hasNext();) {
            Pedido iPedido = it.next();
            importeTotal += iPedido.getImporte();
        }
        return importeTotal;
    }

}
