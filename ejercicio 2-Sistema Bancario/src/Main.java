import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Cuenta> cuentas = new ArrayList<>();

        cuentas.add(new CuentaAhorros("001", "Ana Pérez", 1200));
        cuentas.add(new CuentaCorriente("002", "Luis Gómez", 800));
        cuentas.add(new CuentaInversion("003", "María López", 7000));

        double totalIntereses = 0;

        System.out.println("REPORTE BANCARIO");

        for (Cuenta c : cuentas) {
            double interes = c.calcularInteresMensual();
            totalIntereses += interes;

            System.out.println("Titular: " + c.getTitular());
            System.out.println("Cuenta: " + c.getNumerocuenta());
            System.out.println("Interes mensual: " + interes);
            System.out.println("Saldo actual: " + c.getSaldo());
            System.out.println("------------------------");
        }

        System.out.println("Total de intereses : " + totalIntereses);
    }
}
