package UniversidadUML;

public class Proyecto extends Evaluacion{

    public Proyecto(double calificacion, double ponderacion) {
        super(calificacion, ponderacion);
    }

    @Override
    public double calcularPuntaje(){
        return 0;
    }

}
