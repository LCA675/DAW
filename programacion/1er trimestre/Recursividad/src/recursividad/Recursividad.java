/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividad;

/**
 *
 * @author DAW1-TARDE
 */
public class Recursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] Mat1 = new int[LO2];
        int[] Mat2 = new int[LO2];

        int opcion;
        do {
            opcion = menu();
            switch (opcion) {
                case 0:
                    break;
                case 1:
                   
                default:
                    System.out.println("Opción no válida");
            }
            //ejercicio2();
            Entrada.leerTeclado("Pulse una tecla para continuar.");
        } while (opcion != 0);
    }

    public static int menu() {
        int op;
        System.out.println("Menu bucles");
        System.out.println(" 1.- Ejercicio  1");
        System.out.println(" 0.- Salir");
        op = Entrada.leerEntero("Introduzca una opción:");
        return op;

    }
     
   
    
    }
    

