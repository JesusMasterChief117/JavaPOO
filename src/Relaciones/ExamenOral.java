package Relaciones;

public class ExamenOral extends Examen{
    NivelSatisfaccion nivelSatisfaccion;

    public ExamenOral(String fecha, NivelSatisfaccion nivelSatisfaccion) {
        super(fecha);
        this.nivelSatisfaccion = nivelSatisfaccion;
    }


    @Override
    public boolean aprobo() {
        return false;
    }
}
