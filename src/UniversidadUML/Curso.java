package UniversidadUML;

public class Curso {
    private String clave;
    private String nombre;
    private int duracionHoras;
    private double costoBase;
    private int cupoMaximo;

    public Curso(String clave, String nombre, int duracionHoras, double costoBase, int cupoMaximo) {
        this.clave = clave;
        this.nombre = nombre;
        this.duracionHoras = duracionHoras;
        this.costoBase = costoBase;
        this.cupoMaximo = cupoMaximo;
    }
}
