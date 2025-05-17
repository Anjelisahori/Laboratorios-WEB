package com.tecsup.demoalumno.model;
public class Alumno {
    private Long id;
    private String nombre;
    private String apellido;
    private String sexo;
    public Alumno(){}

    public Alumno(Long id, String nombre, String apellido, String sexo){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
    }

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getApellido() {return apellido;}
    public void setApellido(String apellido) {this.apellido = apellido;}

    public String getSexo() {return sexo;}
    public void setSexo(String sexo) {this.sexo = sexo;}

}
