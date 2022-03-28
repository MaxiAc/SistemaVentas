package com.ProyectoEmpresa.Proyecto.Venta;

import lombok.Data;

@Data
public class Pedido {

    private Producto pedidop;
    private boolean especial;
    private double impuesto, cargo, valorPedido;
    private int añosGarantia = 0;

    private final double iva = 0.23;
    private final double iibb = 0.01;

    public Pedido(Producto pedido, boolean especial) {
        this.pedidop = pedido;
        this.especial = especial;
        this.valorPedido = pedido.getImporteTotal();
    }

    public Pedido() {
    }

    /**
     * Idemtifica el tipo de producto y calcula su valor total dependiendo el
     * producto
     *
     * @return
     */
    public double getImporte() {
        if (pedidop.getTipo()=="Servicio") {
            if (especial) {
                this.setValorPedido(pedidop.getImporteTotal() + this.getImpuesto() + this.getCargo());
                return valorPedido;
            }
            this.setValorPedido(pedidop.getImporteTotal() + this.getImpuesto());
            return valorPedido;
        } else if (especial) {

            this.setValorPedido(pedidop.getImporteTotal() + pedidop.getImporteTotal() * 0.2);
            return valorPedido;
        } else {
            return pedidop.getImporteTotal();
        }
    }

    /**
     *
     * @return impuesto
     */
    public double getImpuesto() {
        this.impuesto = pedidop.getImporteTotal() * iva + pedidop.getImporteTotal() * iibb;
        return impuesto;
    }
}
