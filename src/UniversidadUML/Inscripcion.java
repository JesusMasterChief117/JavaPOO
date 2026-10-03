package UniversidadUML;

import java.util.Date;

public class Inscripcion {
    private int inscripcion;
    private Date fechaInscripcion;
    private double descuentoAnticipado;
    private double descuentoFrecuente;

    public Inscripcion(int inscripcion, Date fechaInscripcion, double descuentoAnticipado, double descuentoFrecuente) {
        this.inscripcion = inscripcion;
        this.fechaInscripcion = fechaInscripcion;
        this.descuentoAnticipado = descuentoAnticipado;
        this.descuentoFrecuente = descuentoFrecuente;
    }

    public void calcularDescuento(){

    }
    public void calcularTotal(){

    }
    public void determinarAprobacion(){

    }
}
