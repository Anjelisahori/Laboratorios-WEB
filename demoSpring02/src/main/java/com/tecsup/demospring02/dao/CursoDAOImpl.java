package com.tecsup.demospring02.dao;

import org.springframework.stereotype.Repository;

@Repository
public class CursoDAOImpl implements CursoDAO {
    @Override
    public String obtenerNombreCurso() {
        return "Curso desde la capa DAO";
    }
}
