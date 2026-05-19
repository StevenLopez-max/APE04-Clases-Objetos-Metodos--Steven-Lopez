public class Estudiante {
    //atributos privados
    private String cedula;
    private String nombre;
    private String apellido;
    private float nota1;
    private float nota2;
    private float nota3;
    private float promedio;

    // Métodos set
    public void setCedula(String c) {
        cedula = c;
    }

    public void setNombre(String n) {
        nombre = n;
    }

    public void setApellido(String a) {
        apellido = a;
    }

    public void setNota1(float n1) {
        if (n1 >= 0 && n1 <= 10) {
            nota1 = n1;
        } else {
            System.out.println("Nota 1 inválida. Debe estar entre 0 y 10.");
        }
    }

    public void setNota2(float n2) {
        if (n2 >= 0 && n2 <= 10) {
            nota2 = n2;
        } else {
            System.out.println("Nota 2 inválida. Debe estar entre 0 y 10.");
        }
    }

    public void setNota3(float n3) {
        if (n3 >= 0 && n3 <= 10) {
            nota3 = n3;
        } else {
            System.out.println("Nota 3 inválida. Debe estar entre 0 y 10.");
        }
    }

    // Métodos get
    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public float getNota1() {
        return nota1;
    }
    public float getNota2() {
        return nota2;
    }
    public float getNota3() {
        return nota3;
    }

    public float getPromedio() {
        return promedio;
    }

    // Método para calcular promedio
    public void calcularPromedio() {
        promedio = (nota1 + nota2 + nota3) / 3;
    }   
    // Método para determinar estado
    public String obtenerEstado() {
        if (promedio >= 7.0) {
            return "Aprobado";
        } else {
            return "Reprobado";
        }
    }
    public void mostrarInformacion() {

        System.out.println("-----------------------------------");
        System.out.println("Cedula: " + cedula);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("Promedio: " + String.format("%.2f", promedio));
        System.out.println("Estado: " + obtenerEstado());
        System.out.println("-----------------------------------");
    }
}
