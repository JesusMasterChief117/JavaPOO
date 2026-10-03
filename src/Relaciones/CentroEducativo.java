package Relaciones;

import java.util.ArrayList;
import java.util.List;

public class CentroEducativo {
    private List<Alumno> alumnos;

    public CentroEducativo(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public void agregarAlumno(Alumno alumno){
        alumnos.add(alumno);
    }


}
