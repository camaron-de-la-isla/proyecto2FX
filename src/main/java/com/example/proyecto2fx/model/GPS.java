package com.example.proyecto2fx.model;

import java.sql.Timestamp;

public class GPS extends Sensor{
    private  ZonaSegura zonaSegura;

    public GPS(int sensor_id, int paciente_id, Timestamp fecha_instalacion, ZonaSegura zonaSegura) {
        super(sensor_id, paciente_id, fecha_instalacion);
        this.zonaSegura = zonaSegura;
    }

    public GPS() {
        super();
        this.zonaSegura = null;
    }

    public Boolean comprobarZonaSegura(String coordenadas) {
        return false; //REMPLAZAR
    }

    public ZonaSegura getZonaSegura() {
        return zonaSegura;
    }
}
