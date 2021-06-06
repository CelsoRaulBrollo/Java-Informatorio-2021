package EjerciciosComplementariosLevel2;

import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = listaDeNumeros(sc);
        NumeroInicial(sc, numeros);
        NumeroFinal(sc, numeros);
        sc.close();
    }
    
    static ArrayList<Integer> listaDeNumeros(Scanner sc) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        for (int i=0; i<5; i++) {
            out.println("Ingrese un número a la lista");
            int numero = sc.nextInt();
            numeros.add(numero);
        }
        out.println(numeros);
        return numeros;
    }
    
    static void NumeroInicial(Scanner sc, ArrayList<Integer> numeros) {
        out.println("Ingrese el numero inicial a la lista");
        int numero = sc.nextInt();
        numeros.add(0, numero);
    }
    
    static void NumeroFinal(Scanner sc, ArrayList<Integer> numeros) {
        out.println("Ingrese el numero final a la lista");
        int numero = sc.nextInt();
        numeros.add(numero);
        out.println(numeros);
    }
}
