
package ec.gob.subsidio.modelo;

public class SolicitanteSubsidio {
    
    private String nombreCompleto;
    private String cedula;
    private double ingresosMensuales;
    private int cantidadVehiculos;
    private boolean viveEnEcuador;
    
    public SolicitanteSubsidio(String nombreCompleto, String cedula, double ingresosMensuales, int cantidadVehiculos, boolean viveEnEcuador) {
        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;
        setIngresosMensuales(ingresosMensuales);
        setCantidadVehiculos(cantidadVehiculos);
        this.viveEnEcuador = viveEnEcuador;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    } 
    
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    
    public String getCedula() {
        return cedula;
    }
    
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    public double getIngresosMensuales() {
        return ingresosMensuales;
    }
    
    public void setIngresosMensuales(double ingresosMensuales) {
        if (ingresosMensuales >= 470) {
            this.ingresosMensuales = ingresosMensuales;
        } else {
            System.out.println("Error: ingreso mensual debe ser mayor o igual a $470");
            this.ingresosMensuales = -1;
        }
    }    
    
    public int getCantidadVehiculos() {
        return cantidadVehiculos;
    }
    
    public void setCantidadVehiculos(int cantidadVehiculos) {
        if (cantidadVehiculos >= 0) {
            this.cantidadVehiculos = cantidadVehiculos;
        } else {
            System.out.println("Error: cantidad de vehiculos invalida");
        }
    }
    
    public boolean getViveEnEcuador() {
        return viveEnEcuador;
    }
    
    public void setViveEnEcuador(boolean viveEnEcuador) {
        this.viveEnEcuador = viveEnEcuador;
    }
    
    public boolean subsidioAprobado() {
        return ingresosMensuales >= 470 && ingresosMensuales <= 1200 && cantidadVehiculos <= 1 && viveEnEcuador;
    }
    
    public void generarResultado() {
        if (subsidioAprobado()) {
            System.out.println("Subsidio APROBADO");
        } else {
            System.out.println("Subsidio RECHAZADO");
            
            if (ingresosMensuales > 1200) {
                System.out.println("Ingreso mensual mayor a $1200");
            }
            if (cantidadVehiculos > 1) {
                System.out.println("Cantidad de vehiculos mayor a 1");
            }
            if (!viveEnEcuador) {
                System.out.println("No vive en Ecuador");
            }    
        }
    }
    
    @Override
    public String toString() {
        return "Nombre: " + nombreCompleto +
               "\nCedula: " + cedula +
               "\nIngresos mensuales: $" + ingresosMensuales +
               "\nCantidad de vehiculos: " + cantidadVehiculos +
               "\nVive en Ecuador: " + viveEnEcuador;
    }
    
    public static void mostrarReglasSubsidio() {
         System.out.println("===== Reglas para obtener el subsidio =====");
         System.out.println("1. Tener ingresos mensuales menores o iguales a $1.200");
         System.out.println("2. No poseer mas de un vehiculo registrado");
         System.out.println("3. Tener residencia en Ecuador");
         System.out.println("=========================================================");
    }
    
    public double calcularConsumoMensual() {
        double kmMensuales = 400;
        return kmMensuales / 40;
    }
    
    public double calcularConsumoMensual(double kmExtra) {
        double kmMensuales = 400 + kmExtra;
        return kmMensuales / 40;
    }
}
