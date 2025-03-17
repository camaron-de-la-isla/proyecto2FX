package com.example.proyecto2fx.model;

import java.sql.Timestamp;

public class Sensor {
    private  int sensor_id;
    private   int paciente_id;
    Timestamp fecha_instalacion;

    public Sensor(int sensor_id, int paciente_id, Timestamp fecha_instalacion) {
        this.sensor_id = sensor_id;
        this.paciente_id = paciente_id;
        this.fecha_instalacion = fecha_instalacion;
    }

    public Sensor() {
        this.sensor_id = 0;
        this.paciente_id = 0;
        this.fecha_instalacion = null;
    }

    public int getSensor_id() {
        return sensor_id;
    }

    public int getPaciente_id() {
        return paciente_id;
    }

    public Timestamp getFecha_instalacion() {
        return fecha_instalacion;
    }

}
