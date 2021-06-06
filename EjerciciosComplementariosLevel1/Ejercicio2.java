package EjerciciosComplementariosLevel1;

import static java.lang.System.out;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int[] valores = pedirNumeros();
        int valor1 = valores[0];
        int valor2 = valores[1];
        
        out.println();

        suma(valor1, valor2);
        resta(valor1, valor2);
        multiplicacion(valor1, valor2);
        division(valor1, valor2);
        modulo(valor1, valor2);
    }

    static int[] pedirNumeros() {
        Scanner sc = new Scanner(System.in);
        out.println("Ingrese un número");
        int numero1 = sc.nextInt();
        out.println("Ingrese otro número");
        int numero2 = sc.nextInt();
        sc.close();
        int[] valores = {numero1, numero2};
        return valores;
    }

    static void suma(int valor1, int valor2) {
        int resultado = valor1 + valor2;
        String mensaje = String.format("%d + %d = %d", valor1, valor2, resultado);
        out.println(mensaje);
    }

    static void resta(int valor1, int valor2) {
        int resultado = valor1 - valor2;
        String mensaje = String.format("%d - %d = %d", valor1, valor2, resultado);
        out.println(mensaje);
    }
    
    static void multiplicacion(int valor1, int valor2) {
        int resultado = valor1 * valor2;
        String mensaje = String.format("%d * %d = %d", valor1, valor2, resultado);
        out.println(mensaje);
    }
    
    
    static void division(int valor1, int valor2) {
        double resultado = (double)valor1 / valor2;
        String mensaje = String.format("%d / %d = %.2f", valor1, valor2, resultado);
        out.println(mensaje);
    }
    
    static void modulo(int valor1, int valor2) {
        int resultado = valor1 % valor2;
        String mensaje = valor1 + " % " + valor2 + " = " + resultado;
        out.println(mensaje);
    }
}