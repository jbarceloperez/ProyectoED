package banco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test suite con las pruebas unitarias definidas para los métodos de la clase Cliente.
 * @author Javier Barceló
 */
public class ClienteTest {

    private Cliente cliente1;
    private Cliente cliente2;
    private Cuenta cuenta1;
    private Cuenta cuenta2;

    /**
     * Método setup para los tests unitarios de la clase.
     */
    @Before
    public void crearObjetos() {
        cliente1 = new Cliente("Javi", "24458996R");
        cliente2 = new Cliente("María", "49125587C");
        cuenta1 = new Cuenta("ES25464544343543535", 100, cliente1);
        cuenta2 = new Cuenta("ES25334432343543535", 0, cliente2);
    }

    /**
     * Test unitario que prueba el método {@link Cliente#ingresarDinero(Cuenta, double)} en caso de no lanzar un error.
     * @see Cliente#ingresarDinero(Cuenta, double)
     */
    @Test
    public void testIngresarDineroSuccess() {
        double saldo = cliente1.ingresarDinero(cuenta1, 10);
        assertEquals(110, saldo, 0.1);
    }

    /**
     * Test unitario que prueba el método {@link Cliente#ingresarDinero(Cuenta, double)} en caso de lanzar un error.
     * @see Cliente#ingresarDinero(Cuenta, double)
     */
    @Test
    public void testIngresarDineroFail() {
        double saldo = cliente2.ingresarDinero(cuenta1, 10);
        assertEquals(Cliente.ERROR, saldo, 0.1);
    }


}
