package com.tecsup.demospring01;

import org.springframework.stereotype.Component;

@Component
public class CursoService {

    public String obtenerNombreCurso() {
        return "Curso de Spring Framework";
    }
}
