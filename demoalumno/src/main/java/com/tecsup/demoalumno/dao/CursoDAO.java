package com.tecsup.demoalumno.dao;

import com.tecsup.demoalumno.model.Curso;

import java.util.List;

public interface CursoDAO {
    List<Curso> listar();
    Curso buscarporId(Long id);
    void guardar(Curso curso);
    void actualizar(Curso curso);
    void eliminar(Long id);
}
