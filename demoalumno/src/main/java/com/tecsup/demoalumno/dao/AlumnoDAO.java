package com.tecsup.demoalumno.dao;
import com.tecsup.demoalumno.model.Alumno;
import java.util.List;
public interface AlumnoDAO {
    List<Alumno> listar();
    Alumno buscarporId(Long id);
    void guardar(Alumno curso);
    void actualizar(Alumno curso);
    void eliminar(Long id);
}

