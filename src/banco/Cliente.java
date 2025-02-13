package banco;

import java.util.HashSet;
import java.util.Objects;

/**
 * Representa un cliente del banco con un nombre, DNI y una lista de cuentas asociadas.
 * Permite realizar operaciones como ingresar y retirar dinero.
 *
 * @author Javier Barceló
 * @version 0.1
 */
public class Cliente {

    /** Código de error para operaciones fallidas. */
    public static final double ERROR = -9999.9999;

    /** Nombre del cliente. */
    private String nombre;

    /** DNI del cliente, identificador único. */
    private final String dni;

    /** Conjunto de cuentas asociadas al cliente. */
    private HashSet<Cuenta> cuentas;

    /**
     * Constructor de la clase Cliente.
     *
     * @param nombre Nombre del cliente.
     * @param dni DNI del cliente.
     */
    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    /**
     * Obtiene el nombre del cliente.
     *
     * @return Nombre del cliente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre del cliente.
     *
     * @param nombre Nuevo nombre del cliente.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el DNI del cliente.
     *
     * @return DNI del cliente.
     */
    public String getDni() {
        return dni;
    }

    /**
     * Ingresa dinero en una cuenta si el cliente es su titular.
     *
     * @param cuenta Cuenta donde se realizará el ingreso.
     * @param importe Cantidad de dinero a ingresar.
     * @return Nuevo saldo de la cuenta o ERROR si la operación no es válida.
     */
    public double ingresarDinero(Cuenta cuenta, double importe) {
        if (cuenta.getTitular().equals(this)) {
            try {
                return cuenta.ingresarDinero(importe);
            } catch (ArithmeticException e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
        return ERROR;
    }

    /**
     * Retira dinero de una cuenta si el cliente es su titular.
     *
     * @param cuenta Cuenta de la cual se retirará el dinero.
     * @param importe Cantidad de dinero a retirar.
     * @return Nuevo saldo de la cuenta o ERROR si la operación no es válida.
     */
    public double retirarDinero(Cuenta cuenta, double importe) {
        if (cuenta.getTitular().equals(this)) {
            try {
                return cuenta.retirarDinero(importe);
            } catch (ArithmeticException e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
        return ERROR;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(dni, cliente.dni);
    }
}