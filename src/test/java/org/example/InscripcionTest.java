package org.example;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest {

    @org.junit.jupiter.api.Test
    void aprobada() {
        Materia m1 = new Materia("AM1");
        Materia m2 = new Materia("AGA");
        Materia m3 = new Materia("AM2");
        Materia m4 = new Materia("SUPERIOR");
        m3.AgregarCorrelativas(m1,m2);
        m4.AgregarCorrelativas(m3);

        Alumno juan = new Alumno("Juan ramirez","2222");
        Alumno jorge = new Alumno("jorge lopez","3333");
        juan.AgregarAprobadas(m1);

        jorge.AgregarAprobadas(m1,m2);

        Inscripcion unaInsc = new Inscripcion(juan);
        unaInsc.AgregarMaterias(m3);

        Assertions.assertFalse(unaInsc.aprobada());

        Inscripcion otra = new Inscripcion(jorge);
        otra.AgregarMaterias(m3);

        Assertions.assertTrue(otra.aprobada());

        Inscripcion otraMas = new Inscripcion(juan);

        otraMas.AgregarMaterias(m4);

        assertFalse(otraMas.aprobada());
    }
}