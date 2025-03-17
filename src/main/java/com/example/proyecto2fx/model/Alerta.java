package com.example.proyecto2fx.model;

import java.sql.Timestamp;

public class Alerta {
    private int alerta_id;
    private int paciente_id;
    private int sensor_id;
    private String tipo_alerta;
    private String descripcion;
    private Timestamp fecha_hora;
    private  String estado;

    public Alerta(int alerta_id, int paciente_id, int sensor_id, String tipo_alerta, String descripcion, Timestamp fecha_hora, String estado) {
        this.alerta_id = alerta_id;
        this.paciente_id = paciente_id;
        this.sensor_id = sensor_id;
        this.tipo_alerta = tipo_alerta;
        this.descripcion = descripcion;
        this.fecha_hora = fecha_hora;
        this.estado = estado;
    }

    public Alerta() {
        this.alerta_id = 0;
        this.paciente_id = 0;
        this.sensor_id = 0;
        this.tipo_alerta = "";
        this.descripcion = "";
        this.fecha_hora = null;
        this.estado = "";
    }

    public int getAlerta_id() {
        return alerta_id;
    }

    public int getPaciente_id() {
        return paciente_id;
    }

    public int getSensor_id() {
        return sensor_id;
    }

    public String getTipo_alerta() {
        return tipo_alerta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Timestamp getFecha_hora() {
        return fecha_hora;
    }
}
