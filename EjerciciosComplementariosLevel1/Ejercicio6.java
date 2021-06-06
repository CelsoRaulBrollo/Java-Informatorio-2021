package EjerciciosComplementariosLevel1;

import static java.lang.System.out;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        int[] valores = pedirDatos();
        int valor = valores[0];
        int valor1 = valores[1];

        out.println("");

        potencia(valor, valor1);
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

    static void potencia(int valor, int valor1) {
        int resultado = valor;
        for (int i = 1; i < valor1 ; i++) {
            resultado *= valor;
        }
        String mensaje = String.format("%d elvedo a %d = %d", valor, valor1, resultado);
        out.println(mensaje);
    }
}
