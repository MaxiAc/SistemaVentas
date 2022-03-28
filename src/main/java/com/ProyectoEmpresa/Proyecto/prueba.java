/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProyectoEmpresa.Proyecto;

import com.ProyectoEmpresa.Proyecto.Venta.*;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author brian
 */
@Controller
@Slf4j
public class prueba {

    List<Cliente> clientelista = new ArrayList<>();
    List<Producto> productos = new ArrayList<>();
    List<Producto> servicios = new ArrayList<>();
//    @Autowired
//    private ClienteServiceImp cliente;
//

    @GetMapping("/")
    public String prueba(Model model) {
        return "index";
    }

    @GetMapping("/clientes")
    public String clientes(Cliente cliente, Model model) {
        model.addAttribute("listacliente", clientelista);
        return "Clientes";
    }

    @GetMapping("/productos")
    public String productos(Producto producto, Model model) {
        model.addAttribute("productos", productos);

        return "Productos";
    }

    @GetMapping("/pedidos")
    public String pedidos() {
        return "pedidos";
    }

    @GetMapping("/realizarPedido")
    public String realizarPedido(Model model, Pedido pedido) {
        model.addAttribute("listacliente", clientelista);
        model.addAttribute("listaproducto", productos);
        model.addAttribute("listaservicio", servicios);
        return "RealizarPedido";
    }

//    @GetMapping("/agregarEmpresa")
//    public String agregarEmpresa(ClienteEmpresa empresa) {
//        return "AgregarEmpresa";
//    }
//
    @PostMapping("/guardar")
    public String guardar(Cliente cliente) {
        this.clientelista.add(cliente);
        System.out.println(cliente.getNombre() + cliente.toString());
//        this.cliente.guardar(cliente);
        return "redirect:/";
    }

//    @GetMapping("/editar/{cliente}")
//    public String editar(Cliente cliente, Model model) {
//        System.out.println(cliente);
//        model.addAttribute("cliente1", cliente);
//        return "agregarCliente";
//    }
//
//    //----------------------------------------------
//    @GetMapping("/agregarProducto")
//    public String agregarProducto(Producto producto) {
//        return "AgregarProducto";
//    }
//
    @PostMapping("/guardarproducto")
    public String guardarproducto(Producto producto) {
        System.out.println(producto.toString());
        this.productos.add(producto);
        if (producto.getTipo().equals("Producto")) {
            this.productos.add(producto);
        } else {
            this.servicios.add(producto);
        }
        return "redirect:/";
    }

//    @GetMapping("/agregarServicio")
//    public String agregarServicio(Servicio servicio) {
//        return "AgregarServicio";
//    }
//
//    @GetMapping("/realizarPedido")
//    public String realizarPedido(Pedido pedido, Model model) {
//        model.addAttribute("producto", productos);
//        model.addAttribute("cliente", cliente);
//        return "RealizarPedido";
//    }
//
    @PostMapping("/guardarPedido")
    public String guardarPedido(Pedido pedido) {
        System.out.println(pedido.getPedidop());
        return "redirect:/";
    }
}
