package Relaciones;

import java.util.List;

public class Alumno implements Aprobable{
    private String DNI;
    private String apellido;
    private String nombre;
    private List<Examen> examenes;

    public Alumno(String DNI, String apellido, String nombre) {
        this.DNI = DNI;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public void agregarExamen(Examen e){
        examenes.add(e);
    }

    @Override
    public boolean aprovo() {
        return false;
    }
}
