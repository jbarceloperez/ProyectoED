package banco;

/**
 * Representa una cuenta bancaria con un número de cuenta, saldo y titular.
 * Permite realizar operaciones de ingreso y retiro de dinero.
 *
 * @author Javier Barceló
 * @version 0.1
 */
public class Cuenta {

    /** Número de cuenta bancaria. */
    private final String numero;

    /** Saldo actual de la cuenta. */
    private double saldo;

    /** Titular de la cuenta. */
    private Cliente titular;

    /**
     * Constructor de la clase Cuenta con titular.
     *
     * @param numero Número de la cuenta bancaria.
     * @param saldo Saldo inicial de la cuenta.
     * @param titular Cliente titular de la cuenta.
     */
    public Cuenta(String numero, double saldo, Cliente titular) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }

    /**
     * Constructor de la clase Cuenta sin titular.
     *
     * @param numero Número de la cuenta bancaria.
     * @param saldo Saldo inicial de la cuenta.
     */
    public Cuenta(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = null;
    }

    /**
     * Obtiene el número de cuenta.
     *
     * @return Número de cuenta bancaria.
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Obtiene el titular de la cuenta.
     *
     * @return Cliente titular de la cuenta.
     */
    public Cliente getTitular() {
        return titular;
    }

    /**
     * Obtiene el saldo de la cuenta.
     *
     * @return Saldo actual de la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Modifica el saldo de la cuenta.
     *
     * @param saldo Nuevo saldo de la cuenta.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Ingresa dinero en la cuenta.
     *
     * @param importe Cantidad a ingresar.
     * @return Nuevo saldo de la cuenta.
     * @throws ArithmeticException Si el importe es negativo.
     */
    protected double ingresarDinero(double importe) throws ArithmeticException {
        if (importe < 0) throw new ArithmeticException("No se puede ingresar un número negativo");
        return saldo += importe;
    }

    /**
     * Retira dinero de la cuenta.
     *
     * @param importe Cantidad a retirar.
     * @return Nuevo saldo de la cuenta.
     * @throws ArithmeticException Si el importe es negativo.
     */
    protected double retirarDinero(double importe) throws ArithmeticException {
        if (importe < 0) throw new ArithmeticException("No se puede retirar un número negativo");
        return saldo -= importe;
    }

    /**
     * Consulta los detalles de la cuenta.
     *
     * @return Cadena con el número de cuenta, saldo y titular.
     */
    public String consultarCuenta() {
        String str = "Número de cuenta: " + numero + "\n";
        str += "Saldo disponible: " + saldo + "€\n";
        if (titular != null) {
            str += "Titular de la cuenta: " + titular.getNombre();
        } else {
            str += "Cuenta sin titular asignado";
        }
        return str;
    }
}

