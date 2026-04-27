public class Cuenta {
    private String numerocuenta;
    private String titular;
    private double saldo;

    public Cuenta(String numerocuenta, String titular, double saldo){
        this.numerocuenta=numerocuenta;
        this.titular=titular;
        this.saldo=saldo;
    }
    public String getNumerocuenta(){
        return numerocuenta;
    }
    public String getTitular(){
        return titular;
    }
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void deposito(double monto){
        if (monto <= 0) {
            System.out.println("Monto no valido");
            return;
        }
        saldo += monto;
    }
    public void retiro(double monto) {
        if (monto <= 0) {
            System.out.println("Retiro invalido");
            return;
        }

        if (monto > saldo) {
            System.out.println("Fondos insuficientes");
            return;
        }

        saldo -= monto;
    }

    public double calcularInteresMensual() {
        return 0;
    }
}



