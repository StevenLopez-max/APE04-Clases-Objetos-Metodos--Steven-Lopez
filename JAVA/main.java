import java.util.Scanner;
    
public class main {

 public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int TOTAL = 5;

        Estudiante[] estudiantes = new Estudiante[TOTAL];

        int aprobados = 0;
        int reprobados = 0;

        for (int i = 0; i < TOTAL; i++) {

            estudiantes[i] = new Estudiante();

            System.out.println("\n===== ESTUDIANTE " + (i + 1) + " =====");

            System.out.print("Ingrese cedula: ");
            estudiantes[i].setCedula(sc.next());

            System.out.print("Ingrese nombre: ");
            estudiantes[i].setNombre(sc.next());

            System.out.print("Ingrese apellido: ");
            estudiantes[i].setApellido(sc.next());

            double n1, n2, n3;

            do {
                System.out.print("Ingrese Nota 1 (0-10): ");
                n1 = sc.nextDouble();
            } while (n1 < 0 || n1 > 10);

            do {
                System.out.print("Ingrese Nota 2 (0-10): ");
                n2 = sc.nextDouble();
            } while (n2 < 0 || n2 > 10);

            do {
                System.out.print("Ingrese Nota 3 (0-10): ");
                n3 = sc.nextDouble();
            } while (n3 < 0 || n3 > 10);

            estudiantes[i].setNota1((float)n1);
            estudiantes[i].setNota2((float)n2);
            estudiantes[i].setNota3((float)n3);

            estudiantes[i].calcularPromedio();

            if (estudiantes[i].obtenerEstado().equals("Aprobado")) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

        // Mostrar estudiantes
        System.out.println("\n========== LISTADO DE ESTUDIANTES ==========");

        for (int i = 0; i < TOTAL; i++) {
            estudiantes[i].mostrarInformacion();
        }

        // Mostrar resultados
        System.out.println("\nCantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de reprobados: " + reprobados);

        sc.close();
    }
}