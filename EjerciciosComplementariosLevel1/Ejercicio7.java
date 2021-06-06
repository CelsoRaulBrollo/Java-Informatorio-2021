package EjerciciosComplementariosLevel1;

import static java.lang.System.out;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        mayusString();
    }

    static void mayusString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra en minuscula: ");
        String cadena = sc.nextLine();
        sc.close();
        char[] caracteres = cadena.toCharArray();
        for (int i = 0; i < caracteres.length; i++) {
            caracteres[i] = mayusculaChar(caracteres[i]);
        }
        caracteres.toString();
        out.println(caracteres);
    }

    static char mayusculaChar(char valor) {
        int upper = (int)valor - (int)'a' + (int)'A';
        char mayus = (char)upper;
        return mayus;
    }
}
