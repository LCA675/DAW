/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colegio;

/**
 *
 * @author DAW1-TARDE
 */
public class Colegio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Grupo grupo1 = new Grupo("1ºA");

        int opcion = -1;
        while (opcion != 0) {
            System.out.println("");
            System.out.println("Ejercicio 1: Consultar/Modificar nombre del grupo ");
            System.out.println("Ejercicio 2: Listado de alumnos del grupo");
            System.out.println("Ejercicio 3: Matricular un alumno");
            System.out.println("Ejercicio 4: Evaluar todos los alumnos (nota aleatoria)");
            System.out.println("Ejercicio 5: Ver nota media del grupo");
            System.out.println("Ejercicio 6: Buscar un alumno por su nombre/ cambiar nota");

            opcion = Entrada.leerEntero("Introduzca un ejercicio");

            switch (opcion) {
                case 1:
                    String op = "";
                    System.out.println(grupo1.getGrupo());
                    op = Entrada.leerCadena("¿Quiere modificar el nombre del grupo?(s para modificar)");
                    if (op.equals("s")) {
                        String nombre = "";
                        nombre = Entrada.leerCadena("Introduzca el nombre del nuevo grupo");
                        grupo1.setGrupo(nombre);
                    }
                    break;

                case 2:
                    System.out.println("El listado de los alumnos del grupo " + grupo1.getGrupo() + " es: \n");
                    grupo1.listadoAlumnos();
                    break;

                case 3:
                    String dni = Entrada.leerCadena("Introduzca el DNI del nuevo alumno");
                    String nombre = Entrada.leerCadena("INtroduzca el nombre del nuevo alumno");
                    int edad = Entrada.leerEntero("Introduzca la edad del nuevo alumno");
                    int nota1 = Entrada.leerEntero("Introduzca la nota del primer trimestre del nuevo alumno");
                    int nota2 = Entrada.leerEntero("Introduzca la nota del primer segundo del nuevo alumno");
                    int nota3 = Entrada.leerEntero("Introduzca la nota del primer tercer del nuevo alumno");

                    Alumno alumno = new Alumno(dni, nombre, edad, nota1, nota2, nota3);

                    grupo1.insertarAlumno(alumno);
                    break;

                case 4:
                    grupo1.evaluar();
                    System.out.println("Se han modificado aleatoriamente todas las notas de los alumnos");
                    break;

                case 5:
                    grupo1.mediaGrupo();
                    break;

                case 6:
                    String nombre1 = Entrada.leerCadena("Introduzca el nombre del alumno que quiere buscar");
                    grupo1.buscarAlumno(nombre1);
                    op = Entrada.leerCadena("¿Quiere modificar alguna nota?(s para modificar)");
                    int tri = Entrada.leerEntero("Introduzca el trimestre que quiere cambiar");
                    if (op.equals("s")) {
                        if (tri == 1) {
                            nota1 = Entrada.leerEntero("Introduzca la nota del primer trimestre del nuevo alumno");
                            grupo1.buscarAlumno(nombre1).setNota_trimestre1(nota1);
                        } else if (tri == 2) {
                            nota2 = Entrada.leerEntero("Introduzca la nota del primer segundo del nuevo alumno");
                            grupo1.buscarAlumno(nombre1).setNota_trimestre1(nota2);
                        } else if (tri == 3) {
                            nota3 = Entrada.leerEntero("Introduzca la nota del primer tercer del nuevo alumno");
                            grupo1.buscarAlumno(nombre1).setNota_trimestre1(nota3);
                        }
                    }
                    break;

            }
        }

    }
}
