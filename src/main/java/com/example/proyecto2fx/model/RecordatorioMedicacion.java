package com.example.proyecto2fx.model;

public class RecordatorioMedicacion {
    private int recordatorio_id;
    private int paciente_id;
    private String medicamento;
    private String hora;
    private String dosis;
    private boolean confirmado;

    public RecordatorioMedicacion(int recordatorio_id, int paciente_id, String medicamento, String hora, String dosis, boolean confirmado) {
        this.recordatorio_id = recordatorio_id;
        this.paciente_id = paciente_id;
        this.medicamento = medicamento;
        this.hora = hora;
        this.dosis = dosis;
        this.confirmado = confirmado;
    }

    public RecordatorioMedicacion() {
        recordatorio_id = 0;
        paciente_id = 0;
        medicamento = "";
        hora = "";
        dosis = "";
        confirmado = false;
    }

    public int getRecordatorio_id() {
        return recordatorio_id;
    }

    public int getPaciente_id() {
        return paciente_id;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public String getHora() {
        return hora;
    }

    public String getDosis() {
        return dosis;
    }

    public boolean isConfirmado() {
        return confirmado;
    }
}
