1)	Análisis.

El presente programa consiste en el desarrollo de un sistema básico para el registro y control de calificaciones de estudiantes de la asignatura Algoritmos y Lógica de Programación. Mediante el uso de Programación Orientada a Objetos, se crea una clase llamada Estudiante que almacena la información personal y académica de cada alumno, incluyendo su cédula, nombre, apellido y tres notas. El sistema permite ingresar los datos de cinco estudiantes, validar que las calificaciones estén en un rango de 0 a 10, calcular automáticamente el promedio de cada uno y determinar si su estado es aprobado o reprobado según la nota mínima establecida de 7.0. Finalmente, el programa muestra el listado completo de estudiantes junto con sus resultados y presenta el total de estudiantes aprobados y reprobados.

2)	Datos. 
-	Variables de Entrada
Son los datos que el usuario ingresa al programa:
Datos personales
•	cedula → Número de identificación del estudiante. 
•	nombre → Nombre del estudiante. 
•	apellido → Apellido del estudiante. 
Calificaciones
•	nota1 → Primera nota del estudiante. 
•	nota2 → Segunda nota del estudiante. 
•	nota3 → Tercera nota del estudiante. 
-	Variables de Proceso
Son las variables que se utilizan para realizar cálculos y control interno del programa:
•	promedio → Resultado del cálculo de las tres notas. 
•	i → Variable de control del ciclo for. 
•	TOTAL → Cantidad total de estudiantes (5). 
•	estudiantes[] → Arreglo de objetos de tipo Estudiante. 
•	aprobados → Contador de estudiantes aprobados. 
•	reprobados → Contador de estudiantes reprobados. 
•	estado (devuelto por obtenerEstado()) → Indica si el estudiante está aprobado o reprobado. 
-	Variables de Salida
Son los resultados que el programa muestra al usuario:
•	cedula 
•	nombre 
•	apellido 
•	nota1 
•	nota2 
•	nota3 
•	promedio 
•	estado (Aprobado o Reprobado) 
•	aprobados → Total de estudiantes aprobados. 
•	reprobados → Total de estudiantes reprobados.




3)	Algoritmo.
Inicio
1.	Iniciar el programa. 
2.	Declarar un arreglo de 5 objetos de tipo Estudiante. 
3.	Inicializar los contadores: 
	aprobados = 0 
   reprobados = 0 
    Registro de Estudiantes
4.	Repetir desde i = 0 hasta 4: 
1.	Solicitar la cédula del estudiante. 
2.	Solicitar el nombre. 
3.	Solicitar el apellido. 
4.	Solicitar la Nota 1. 
5.	Validar que la Nota 1 esté entre 0 y 10. 
6.	Solicitar la Nota 2. 
7.	Validar que la Nota 2 esté entre 0 y 10. 
8.	Solicitar la Nota 3. 
9.	Validar que la Nota 3 esté entre 0 y 10. 
10.	Guardar los datos en el objeto Estudiante. 
11.	Calcular el promedio. 
12.	Determinar el estado. 
13.	Si el estado es "Aprobado", incrementar aprobados. 
14.	Caso contrario, incrementar reprobados.
5.	Mostrar el listado de los estudiantes.
6.	Mostrar la cantidad de aprobados y reprobados.
7.	Fin del programa.

