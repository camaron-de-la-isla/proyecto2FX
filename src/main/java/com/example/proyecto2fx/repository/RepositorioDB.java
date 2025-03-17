package com.example.proyecto2fx.repository;


import com.example.proyecto2fx.model.*;

import javax.print.Doc;
import java.util.ArrayList;


public class RepositorioDB {
    public ArrayList<Usuario> loadUsuarios() {
        return null; //REMPLAZAR
    }

    public Usuario loadUsuario(int id) {
        ArrayList<Usuario> usuarios = loadUsuarios();
        int i = 0;
        boolean encontrado = false;
        Usuario usuario = null;
        while(i<usuarios.size() && !encontrado) {
            if(usuarios.get(i).getUsuario_id() == id) {
                encontrado = true;
                usuario = usuarios.get(i);
            }
            i++;
        }
        return usuario;
    }

    public ArrayList<Cuidador> loadCuidadores() {
        ArrayList<Usuario> usuarios = loadUsuarios();
        ArrayList<Cuidador> cuidadores = new ArrayList<>();
        for (Usuario u : usuarios) {
            if (u instanceof Cuidador) {
                cuidadores.add((Cuidador) u);
            }
        }
        return cuidadores;
    }

    public Cuidador loadCuidador(int id) {
        ArrayList<Cuidador> cuidadores = loadCuidadores();
        int i = 0;
        boolean encontrado = false;
        Cuidador cuidador = null;
        while(i<cuidadores.size() && !encontrado) {
            if(cuidadores.get(i).getUsuario_id() == id) {
                encontrado = true;
                cuidador = cuidadores.get(i);
            }
            i++;
        }
        return cuidador;
    }

    public void saveCuidador(Cuidador cuidador) {
        //REMPLAZAR
    }

    public ArrayList<Doctor> loadDoctores() {
        ArrayList<Usuario> usuarios = loadUsuarios();
        ArrayList<Doctor> doctores = new ArrayList<>();
        for (Usuario u : usuarios) {
            if (u instanceof Doctor) {
                doctores.add((Doctor) u);
            }
        }
        return doctores;
    }

    public Doctor loadDoctor(int id) {
        ArrayList<Doctor> doctores = loadDoctores();
        int i = 0;
        boolean encontrado = false;
        Doctor doctor = null;
        while(i<doctores.size() && !encontrado) {
            if(doctores.get(i).getUsuario_id() == id) {
                encontrado = true;
                doctor = doctores.get(i);
            }
            i++;
        }
        return doctor;
    }

    public void saveDoctor(Doctor doctor) {
        //REMPLAZAR
    }

    public ArrayList<Paciente> loadPacientes() {
        ArrayList<Usuario> usuarios = loadUsuarios();
        ArrayList<Paciente> pacientes = new ArrayList<>();
        for (Usuario u : usuarios) {
            if (u instanceof Paciente) {
                pacientes.add((Paciente) u);
            }
        }
        return pacientes;
    }

    public Paciente loadPaciente(int id) {
        ArrayList<Paciente> pacientes = loadPacientes();
        Paciente paciente = null;
        int i = 0;
        boolean encontrado = false;
        while(i<pacientes.size() && !encontrado) {
            if(pacientes.get(i).getUsuario_id() == id) {
                encontrado = true;
                paciente = pacientes.get(i);
            }
            i++;
        }
        return paciente;
    }

    public void savePaciente(Paciente paciente) {
        //REMPLAZAR
    }

    public Relacion[] loadRelaciones() {
        return new Relacion[0]; //REMPLAZAR
    }

    public Relacion loadRelacion(int id) {
        Relacion[] relaciones = loadRelaciones();
        Relacion relacion = null;
        int i = 0;
        boolean encontrado = false;
        while(i<relaciones.length && !encontrado) {
            if(relaciones[i].getRelacion_id() == id) {
                encontrado = true;
                relacion = relaciones[i];
            }
            i++;
        }
        return relacion;
    }

    public void saveRelacion(Relacion relacion) {
        //REMPLAZAR
    }

    public Relacion[] loadRelacionesPaciente(int id) {
        return new Relacion[0]; //REMPLAZAR
    }

    public Relacion[] loadRelacionesCuidador(int id) {
        return new Relacion[0]; //REMPLAZAR
    }

    public Relacion[] loadRelacionesDoctor(int id) {
        return new Relacion[0]; //REMPLAZAR
    }

}
