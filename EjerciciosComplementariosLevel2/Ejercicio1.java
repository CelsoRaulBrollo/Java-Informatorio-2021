package EjerciciosComplementariosLevel2;

import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
    private static int num;

    public static void main(String[] args) {
        CiudadesFavoritas();
    }

    static void CiudadesFavoritas() {
        Scanner c1 = new Scanner(System.in);
        Scanner c2 = new Scanner(System.in);
        ArrayList<String> ciudades = new ArrayList<String>();
        String ciudad;
        num = 1;
        while (num == 1) {
            out.println("Ingrese una ciudad:");
            ciudad = c1.nextLine();
            ciudades.add(ciudad);
            out.println("Escriba (1) si quiere agregar otra ciudad, o escriba (0) para terminar: ");
            num = c2.nextInt();
        }
        c1.close();
        c2.close();
           for (int i = 0; i < ciudades.size(); i++) {
            if (ciudades.get(i).length() != 0) {
                out.println("#" + (i+1) + " - " + ciudades.get(i));
            }
        }
    }
}