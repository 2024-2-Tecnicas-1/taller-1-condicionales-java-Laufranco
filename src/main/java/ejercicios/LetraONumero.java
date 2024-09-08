
package ejercicios;


import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class LetraONumero {


    public static String evaluar(char caracter) {
        // Verificar si es un número
        if (Character.isDigit(caracter)) {
            return "Es número";
        }

        // Verificar si es una letra mayúscula
        else if (Character.isUpperCase(caracter)) {
            return "Es letra mayúscula";
        }

        // Verificar si es una letra minúscula
        else if (Character.isLowerCase(caracter)) {
            return "Es letra minúscula";
        }

        // Si no es letra ni número
        else {
            return "No es letra ni número";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Caracter: ");
        char caracter = scanner.next().charAt(0);

        String respuesta = evaluar(caracter);
        System.out.println(respuesta);
    }
}
