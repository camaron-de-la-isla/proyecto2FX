package com.example.proyecto2fx.model;

import java.sql.Timestamp;

public class RitmoCardiaco extends Sensor {
    private  int ritmo_minimo;
    private  int ritmo_maximo;

    public RitmoCardiaco(int sensor_id, int paciente_id, Timestamp fecha_instalacion, int ritmo_minimo, int ritmo_maximo) {
        super(sensor_id, paciente_id, fecha_instalacion);
        this.ritmo_minimo = ritmo_minimo;
        this.ritmo_maximo = ritmo_maximo;
    }

    public RitmoCardiaco() {
        super();
        this.ritmo_minimo = 0;
        this.ritmo_maximo = 0;
    }

    public int getRitmo_minimo() {
        return ritmo_minimo;
    }

    public int getRitmo_maximo() {
        return ritmo_maximo;
    }

    public int comprobarLimites(int ritmo) {
        if (ritmo < ritmo_minimo || ritmo > ritmo_maximo) {
            return 1;
        } else {
            return 0;
        }
    }
}
