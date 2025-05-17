package com.tecsup.demoalumno.service;

import com.tecsup.demoalumno.model.Alumno;

import java.util.List;

public interface AlumnoService {
    List<Alumno> listar();
    Alumno obtener(Long id);
    void crear(Alumno alumno);
    void actualizar(Alumno alumno);
    void eliminar(Long id);
}
