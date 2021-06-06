package EjerciciosComplementariosLevel1;

import static java.lang.System.out;
import java.util.Scanner;

public class Ejercicio1 {
  public static void main(String[] args) {
    Scanner e = new Scanner(System.in);
    out.println("Ingrese su nombre: ");
    String nombre = e.nextLine();
    out.println("HOLA " + nombre + "!!!");
    e.close();
  }
}