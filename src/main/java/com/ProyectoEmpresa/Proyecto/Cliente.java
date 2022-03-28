package com.ProyectoEmpresa.Proyecto;

import lombok.Data;

@Data
public class Cliente {

    private String nombre;
    private String apellido;
    private int dni;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

}
