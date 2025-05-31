public class RedactorFreelance extends Freelancer implements Facturable {
    double pagoPorHora;

    public RedactorFreelance(String nombre, int id, int horasTrabajadas, double pagoPorHora) {
        super(nombre, id, horasTrabajadas);
        this.pagoPorHora = pagoPorHora;
    }

    public double calcularPago() {
        return horasTrabajadas * pagoPorHora;
    }

    public void generarFactura() {
        System.out.println("Factura para Redactor " + nombre + ": $" + calcularPago());
    }
}
