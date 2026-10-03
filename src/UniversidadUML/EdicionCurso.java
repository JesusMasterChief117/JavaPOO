package UniversidadUML;

import java.util.Date;

public abstract class EdicionCurso {
    private int idEdicion;
    private String periodo;
    private Date fechaInicio;

    public abstract double calcularCosto();
}
