package org.example;

import java.util.ArrayList;
import java.util.Collections;


public class Inscripcion {
    private Alumno alumno;
    private ArrayList<Materia> materias = new ArrayList<Materia>();

    public Inscripcion(Alumno alu) {
        this.alumno = alu;
    }

    public void AgregarMaterias (Materia ... mats){
        Collections.addAll(this.materias,mats);
    }

    public boolean aprobada(){
        return materias.stream().allMatch(m -> alumno.PuedeCursar(m));
    }

}
