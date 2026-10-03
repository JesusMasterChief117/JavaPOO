package UniversidadUML;

public class Participacion extends Evaluacion{

    public Participacion(double calificacion, double ponderacion) {
        super(calificacion, ponderacion);
    }

    @Override
    public double calcularPuntaje(){
        return 0;
    }

}
