package banco;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Test suite con las pruebas unitarias definidas para los métodos de la clase Cuenta.
 * @author Javier Barceló
 */
public class CuentaTest {
    /**
     * Test unitario para la función {@link Cuenta#getSaldo()}.
     * @see Cuenta#getSaldo()
     */
    @Test
    public void testGetSaldo() {
        Cuenta cuenta1 = new Cuenta("ES21092555879635214", 100);
        double saldo = cuenta1.getSaldo();
        assertEquals(100, saldo, 1);
    }

    /**
     * Test unitario para la función {@link Cuenta#setSaldo(double)}.
     * @see Cuenta#setSaldo(double)
     */
    @Test
    public void testSetSaldo() {
        Cuenta cuenta1 = new Cuenta("ES21092555879635214", 100);
        cuenta1.setSaldo(500);
        double saldo = cuenta1.getSaldo();
        assertEquals(500, saldo, 1);
    }

    /**
     * Test unitario para la función {@link Cuenta#ingresarDinero(double)} en caso de no haber ninguna excepción.
     * @see Cuenta#ingresarDinero(double)
     */
    @Test
    public void testIngresarDinero() {
        Cuenta cuenta1 = new Cuenta("ES21092555879635214", 100);
        double saldo = cuenta1.ingresarDinero(50);
        assertEquals(150, saldo, 1);
    }

    /**
     * Test unitario para la función {@link Cuenta#retirarDinero(double)}
     * en caso de no haber ninguna excepción.
     * @see Cuenta#retirarDinero(double)
     */
    @Test
    public void testRetirarDinero() {
        Cuenta cuenta1 = new Cuenta("ES21092555879635214", 100);
        double saldo = cuenta1.retirarDinero(50);
        assertEquals(50, saldo, 1);
    }

    /**
     * Test unitario para la función {@link Cuenta#ingresarDinero(double)} cuando
     * ocurre una excepción por ingresar dinero negativo.
     * @see Cuenta#ingresarDinero(double)
     */
    @Test
    public void testIngresarDineroExcepcion() {
        Cuenta cuenta1 = new Cuenta("ES21092555879635214", 100);
        try {
            cuenta1.ingresarDinero(-50);
            fail("No ha saltado la excepción.");
        } catch (ArithmeticException e) {
            // Test correcto
        }
    }

}
