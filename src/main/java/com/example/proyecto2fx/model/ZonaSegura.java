package com.example.proyecto2fx.model;

import java.awt.*;

public class ZonaSegura {
    int zona_id;
    int paciente_id;
    String nombre;
    Coordenada[] coordenadas;

    public ZonaSegura(int zona_id, int paciente_id, String nombre, Coordenada[] coordenadas) {
        this.zona_id = zona_id;
        this.paciente_id = paciente_id;
        this.nombre = nombre;
        this.coordenadas = coordenadas;
    }

    public ZonaSegura() {
        this.zona_id = 0;
        this.paciente_id = 0;
        this.nombre = "";
        this.coordenadas = null;
    }

    public int getZona_id() {
        return zona_id;
    }

    public int getPaciente_id() {
        return paciente_id;
    }

    public String getNombre() {
        return nombre;
    }

    public Coordenada[] getCoordenadas() {
        return coordenadas;
    }

    public boolean dentroZonaSegura(double x, double y) {
        Polygon polygon = new Polygon();
        for (Coordenada coordenada : coordenadas) {
            polygon.addPoint(coordenada.getX(), coordenada.getY());
        }
        return polygon.contains(x, y);
    }

}
