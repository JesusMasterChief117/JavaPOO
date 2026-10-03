public abstract class Reporte {
    protected String titulo;

    public Reporte(String titulo) {
        this.titulo = titulo;
    }

    public abstract double calcularTotal();
}
