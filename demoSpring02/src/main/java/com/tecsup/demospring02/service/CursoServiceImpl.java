package com.tecsup.demospring02.service;

import com.tecsup.demospring02.dao.CursoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoServiceImpl implements CursoService {

    private final CursoDAO cursoDAO;

    @Override
    public String obtenerNombreCurso() {
        return cursoDAO.obtenerNombreCurso();
    }

    @Autowired
    public CursoServiceImpl(CursoDAO cursoDAO) {
        this.cursoDAO = cursoDAO;
    }
}
