package ejercicios;

import java.util.Scanner;

public class SetDeTenis {

    public static String evaluar(int numVictoriasA, int numVictoriasB) {
        // Verificar si es un resultado inválido
        if ((numVictoriasA == 8 && numVictoriasB == 6) ||
            (numVictoriasB == 8 && numVictoriasA == 6) ||
            (numVictoriasA == 7 && numVictoriasB < 5) ||
            (numVictoriasB == 7 && numVictoriasA < 5) ||
            (numVictoriasA < 0 || numVictoriasB < 0) ||
            (numVictoriasB > 7 && numVictoriasA > 7)) {
            return "Inválido";
        }

        // Verificar si ganó A
        if ((numVictoriasA == 7 && numVictoriasB == 6) ||
            (numVictoriasA >= 6 && numVictoriasA >= numVictoriasB + 2)) {
            return "Ganó A";
        }

        // Verificar si ganó B
        if ((numVictoriasB == 7 && numVictoriasA == 6) ||
            (numVictoriasB >= 6 && numVictoriasB >= numVictoriasA + 2)) {
            return "Ganó B";
        }

        // Verificar si aún no termina
        if ((numVictoriasA == 5 && numVictoriasB == 6) ||
            (numVictoriasB == 5 && numVictoriasA == 6) ||
            (numVictoriasA < 6 && numVictoriasB < 6) ||
            (numVictoriasA == 6 && numVictoriasB == 6)) {
            return "Aún no termina";
        }

        // En caso de que no se cumpla ninguna de las condiciones anteriores
        return "Resultado desconocido";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Los juegos ganados por A: ");
        int numVictoriasA = scanner.nextInt();

        System.out.print("Los juegos ganados por B: ");
        int numVictoriasB = scanner.nextInt();

        String respuesta = evaluar(numVictoriasA, numVictoriasB);
        System.out.println(respuesta);
    }
}