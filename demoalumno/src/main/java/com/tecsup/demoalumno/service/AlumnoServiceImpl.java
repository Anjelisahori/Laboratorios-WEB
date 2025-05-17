package com.tecsup.demoalumno.service;
import com.tecsup.demoalumno.dao.AlumnoDAO;
import com.tecsup.demoalumno.model.Alumno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class AlumnoServiceImpl implements AlumnoService {

        private final AlumnoDAO alumnoDAO;

        @Autowired
        public AlumnoServiceImpl(AlumnoDAO alumnoDAO) {
            this.alumnoDAO = alumnoDAO;
        }
        @Override
        public List<Alumno> listar(){
            return alumnoDAO.listar();
        }
        @Override
        public  Alumno obtener(Long id){
            return alumnoDAO.buscarporId(id);
        }
        @Override
        public void crear(Alumno alumno){
            alumnoDAO.guardar(alumno);
        }
        @Override
        public void actualizar(Alumno alumno){
            alumnoDAO.actualizar(alumno);
        }
        @Override
        public void eliminar(Long id){
            alumnoDAO.eliminar(id);
        }
}
