package Relaciones;

public abstract class Examen {
    private String fecha;

    public Examen(String fecha) {
        this.fecha = fecha;
    }

    public abstract boolean aprobo();
}
