package com.example.proyecto2fx.model;

import java.sql.Timestamp;

public class Paciente extends Usuario {
    private String n_ss;

    public Paciente(int usuario_id, String nombre, String apellido, String email, String contrasena_hash, Timestamp fecha_nacimiento, String n_ss) {
        super(usuario_id, nombre, apellido, email, contrasena_hash, fecha_nacimiento);
        this.n_ss = n_ss;
    }

    public Paciente(){
        super();
        this.n_ss = "";
    }

    public String getN_ss() {
        return n_ss;
    }
}