// Este programa lee dos números enteros positivos del usuario y luego utiliza
// la función  sonPrimosEntreSi  para verificar si son primos entre sí. La función
// calcularMCD  se utiliza para calcular el máximo común divisor de los dos números.
// Si el MCD es igual a 1, significa que los números son primos entre sí.

import java.util.Scanner;

public class NumerosPrimosEntreSi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        if (sonPrimosEntreSi(num1, num2)) {
            System.out.println("Los números " + num1 + " y " + num2 + " son números primos entre sí.");
        } else {
            System.out.println("Los números " + num1 + " y " + num2 + " no son primos entre sí.");
        }
    }

    public static boolean sonPrimosEntreSi(int num1, int num2) {
        int mcd = calcularMCD(num1, num2);
        return mcd == 1;
    }

    public static int calcularMCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}