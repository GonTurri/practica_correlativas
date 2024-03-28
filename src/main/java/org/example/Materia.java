package org.example;

import java.util.ArrayList;
import java.util.Collections;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Materia {
    private String nombre;
    private ArrayList<Materia> correlativas = new ArrayList<Materia>();

    public ArrayList<Materia> getCorrelativas() {
        return correlativas;
    }

    public void AgregarCorrelativas(Materia ... mats) {
        Collections.addAll(this.correlativas,mats);
    }

    public Materia(String _nombre){
        this.nombre = _nombre;
    }

}