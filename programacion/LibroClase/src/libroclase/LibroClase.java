/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libroclase;

import java.util.Scanner;

/**
 *
 * @author DAW1-TARDE
 */
public class LibroClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        Libro libro1 = new Libro("El quijote", "Cervantes", 1,0);
        Libro libro2 = new Libro();
        
        
        int opcion = -1;
        while (opcion != 0) {
            System.out.println("");
            System.out.println("Ejercicio 1: Rellenar datos del libro2 ");
            System.out.println("Ejercicio 2: Mostrar datos de la libro1");
            System.out.println("Ejercicio 3: Préstamo libro1");
            System.out.println("Ejercicio 4: Devolución libro1");
            System.out.println("Ejercicio 5: Mostrar datos de la libro2");
            
            opcion=Entrada.leerEntero("Introduzca un ejercicio");

            switch (opcion) {
                case 1:
                    System.out.println("Rellene los datos siguientes");
                    libro2.titulo=Entrada.leerCadena("Introduzca el titulo");
                    libro2.autor=Entrada.leerCadena("Introduzca el autor");
                    libro2.n_libros=Entrada.leerCaracter("¿Que cantidad de libros hay en la biblioteeca?");
                    libro2.n_libros_prestados=Entrada.leerCaracter("¿Hay algun ejemplar prestado?");
                    break;
                case 2:
                    System.out.println("Datos del libro1");
                    System.out.println(libro1.toString());
                    break;
                case 3:
                    System.out.println("Prestamo del libro1");
                    if (libro1.prestamo()==false){
                        System.out.println("No quedan ejemplares del libro");
                    }
                    break;
                case 4:
                    System.out.println("Devolución del libro1");
                    libro1.devolucion();
                    break;
                case 5:
                    System.out.println("Datos del libro2");
                    System.out.println(libro2.toString());
            }
        }

    }

}
