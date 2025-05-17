package com.tecsup.demoalumno.controller;
import com.tecsup.demoalumno.model.Alumno;
import com.tecsup.demoalumno.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/alumno")
public class AlumnoController {

    private final AlumnoService alumnoService;
    @Autowired
    public AlumnoController(AlumnoService alumnoService){
        this.alumnoService = alumnoService;
    }
    @GetMapping
    public List<Alumno> listar(){
        return alumnoService.listar();
    }
    @GetMapping("/{id}")
    public Alumno obtener(@PathVariable Long id){
        return alumnoService.obtener(id);
    }
    @PostMapping // CORREGIDO: antes era @GetMapping
    public void crear(@RequestBody Alumno alumno){
        alumnoService.crear(alumno);
    }
    @PutMapping("/{id}")
    public void actualizar(@PathVariable Long id, @RequestBody Alumno alumno){
        alumno.setId(id);
        alumnoService.actualizar(alumno);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id){
        alumnoService.eliminar(id);
    }
}



