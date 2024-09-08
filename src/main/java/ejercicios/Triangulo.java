package ejercicios;

import java.util.Scanner;

public class Triangulo {

    public static String evaluar(double a, double b, double c) {
        double sum1 = a + b;
        double sum2 = b + c;
        double sum3 = c + a;

        // Verificar si es un triángulo válido
        if (sum1 <= c || sum2 <= a || sum3 <= b) {
            return "No es un triángulo válido";
        }

        // Verificar si es un triángulo equilátero
        if (a == b && b == c) {
            return "El triángulo es equilátero";
        }

        // Verificar si es un triángulo isósceles
        if (a == b || a == c || b == c) {
            return "El triángulo es isósceles";
        }

        // Si no es equilátero ni isósceles, es escaleno
        return "El triángulo es escaleno";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.print("b: ");
        double b = scanner.nextDouble();

        System.out.print("c: ");
        double c = scanner.nextDouble();

        String respuesta = evaluar(a, b, c);
        System.out.println(respuesta);
    }
}
