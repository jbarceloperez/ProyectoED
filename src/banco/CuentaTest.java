package banco;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class CuentaTest {
    @Test
    public void testGetSaldo() {
        Cuenta cuenta1 = new Cuenta("ES21092555879635214", 100);
        double saldo = cuenta1.getSaldo();
        assertEquals(100, saldo, 1);
    }

    @Test
    public void testSetSaldo() {
        Cuenta cuenta1 = new Cuenta("ES21092555879635214", 100);
        cuenta1.setSaldo(500);
        double saldo = cuenta1.getSaldo();
        assertEquals(500, saldo, 1);
    }

    @Test
    public void testIngresarDinero() {
        Cuenta cuenta1 = new Cuenta("ES21092555879635214", 100);
        double saldo = cuenta1.ingresarDinero(50);
        assertEquals(150, saldo, 1);
    }

    @Test
    public void testRetirarDinero() {
        Cuenta cuenta1 = new Cuenta("ES21092555879635214", 100);
        double saldo = cuenta1.retirarDinero(50);
        assertEquals(50, saldo, 1);
    }

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
