package EjerciciosComplementariosLevel1;

import static java.lang.System.out;
import java.util.Scanner;

public class Ejercicio4{  
  private static Scanner e;

  public static void main(String args[]){ 
      e = new Scanner(System.in);
      int i,fact=1; 
      out.println("Ingrese un numero para calcular su factorial: "); 
      int n = e.nextInt();    
      for(i=1;i<=n;i++){    
          fact=fact*i;    
      }    
      out.println("El factorial de "+n+" es: "+fact);    
      e.close();
    }  
 }  