package EjerciciosComplementariosLevel1;

import static java.lang.System.out;
import java.util.Scanner;

public class Ejercicio9 {
  public static void main(String[] args) {
    Scanner e = new Scanner(System.in);
    out.println("Ingrese un texto o frase: ");
    String frase = e.nextLine().toLowerCase();
    out.println("Ingrese una letra para buscar: ");
    char caracter = e.next().toLowerCase().charAt(0);
    int cont = 0;
    for(int i = 0; i < frase.length(); i++){
        if(frase.charAt(i) == caracter){
            cont++;
        }
    }
    out.println("La letra " + caracter + " aparece " + cont + " veces");
    e.close();
  }
}