import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear una lista de freelancers
        ArrayList<Freelancer> listaFreelancers = new ArrayList<>();

        // Crear objetos y agregarlos a la lista
        ProgramadorFreelance programador = new ProgramadorFreelance("Carlos", 101, 20);
        DiseñadorFreelance disenador = new DiseñadorFreelance("Ana", 102, 15);
        RedactorFreelance redactor = new RedactorFreelance("Luis", 103, 25, 20.0);

        listaFreelancers.add(programador);
        listaFreelancers.add(disenador);
        listaFreelancers.add(redactor);

        // Variable para sumar todos los pagos
        double pagoTotal = 0;

        // Recorrer la lista y mostrar la información
        for (Freelancer f : listaFreelancers) {
            System.out.println("---- Información del Freelancer ----");
            f.mostrarInformacion();
            double pago = f.calcularPago();
            System.out.println("Pago calculado: $" + pago);
            pagoTotal += pago;

            // Generar factura si implementa la interfaz
            if (f instanceof Facturable) {
                ((Facturable) f).generarFactura();
            }

            System.out.println("-----------------------------------\n");
        }

        // Mostrar el pago total
        System.out.println(">>> Pago total a todos los freelancers: $" + pagoTotal);
    }
}