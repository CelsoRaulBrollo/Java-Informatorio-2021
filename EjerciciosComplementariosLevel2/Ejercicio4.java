package EjerciciosComplementariosLevel2;

import java.util.List;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<String> estudiantes = estudiantes();
        out.println("");
        clasificacion(estudiantes);
    }
    
    static List<String> estudiantes() {
        Scanner sc = new Scanner(System.in);
        List<String> listaDeEstudiantes = new ArrayList<>();
        for (int i=0; i< 12; i++) {
            out.println("Ingresa 12 nombres de estudiantes:");
            String estudiante = sc.nextLine();
            listaDeEstudiantes.add(estudiante);
        }
        sc.close();
        return listaDeEstudiantes;
    }
    
    static void clasificacion(List<String> estudiantes) {
        Collections.shuffle(estudiantes);
        List<String> curso1 = estudiantes.subList(0, 4);
        List<String> curso2 = estudiantes.subList(4, 8);
        List<String> curso3 = estudiantes.subList(8, 12);

        out.println("Curso 1: " + curso1);
        out.println("Curso 2: " + curso2);
        out.println("Curso 3: " + curso3);
    }
}