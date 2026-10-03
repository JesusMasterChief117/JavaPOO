package Relaciones;

public class ExamenEscrito extends Examen{
    private int duracion;
    private int nota;

    public ExamenEscrito(String fecha, int duracion, int nota) {
        super(fecha);
        this.duracion = duracion;
        this.nota = nota;
    }

    @Override
    public boolean aprobo() {
        return false;
    }
}
