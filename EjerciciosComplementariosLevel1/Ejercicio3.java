package EjerciciosComplementariosLevel1;

import static java.lang.System.out;
import java.util.Scanner;


public class Ejercicio3 {
    public static void main(String[] args) {
        int valor = pedirNumero();
        out.println("");
        secuencia(valor);
    }

    static int pedirNumero() {
        Scanner sc = new Scanner(System.in);
        out.println("Ingrese un número:");
        int numero = sc.nextInt();
        sc.close();
        return numero;
    }

    static void secuencia(int valor) {
        String valores = "";
        for (int i = 1; i <= valor; i++) {
            valores += i;
            out.println(valores);
        }
    }
}