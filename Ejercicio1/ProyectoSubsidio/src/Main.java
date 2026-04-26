import ec.gob.subsidio.modelo.SolicitanteSubsidio;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        SolicitanteSubsidio.mostrarReglasSubsidio();
        
        System.out.print("Ingrese su nombre completo: ");
        String nombreCompleto = sc.nextLine();
        
        System.out.print("Ingrese su cedula: ");
        String cedula = sc.nextLine();
        
        System.out.print("Ingrese sus ingresos mensuales: ");
        double ingresosMensuales = sc.nextDouble();
        
        System.out.print("Ingrese la cantidad de vehiculos registrados: ");
        int vehiculosRegistrados = sc.nextInt();
        
        System.out.print("¿Vive en Ecuador? (true/false): ");
        boolean viveEnEcuador = sc.nextBoolean();
        
        SolicitanteSubsidio solicitante = new SolicitanteSubsidio(nombreCompleto, cedula, ingresosMensuales, vehiculosRegistrados, viveEnEcuador);
        
        System.out.println("===== Datos del solicitante =====");
        System.out.println(solicitante);
        
        System.out.println("===== Resultado de la evaluacion =====");
        solicitante.generarResultado();
        
        System.out.println("===== Calculo de consumo mensual =====");
        
        double consumoBase = solicitante.calcularConsumoMensual();
        System.out.println("Consumo mensual estimado (sin km extra): " + consumoBase + " galones");
        
        double kmExtra = 80;
        double consumoExtra = solicitante.calcularConsumoMensual(kmExtra);
        System.out.println("Consumo con kilometros extra (" + kmExtra + " km adicionales): " + consumoExtra + " galones");
        
    }
    
}
