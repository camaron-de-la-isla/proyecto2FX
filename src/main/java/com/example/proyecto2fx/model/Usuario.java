package com.example.proyecto2fx.model;


import com.example.proyecto2fx.repository.RepositorioDB;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Timestamp;
import java.util.List;

public class Usuario {
    int usuario_id;
    private String nombre;
    private String apellido;
    private String email;
    private String contrasena_hash;
    private Timestamp fecha_nacimiento;
    private String telefono;
    private String direccion;


    public Usuario(int usuarioId, String nombre, String apellido, String email, String contrasenaHash, Timestamp fechaNacimiento) {
        this.usuario_id = usuarioId;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.contrasena_hash = getHash(contrasenaHash);
        this.fecha_nacimiento = fechaNacimiento;
    }

    public Usuario(){
        usuario_id = 0;
        nombre = "";
        apellido = "";
        email = "";
        contrasena_hash = "";
        fecha_nacimiento = null;
        telefono = "";
        direccion = "";
    }


    public int getUsuario_id() {
        return usuario_id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public String getContrasena_hash() {
        return contrasena_hash;
    }

    public Timestamp getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getHash(String contrasena){
        return contrasena;
    }

    public static String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = md.digest(password.getBytes(StandardCharsets.UTF_8));
            return bytesToHex(hashBytes);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    private static String bytesToHex(byte[] bytes) {
        StringBuilder hexString = new StringBuilder();
        for (byte b : bytes) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }

    public List<Relacion> getRelacionesFiltradas() {
        RepositorioDB repositorioDB = new RepositorioDB();
        Relacion[] relaciones = repositorioDB.loadRelacionesPaciente(this.usuario_id);
        List<Relacion> relacionesFiltradas = new java.util.ArrayList<>(List.of());

        for(int i = 0; i < relaciones.length; i++) {
            if(relaciones[i].getPaciente_id() == this.usuario_id) {
                relacionesFiltradas.add(relaciones[i]);
            }
        }

        return relacionesFiltradas;
    }

    public boolean auth(String user, String pass){
        String hashPass = hashPassword(pass);
        if(user.equals(this.email) && hashPass.equals(this.contrasena_hash)){
            return true;
        }else{
            return false;
        }
    }
}