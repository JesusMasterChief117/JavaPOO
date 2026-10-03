package UniversidadUML;

import java.util.ArrayList;
import java.util.List;

public class Universidad {
    public String nombre;
    public List<Instructor> instructores;
    public List<Curso> Cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.instructores = new ArrayList<>();
        this.Cursos = new ArrayList<>();
    }

    public Instructor registrarInstructor(Instructor nuevoInstructor){
        instructores.add(nuevoInstructor);
        return nuevoInstructor;
    }

    public Curso registrarCurso(Curso nuevoCurso){
        this.Cursos.add(nuevoCurso);
        return nuevoCurso;
    }

}
