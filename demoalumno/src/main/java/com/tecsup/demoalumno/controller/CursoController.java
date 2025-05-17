package com.tecsup.demoalumno.controller;

import com.tecsup.demoalumno.model.Curso;
import com.tecsup.demoalumno.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/curso")
public class CursoController {
    private final CursoService cursoService;
    @Autowired
    public CursoController(CursoService cursoService){
        this.cursoService = cursoService;
    }
    @GetMapping
    public List<Curso> listar(){
        return cursoService.listar();
    }
    @GetMapping("/{id}")
    public Curso obtener(@PathVariable Long id){
        return cursoService.obtener(id);
    }
    @PostMapping // CORREGIDO: antes era @GetMapping
    public void crear(@RequestBody Curso curso){
        cursoService.crear(curso);
    }
    @PutMapping("/{id}")
    public void actualizar(@PathVariable Long id, @RequestBody Curso curso){
        curso.setId(id);
        cursoService.actualizar(curso);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id){
        cursoService.eliminar(id);
    }
}
