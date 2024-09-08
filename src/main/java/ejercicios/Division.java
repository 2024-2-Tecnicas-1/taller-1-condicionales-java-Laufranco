
package ejercicios;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class Division {

public static String evaluar(int dividendo, int divisor) {
        if (divisor == 0) {
            return "Operación Inválida";
        }

        int cociente = dividendo / divisor;
        int residuo = dividendo % divisor;

        if (residuo == 0) {
            return "La división es exacta. \n" +
                   "Cociente: " + cociente + "\n" +
                   "Residuo: " + residuo;
        } else {
            return "La división no es exacta. \n" +
                   "Cociente: " + cociente + "\n" +
                   "Residuo: " + residuo;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dividendo: ");
        int dividendo = scanner.nextInt();

        System.out.print("Divisor: ");
        int divisor = scanner.nextInt();

        String respuesta = evaluar(dividendo, divisor);
        System.out.println(respuesta);
    }
}

