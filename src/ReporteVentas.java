public class ReporteVentas extends Reporte implements Exportable{

    public ReporteVentas(String titulo) {
        super(titulo);
    }

    @Override
    public double calcularTotal() {
        return 12500.00;
    }

    @Override
    public String exportar() {
        return titulo + " exportado";
    }
}
