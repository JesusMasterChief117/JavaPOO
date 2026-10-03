package UniversidadUML;

public class Examen extends Evaluacion{

    public Examen(double calificacion, double ponderacion) {
        super(calificacion, ponderacion);
    }

    @Override
    public double calcularPuntaje(){
        return 0;
    }
}
