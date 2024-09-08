
package ejercicios;


import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class IMC {
 
    public static String evaluar(double peso, double estatura, int edad) {
        double imc = peso / (estatura * estatura);

        if (imc < 22.0) {
            if (edad < 45) {
                return "bajo";
            } else {
                return "medio";
            }
        } else {
            if (edad < 45) {
                return "medio";
            } else {
                return "alto";
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Peso: ");
        double peso = scanner.nextDouble();

        System.out.print("Estatura: ");
        double estatura = scanner.nextDouble();

        System.out.print("Edad: ");
        int edad = scanner.nextInt();

        String respuesta = evaluar(peso, estatura, edad);
        System.out.println(respuesta);
    }
}

