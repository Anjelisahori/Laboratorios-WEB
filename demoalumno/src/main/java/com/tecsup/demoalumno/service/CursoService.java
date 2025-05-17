package com.tecsup.demoalumno.service;

import com.tecsup.demoalumno.model.Curso;

import java.util.List;

public interface CursoService {
    List<Curso> listar();
    Curso obtener(Long id);
    void crear(Curso curso);
    void actualizar(Curso curso);
    void eliminar(Long id);
}
