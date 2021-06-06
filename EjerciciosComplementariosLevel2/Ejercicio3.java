package EjerciciosComplementariosLevel2;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio3 {
    /**
     *
     */
    private static final PrintStream OUT = System.out;

    public static void main(String[] args) {
        ArrayList<String> cartas = barajafrancesa();
        OUT.println(cartas);
        OrdenInvertido(cartas);
        OrdenAleatorio(cartas);
    }

    static ArrayList<String> barajafrancesa() {
        ArrayList<String> cartas = new ArrayList<String>();
        cartas.add("A");
        for (int i=2; i<11; i++) {
            String carta = Integer.toString(i);
            cartas.add(carta);
        }
        cartas.add("K");
        cartas.add("L");
        cartas.add("M");
        return cartas;
    }
    
    static void OrdenInvertido(ArrayList<String> cartas) {
        Collections.reverse(cartas);
        OUT.println(cartas);
    }

    static void OrdenAleatorio( ArrayList<String> cartas) {
        Collections.shuffle(cartas);
        OUT.println(cartas);
    }
}