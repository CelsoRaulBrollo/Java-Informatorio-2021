package EjerciciosComplementariosLevel1;

import static java.lang.System.out;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        datos();
    }
    
    static void datos() {
        Scanner sc = new Scanner(System.in);
        out.println("Nombre y Apellido:");
        String nombreCompleto = sc.nextLine();
        out.println("Edad:");
        String edad = sc.nextLine();
        out.println("Dirección:");
        String direccion = sc.nextLine();
        out.println("Ciudad:");
        String ciudad = sc.nextLine();
        sc.close();
        String mensaje = String.format("%s - %s - %s - %s", ciudad, direccion, edad, nombreCompleto);
        out.println(mensaje);
    }
    
}