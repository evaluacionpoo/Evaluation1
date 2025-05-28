public class DiseñadorFreelance extends Freelancer implements Facturable {
    private double tarifaHora = 40.0;

    public DiseñadorFreelance(String nombre, int id, int horasTrabajadas) {
        super(nombre, id, horasTrabajadas);
    }

    @Override
    public double calcularPago() {
        return horasTrabajadas * tarifaHora;
    }

    @Override
    public void generarFactura() {
        System.out.println("Factura - Diseñador: " + nombre + ", Total a pagar: $" + calcularPago());
    }
}
