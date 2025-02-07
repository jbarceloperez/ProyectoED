package banco;

import java.util.HashSet;
import java.util.Objects;

public class Cliente {

    public static double ERROR = -9999.9999;
    private String nombre;
    private String dni;     // identificador del usuario
    private HashSet<Cuenta> cuentas;

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

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
