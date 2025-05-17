package com.tecsup.demoalumno.dao;

import com.tecsup.demoalumno.model.Curso;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository
public class CursoDAOImpl implements CursoDAO{

    private final Map<Long, Curso> baseDatos = new HashMap<>();
    private long idAtual = 1;
    @Override
    public List<Curso> listar() {
        return new ArrayList<>(baseDatos.values());
    }

    @Override
    public Curso buscarporId(Long id){
        return baseDatos.get(id);
    }

    @Override
    public void guardar(Curso curso) {
        curso.setId(idAtual++);
        baseDatos.put(curso.getId(), curso);
    }

    @Override
    public void actualizar(Curso curso) {
        baseDatos.put(curso.getId(), curso);
    }

    @Override
    public void eliminar(Long id) {
        baseDatos.remove(id);
    }
}
