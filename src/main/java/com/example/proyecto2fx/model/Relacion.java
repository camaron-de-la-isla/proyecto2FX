package com.example.proyecto2fx.model;

public class Relacion {
    private int relacion_id;
    private int paciente_id;
    private int doctor_id;
    private int cuidador_id;
    private boolean doctor_paciente;
    private boolean cuidador_paciente;

    public Relacion(int relacion_id, int paciente_id, int doctor_id, int cuidador_id, boolean doctor_paciente, boolean cuidador_paciente) {
        this.relacion_id = relacion_id;
        this.paciente_id = paciente_id;
        this.doctor_id = doctor_id;
        this.cuidador_id = cuidador_id;
        this.doctor_paciente = doctor_paciente;
        this.cuidador_paciente = cuidador_paciente;
    }

    public Relacion(){
        relacion_id = 0;
        paciente_id = 0;
        doctor_id = 0;
        cuidador_id = 0;
        doctor_paciente = false;
        cuidador_paciente = false;
    }

    public int getRelacion_id() {
        return relacion_id;
    }

    public int getPaciente_id() {
        return paciente_id;
    }

    public int getDoctor_id() {
        return doctor_id;
    }

    public int getCuidador_id() {
        return cuidador_id;
    }

}
