/*
SERVICIOS
La escuela consta con tan solo 8 estudiantes, por lo que deberemos crear los 8 estudiantes con sus respectivas notas.
Una vez creado los estudiantes deberemos guardar los estudiantes en un arreglo de objetos tipo Estudiante, 
usando ese arreglo tenemos que realizar las dos tareas que nos ha pedido la escuela.

1) Calcular y mostrar el promedio de notas de todo el curso
2) Retornar otro arreglo con los nombre de los alumnos que recibieron una nota mayor al promedio del curso
3) Por último, deberemos mostrar todos los estudiantes con una nota mayor al promedio.

Nota: para crear un vector de objetos la definición es la siguiente:
Objeto nombreVector[] = new Objeto[];
 */
package Servicios;

import Entidades.Estudiante;
import java.util.Scanner;

/**
 *
 * @author MiriamNahuel
 */
public class ServicioEstudiante {

    Scanner lector = new Scanner(System.in);

//    public Estudiante cargarEstudiante(){
//        
//        System.out.println("Ingrese el nombre del estudiante:");
//        String nombre = lector.nextLine();
//        
//        System.out.println("Ingrese la nota final del estudiante:");
//        double nota = lector.nextDouble();
//        
//        return new Estudiante(nombre, nota);
//    }
    //1) Calcular y mostrar el promedio de notas de todo el curso
    public double calcularPromedio(Estudiante[] estudiantes) {

        double sumatoriaNotas = 0;
        for (int i = 0; i < estudiantes.length; i++) {
            sumatoriaNotas += estudiantes[i].getNota();
        }
        double promedio = sumatoriaNotas / estudiantes.length;

        return promedio;
    }

    //2) Retornar otro arreglo con los nombre de los alumnos que recibieron una nota mayor al promedio del curso
    public Estudiante[] arribaPromedio(Estudiante[] estudiantes, double promedio) {

        int contador = 0;
        for (int i = 0; i < estudiantes.length; i++ ) {
            if (estudiantes[i].getNota() > promedio) {
                contador++;
            }
        }

        Estudiante[] estudianteSuperior = new Estudiante[contador];

            int j=0;
            
        for (int i = 0; i < estudiantes.length; i++) { //el tamaño del arreglo que vaya a crear
            
            if (estudiantes[i].getNota() > promedio) {
                estudianteSuperior[j] = estudiantes[i]; 
                j++;
            }
        }
        return estudianteSuperior;
    }
    
    //3) Por último, deberemos mostrar todos los estudiantes con una nota mayor al promedio.

    public void mostrarEstudiantesSuperiores(Estudiante[] estudiantes) {
    System.out.println("Los estudiantes con una nota superior al promedio son:");
    for (int i = 0; i < estudiantes.length; i++) {
        System.out.println("Nombre: " + estudiantes[i].getNombre() + ", Nota: " + estudiantes[i].getNota());
    }
}

    

    //--------------------------------------------------------------------------------------------------------
}
