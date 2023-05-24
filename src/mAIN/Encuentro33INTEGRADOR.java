/*
Ejercicio integrador
Una escuela ha terminado su ciclo lectivo y todos sus alumnos ya rindieron el examen final. 
La escuela nos ha pedido que calculemos el promedio de notas final de todos sus alumnos y saber qué alumnos 
han recibido una nota por encima de ese promedio.

ENTIDAD
Para esto vamos a tener que 
    crear un objeto de tipo Estudiante, 
    sus atributos van a ser nombre y nota (representando la nota obtenida en el final). 

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
package mAIN;

import Entidades.Estudiante;
import Servicios.ServicioEstudiante;

/**
 *
 * @author MiriamNahuel
 */
public class Encuentro33INTEGRADOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante[] estudiantes = new Estudiante[8];

        estudiantes[0] = new Estudiante("Maria", 7.5);
        estudiantes[1] = new Estudiante("Sergio", 8.0);
        estudiantes[2] = new Estudiante("Ignacio", 6.5);
        estudiantes[3] = new Estudiante("Manuel", 9.0);
        estudiantes[4] = new Estudiante("Cintia", 7.0);
        estudiantes[5] = new Estudiante("Melisa", 8.5);
        estudiantes[6] = new Estudiante("Sofia", 8.0);
        estudiantes[7] = new Estudiante("Eduardo", 9.5);



        ServicioEstudiante servicio = new ServicioEstudiante();

        // Aquí podrías cargar los estudiantes, por ejemplo con el método cargarEstudiante
        // Calcular el promedio
        double promedio = servicio.calcularPromedio(estudiantes);
        System.out.println("El promedio de notas del curso es: " + promedio);

        // Obtener los estudiantes con nota superior al promedio
        Estudiante[] estudiantesSuperiores = servicio.arribaPromedio(estudiantes, promedio);

        // Mostrar los estudiantes con nota superior al promedio
        servicio.mostrarEstudiantesSuperiores(estudiantesSuperiores);
    }

}
