import banco.Cliente;
import banco.Cuenta;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
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