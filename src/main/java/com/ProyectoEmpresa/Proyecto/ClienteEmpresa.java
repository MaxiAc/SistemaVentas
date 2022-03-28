/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProyectoEmpresa.Proyecto;

import java.util.Date;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@Data
public class ClienteEmpresa extends Cliente {

    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date inicioDeActividades;

    public ClienteEmpresa() {
        super();
        this.inicioDeActividades = null;
    }

    public ClienteEmpresa(String nombre, Date inicioDeActividades, int dni, String apellido) {
        super(nombre,apellido,dni);
        this.inicioDeActividades= inicioDeActividades;
    }
    
}
