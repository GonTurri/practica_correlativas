package org.example;

import java.util.ArrayList;
import java.util.Collections;


public class Alumno {
    private String nombreYApellido;
    private String legajo;
    private ArrayList<Materia> materiasAprobadas = new ArrayList<Materia>();

    public void AgregarAprobadas(Materia ... mats){
        Collections.addAll(this.materiasAprobadas,mats);
    }
    public Alumno(String _nombre, String legajo){
        this.legajo = legajo;
        this.nombreYApellido = _nombre;
    }

    public boolean PuedeCursar(Materia mat){
        return materiasAprobadas.containsAll(mat.getCorrelativas());
    }

}
