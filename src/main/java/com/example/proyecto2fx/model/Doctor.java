package com.example.proyecto2fx.model;

import java.sql.Timestamp;

public class Doctor extends Usuario{
    private String especialidad;
    private  String numero_colegiado;
    private   String centro;

    public Doctor(int usuario_id, String nombre, String apellido, String email, String contrasena_hash, Timestamp fecha_nacimiento, String especialidad, String numero_colegiado, String centro) {
        super(usuario_id, nombre, apellido, email, contrasena_hash, fecha_nacimiento);
        this.especialidad = especialidad;
        this.numero_colegiado = numero_colegiado;
        this.centro = centro;
    }

    public Doctor(){
        super();
        this.especialidad = "";
        this.numero_colegiado = "";
        this.centro = "";
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getNumero_colegiado() {
        return numero_colegiado;
    }

    public String getCentro() {
        return centro;
    }
}
