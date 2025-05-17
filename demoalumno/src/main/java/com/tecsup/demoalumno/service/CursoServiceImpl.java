package com.tecsup.demoalumno.service;
import com.tecsup.demoalumno.dao.CursoDAO;
import com.tecsup.demoalumno.model.Curso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoServiceImpl implements CursoService{
    private final CursoDAO cursoDAO;

    @Autowired
    public CursoServiceImpl(CursoDAO cursoDAO) {
        this.cursoDAO = cursoDAO;
    }

    @Override
    public List<Curso> listar(){
        return cursoDAO.listar();
    }

    @Override
    public  Curso obtener(Long id){
        return cursoDAO.buscarporId(id);
    }

    @Override
    public void crear(Curso curso){
        cursoDAO.guardar(curso);
    }

    @Override
    public void actualizar(Curso curso){
        cursoDAO.actualizar(curso);
    }

    @Override
    public void eliminar(Long id){
        cursoDAO.eliminar(id);
    }
}
