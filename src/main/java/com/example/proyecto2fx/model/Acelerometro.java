package com.example.proyecto2fx.model;

import java.sql.Timestamp;

public class Acelerometro extends Sensor {
    private String max_aceleracion;

    public Acelerometro(int sensor_id, int paciente_id, Timestamp fecha_instalacion, String max_aceleracion) {
        super(sensor_id, paciente_id, fecha_instalacion);
        this.max_aceleracion = max_aceleracion;
    }

    public Acelerometro() {
        super();
        this.max_aceleracion = null;
    }

    public String getMax_aceleracion() {
        return max_aceleracion;
    }

    public Boolean comprobarCaida(String max_aceleracion, String min_aceleracion) {
        return this.max_aceleracion.equals(max_aceleracion);
    }
}
