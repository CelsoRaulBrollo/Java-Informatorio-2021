package EjerciciosComplementariosLevel2;

import static java.lang.System.out;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        HashSet<HashMap<String, String>> empleados = empleados();
        sueldos(empleados);
    }

    static HashSet<HashMap<String, String>> empleados() {
        Scanner sc = new Scanner(System.in);
        HashSet<HashMap<String, String>> listaEmpleados = new HashSet<>();
        boolean inicio = true;
        while (inicio) {
            HashMap<String, String> empleado = new HashMap<>();
            out.println("Nombre y Apellido:");
            String nombre = sc.nextLine();
            out.println("DNI:");
            String dni = sc.nextLine();
            out.println("Horas de Trabajo:");
            String horas = sc.nextLine();
            out.println("Valor por hora:");
            String valorHora = sc.nextLine();
            empleado.put("nombre", nombre);
            empleado.put("dni", dni);
            empleado.put("horas", horas);
            empleado.put("valorHora", valorHora);
            listaEmpleados.add(empleado);
            out.println("Precione 1 para continuar o 0 para salir:");
            int opcion = sc.nextInt();
            sc.nextLine();
            while (opcion != 1) {
                if (opcion == 0) {
                    inicio = false;
                    break;
                } else {
                    out.println("Opción incorrecta, intenta denuevo");
                    opcion = sc.nextInt();
                    sc.nextLine();
                }
            }
        }
        sc.close();
        return listaEmpleados;
    }

    static void sueldos(HashSet<HashMap<String, String>> empleados) {
        ArrayList<HashMap<Integer, Integer>> listaSueldos = new ArrayList<>();
        for (HashMap<String, String> empleado : empleados) {
            HashMap<Integer, Integer> sueldoEmpleado = new HashMap<>();
            int horas = Integer.parseInt(empleado.get("horas"));
            int dni = Integer.parseInt(empleado.get("dni"));
            int valorHora = Integer.parseInt(empleado.get("valorHora"));
            int sueldo = horas * valorHora;
            sueldoEmpleado.put(dni, sueldo);
            listaSueldos.add(sueldoEmpleado);
        }
        out.println("DNI=Sueldo:\n" + listaSueldos);
    }
}
