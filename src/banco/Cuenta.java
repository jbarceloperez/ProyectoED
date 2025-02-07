package banco;

public class Cuenta {
    private String numero;      // num de la cuenta bancaria
    private double saldo;
    private Cliente titular;

    // cambio
    public Cuenta(String numero, double saldo, Cliente titular) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }

    public Cuenta(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = null;
    }


    public String getNumero() {
        return numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    protected double ingresarDinero(double importe) throws ArithmeticException {
        if (importe < 0) throw new ArithmeticException("No se puede ingresar un número negativo");
        return saldo = saldo + importe;
    }

    protected double retirarDinero(double importe) throws ArithmeticException {
        if (importe < 0) throw new ArithmeticException("No se puede retirar un número negativo");
        return saldo = saldo - importe;
    }

    public String consultarCuenta() {
        String str = "Número de cuenta: " + numero + "\n";
        str += "Saldo disponible: " + saldo + "€\n";
        str += "Titular de la cuenta: " + titular.getNombre();

        return str;
    }
}
