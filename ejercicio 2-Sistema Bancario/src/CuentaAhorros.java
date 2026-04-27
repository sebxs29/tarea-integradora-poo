class CuentaAhorros extends Cuenta {

    public CuentaAhorros(String numeroCuenta, String titular, double saldo) {
        super(numeroCuenta, titular, saldo);
    }

    @Override
    public double calcularInteresMensual() {
        double interes = getSaldo() * 0.03 / 12;
        setSaldo(getSaldo() + interes);
        return interes;
    }
}
