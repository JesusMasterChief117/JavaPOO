package UniversidadUML;

public abstract class Evaluacion {
    private double calificacion;
    private double ponderacion;

    public Evaluacion(double calificacion, double ponderacion) {
        this.calificacion = calificacion;
        this.ponderacion = ponderacion;
    }

    public abstract double calcularPuntaje();
}
