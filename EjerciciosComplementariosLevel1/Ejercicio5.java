package EjerciciosComplementariosLevel1;

import static java.lang.System.out;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        int[] valores = pedirDatos();
        int valor1 = valores[0];
        int valor2 = valores[1];

        out.println("");

        multiplicacion(valor1, valor2);
    }

    static int[] pedirDatos() {
        Scanner sc = new Scanner(System.in);
        out.println("Ingrese dos números:");
        int numero = sc.nextInt();
        int numero1 = sc.nextInt();
        sc.close();
        int[] valores = {numero, numero1};
        return valores;
    }

    static void multiplicacion(int valor1, int valor2) {
        int resultado = valor1 * valor2;
        String mensaje = String.format("%d x %d = %d", valor1, valor2, resultado);
        out.println(mensaje);
    }
}
