import java.util.Scanner;

//Este programa solicita al usuario ingresar un nivel  X  y luego calcula y muestra
// la sucesión de Fibonacci hasta ese nivel. La función  calcularFibonacci  utiliza
// recursión para calcular el número de Fibonacci en una posición específica.

public class SucesionFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nivel X: ");
        int nivel = scanner.nextInt();

        System.out.println("La sucesión de Fibonacci hasta el nivel " + nivel + " es:");

        for (int i = 0; i <= nivel; i++) {
            System.out.print(calcularFibonacci(i) + " ");
        }
    }

    public static int calcularFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        }
    }
}