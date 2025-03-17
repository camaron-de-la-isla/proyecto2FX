package com.example.proyecto2fx.model;

import java.sql.Timestamp;

public class MensajesEmergencia {
    private int mensaje_id;
    private int paciente_id;
    private int destinatario_id;
    private String mensaje;
    private Timestamp fecha_hora;
    private String estado;

    public MensajesEmergencia(int mensaje_id, int paciente_id, int destinatario_id, String mensaje, Timestamp fecha_hora, String estado) {
        this.mensaje_id = mensaje_id;
        this.paciente_id = paciente_id;
        this.destinatario_id = destinatario_id;
        this.mensaje = mensaje;
        this.fecha_hora = fecha_hora;
        this.estado = estado;
    }

    public MensajesEmergencia() {
        this.mensaje_id = 0;
        this.paciente_id = 0;
        this.destinatario_id = 0;
        this.mensaje = "";
        this.fecha_hora = null;
        this.estado = "";
    }

    public int getMensaje_id() {
        return mensaje_id;
    }

    public int getPaciente_id() {
        return paciente_id;
    }

    public int getDestinatario_id() {
        return destinatario_id;
    }

    public String getMensaje() {
        return mensaje;
    }

    public Timestamp getFecha_hora() {
        return fecha_hora;
    }
}
