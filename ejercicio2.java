import java.util.*;
import javax.swing.JOptionPane;


public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        main();
    }

    static void main() {
////////// Leer un numero entero y mostrar todos los enteros comprendidos entre 1 y el numero leido

        //declarar n y convertirlo en a tipo numerico
        String n = JOptionPane.showInputDialog("Ingrese numero");
        int a;
        //entra si los dos ingresos o uno esta vacio
        if (n.isEmpty() || n.charAt(0) >= 'a') {
            return;
        } else {
            a = Integer.parseInt(n);
        }
        //declarar variable  de salida
        String salida = "";
        //recorre desde 1 hasta el numero leido
        for (int i = 1; i <= a; i++) {
            salida += "\n" + i;
        }
        //muestra en pantalla
        JOptionPane.showMessageDialog(null, salida);
    }

}
