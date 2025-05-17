package com.tecsup.demoalumno.dao;
import com.tecsup.demoalumno.model.Alumno;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class AlumnoDAOImpl implements AlumnoDAO {
    private final Map<Long, Alumno> baseDatos = new HashMap<>();
    private long idAtual = 1;
    @Override
    public List<Alumno> listar() {
        return new ArrayList<>(baseDatos.values());
    }
    @Override
    public Alumno buscarporId(Long id){
        return baseDatos.get(id);
    }
    @Override
    public void guardar(Alumno alumno) {
        alumno.setId(idAtual++);
        baseDatos.put(alumno.getId(), alumno);
    }
    @Override
    public void actualizar(Alumno alumno) {
        baseDatos.put(alumno.getId(), alumno);
    }
    @Override
    public void eliminar(Long id) {
        baseDatos.remove(id);
    }
}
