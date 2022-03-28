package com.ProyectoEmpresa.Proyecto;

import com.ProyectoEmpresa.Proyecto.Venta.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class ProyectoApplication {
// PEDIDOGRAL: CLIENTE, PRODUCTONOMBRE, TIPO, VALOR, 
// Cliente: ID, NOMBRE, TIPO
// PRODUCTOS: NOMBRE, PRECIO
// SERVICIO: NOMBRE, PRECIO

    public static void main(String[] args) {
//        Producto producto = new Producto("Pan", 900);
//        Servicio servicio = new Servicio("Luz", 1900);
////        Cliente clienteprueba = new Cliente("Maximiliano", 40045734);
//        Pedido pedidoProducto = new Pedido(producto, false);
//        Pedido pedidoServicio = new Pedido(servicio, true);
//        pedidoServicio.setCargo(200);
//        PedidoGeneral pedidogral = new PedidoGeneral(clienteprueba, clienteprueba);
//        pedidogral.addProducto(pedidoServicio);
//        pedidogral.addProducto(pedidoProducto);
//
//        System.out.println("Pedido\n");
//        System.out.println("Nombre cliente:" + pedidogral.getCliente().getNombre());
//        for (Pedido pedido1 : pedidogral.getPedido()) {
//
//            System.out.println("\n Pedido: " + pedido1.toString() + "Total Producto:"+ pedido1.getImporte());
//        }
        SpringApplication.run(ProyectoApplication.class, args);
    }

}
