import banco.Cliente;
import banco.Cuenta;

/**
 * Clase con la función main del programa que sirve como punto de entrada.
 * @author Javier Barceló
 */
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Proyecto de ejemplo");
        // cambio desde rama1
        int [] lista = new int[10];

        for (int i = 0; i < 10; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            lista[i] = i + 1;
            System.out.println("lista[i] = " + lista[i]);
            if (i == 3) System.out.println("Hola!");
        }

        Cliente cliente1 = new Cliente("Javi", "24458996R");
        Cliente cliente2 = new Cliente("María", "49125587C");
        Cuenta cuenta1 = new Cuenta("ES25464544343543535", 100, cliente1);
        Cuenta cuenta2 = new Cuenta("ES25334432343543535", 0, cliente2);

        System.out.println(cuenta1.consultarCuenta());
        System.out.println(cuenta2.consultarCuenta());

        double saldo = cliente1.ingresarDinero(cuenta1, 80.25);
        System.out.println("Saldo de la cuenta 1: " + saldo + "€.");

    }
}