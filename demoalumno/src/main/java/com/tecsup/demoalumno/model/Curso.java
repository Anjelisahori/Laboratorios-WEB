package com.tecsup.demoalumno.model;

public class Curso {
    private Long id;
    private String nombre;
    private String creditos;


    public Curso() {}

    public Curso(Long id, String nombre, String creditos) {
        this.id = id;
        this.nombre = nombre;
        this.creditos = creditos;
    }

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getCreditos() {return creditos;}
    public void setCreditos(String creditos) {this.creditos = creditos;}
}
