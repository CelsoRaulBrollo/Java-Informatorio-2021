package EjerciciosComplementariosLevel2;

import static java.lang.System.out;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> horasTrabajo = horasTrabajadas(sc);
        List<Integer> valorHora = valorHora(sc);
        List<Integer> totales = totales(horasTrabajo, valorHora);
        totalFinal(totales);
        sc.close();
    }

    static List<Integer> horasTrabajadas(Scanner sc) {
        List<Integer> listaHoras = new ArrayList<>();
        out.println("Ingrese lista de horas trabajadas en la semana: ");
        for (int i = 0; i < 5; i++) {
            int cantidad = sc.nextInt();
            listaHoras.add(cantidad);
        }
        return listaHoras;
    }

    static List<Integer> valorHora(Scanner sc) {
        List<Integer> listaValor = new ArrayList<>();
        out.println("Ingrese lista del valor por hora trabajada en la semana: ");
        for (int i = 0; i < 5; i++) {
            int cantidad = sc.nextInt();
            listaValor.add(cantidad);
        }
        return listaValor;
    }

    static List<Integer> totales(List<Integer> horasTrabajo, List<Integer> valorHora) {
        List<Integer> listaTotales = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int totalDia = horasTrabajo.get(i) * valorHora.get(i);
            listaTotales.add(totalDia);
        }
        out.println(listaTotales);
        return listaTotales;
    }

    static int totalFinal(List<Integer> totales) {
        int total = 0;
        for (int valor : totales) {
            total += valor;
        }
        out.println("Total Final: " + total);
        return total;
    }
}