class CuentaCorriente extends Cuenta{
    private double SOBREGIRO = 500;

    public CuentaCorriente(String numeroCuenta, String titular, double saldo) {
        super(numeroCuenta, titular, saldo);
    }

    @Override
    public void retiro(double monto) {
        if (monto <= 0) {
            System.out.println("Retiro invalido");
            return;
        }

        if (getSaldo() - monto < -SOBREGIRO) {
            System.out.println("Sobregiro");
            return;
        }

        setSaldo(getSaldo() - monto);
    }

    @Override
    public double calcularInteresMensual() {
        return 0;
    }
}