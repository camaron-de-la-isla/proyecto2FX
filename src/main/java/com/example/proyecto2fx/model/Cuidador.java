package com.example.proyecto2fx.model;

import java.sql.Timestamp;

public class Cuidador extends Usuario {
    private int n_ss;

    public Cuidador(int usuario_id, String nombre, String apellido, String email, String contrasena_hash, Timestamp fecha_nacimiento, int n_ss) {
        super(usuario_id, nombre, apellido, email, contrasena_hash, fecha_nacimiento);
        this.n_ss = n_ss;
    }

    public Cuidador(){
        super();
        this.n_ss = 0;
    }

    public int getN_ss() {
        return n_ss;
    }
}
