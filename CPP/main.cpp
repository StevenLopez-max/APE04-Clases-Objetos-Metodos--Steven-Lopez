#include <iostream>
#include <iomanip>
using namespace std;

class Estudiante {
private:
    string cedula;
    string nombre;
    string apellido;
    float nota1, nota2, nota3;
    float promedio;

public:
    // Constructor
    Estudiante() {
        cedula = "";
        nombre = "";
        apellido = "";
        nota1 = nota2 = nota3 = promedio = 0;
    }

    // Métodos set
    void setCedula(string c) {
        cedula = c;
    }
    string getCedula() {
        return cedula;
    }
    void setNombre(string n) {
        nombre = n;
    }
    string getNombre() {
        return nombre;
    }

    void setApellido(string a) {
        apellido = a;
    }
    string getApellido() {
        return apellido;
    }

    void setNota1(float n1) {
        while (n1 < 0 || n1 > 10) {
            cout << "Nota 1 invalida. Ingrese nuevamente (0-10): ";
            cin >> n1;
        }
        nota1 = n1;
    }

    void setNota2(float n2) {
        while (n2 < 0 || n2 > 10) {
            cout << "Nota 2 invalida. Ingrese nuevamente (0-10): ";
            cin >> n2;
        }
        nota2 = n2;
    }

    void setNota3(float n3) {
        while (n3 < 0 || n3 > 10) {
            cout << "Nota 3 invalida. Ingrese nuevamente (0-10): ";
            cin >> n3;
        }
        nota3 = n3;
    }



    // Método para calcular promedio
    void calcularPromedio() {
        promedio = (nota1 + nota2 + nota3) / 3;
    }
        float getPromedio() {
        return promedio;
    }


    // Método para determinar estado
    string obtenerEstado() {
        if (promedio >= 7.0) {
            return "Aprobado";
        } else {
            return "Reprobado";
        }
    }

    // Método para mostrar información
    void mostrarInformacion() {
        cout << "\n-----------------------------------";
        cout << "\nCedula: " << cedula;
        cout << "\nNombre: " << nombre;
        cout << "\nApellido: " << apellido;
        cout << "\nNota 1: " << nota1;
        cout << "\nNota 2: " << nota2;
        cout << "\nNota 3: " << nota3;
        cout << "\nPromedio: " << fixed << setprecision(2) << promedio;
        cout << "\nEstado: " << obtenerEstado();
        cout << "\n-----------------------------------\n";
    }
};

int main() {

    const int TOTAL = 5;
    Estudiante estudiantes[TOTAL];

    int aprobados = 0;
    int reprobados = 0;

    for (int i = 0; i < TOTAL; i++) {

        string cedula, nombre, apellido;
        float n1, n2, n3;

        cout << "\n===== ESTUDIANTE " << i + 1 << " =====\n";

        cout << "Ingrese cedula: ";
        cin >> cedula;

        cout << "Ingrese nombre: ";
        cin >> nombre;

        cout << "Ingrese apellido: ";
        cin >> apellido;

        cout << "Ingrese Nota 1: ";
        cin >> n1;

        cout << "Ingrese Nota 2: ";
        cin >> n2;

        cout << "Ingrese Nota 3: ";
        cin >> n3;

        estudiantes[i].setCedula(cedula);
        estudiantes[i].setNombre(nombre);
        estudiantes[i].setApellido(apellido);

        estudiantes[i].setNota1(n1);
        estudiantes[i].setNota2(n2);
        estudiantes[i].setNota3(n3);

        estudiantes[i].calcularPromedio();

        if (estudiantes[i].obtenerEstado() == "Aprobado") {
            aprobados++;
        } else {
            reprobados++;
        }
    }

    // Mostrar listado completo
    cout << "\n========== LISTADO DE ESTUDIANTES ==========\n";

    for (int i = 0; i < TOTAL; i++) {
        estudiantes[i].mostrarInformacion();
    }

    // Mostrar estadísticas
    cout << "\nCantidad de aprobados: " << aprobados;
    cout << "\nCantidad de reprobados: " << reprobados;

    return 0;
}