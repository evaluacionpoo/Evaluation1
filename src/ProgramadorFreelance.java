public class ProgramadorFreelance extends Freelancer implements Facturable {

    private double tarifaHora = 50.0;

    public ProgramadorFreelance(String nombre,int id, int horasTrabajadas){
        super(nombre, id, horasTrabajadas);
    }

    @Override
    public double calcularPago(){
        return horasTrabajadas * tarifaHora;
    }
    @Override
    public void generarFactura(){
        System.out.println("Factura - Programador: " + nombre + ", Total a pagar: $" + calcularPago());
    }
}
