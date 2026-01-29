/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template


 */
package busquedayordenacion;

import java.util.Arrays;

/**
 *
 * @author DAW1-TARDE
 */
public class BusquedayOrdenacion {

    private static int[] Mat1;
    // Constante con el número de posiciones del vector
    final static int LO2 = 4;

    public static void main(String[] args) {
        int[] Mat1 = new int[LO2];

        int opcion;
        int numero = 0;

        do {
            opcion = menu();
            RellenarMatrizAleatoria(Mat1);
            switch (opcion) {
                case 0:
                    break;
                case 1:
                    busquedaSimple(Mat1, numero);
                    break;
                case 2:
                    Arrays.sort(Mat1);
                    busquedaOrdenada(Mat1, numero);
                    break;
                case 3:
                    busquedaBinaria(Mat1, numero);
                    break;

                case 4:
                    ordenacionBurbuja(Mat1, numero);
                    break;

                case 5:
                    ordenaSeleccion(Mat1);
                    break;

                case 6:
                    insercionyDesplazamiento(Mat1);
                    break;
                /*
                case 7:
                    borradoDesplazamiento();
                    break;
                 */
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
        System.out.println(" 2.- Ejercicio  2");
        System.out.println(" 3.- Ejercicio  3");
        System.out.println(" 4.- Ejercicio  4");
        System.out.println(" 5.- Ejercicio  5");
        System.out.println(" 6.- Ejercicio  6");
        System.out.println(" 7.- Ejercicio  7");
        System.out.println(" 0.- Salir");
        op = Entrada.leerEntero("Introduzca una opción:");
        return op;

    }

    public static int[] RellenarMatrizAleatoria(int[] Mat1) {
        for (int i = 0; i < Mat1.length; i++) {
            Mat1[i] = (int) (Math.random() * 9) + 1;
        }

        for (int i = 0; i < Mat1.length; i++) {
            System.out.print(Mat1[i]);
        }
        System.out.println("");
        return Mat1;
    }

    public static int busquedaSimple(int[] Mat1, int num) {
        int posicion = -1;
        num = Entrada.leerEntero("Introduzca un número para buscar su posicion: ");
        for (int i = 0; i < Mat1.length; i++) {
            if (Mat1[i] == num) {
                posicion = i;
                System.out.println("El elemento " + num + " está en la posición " + (posicion + 1));
                break;
            }
        }
        if (posicion == -1) {
            System.out.println("No se encuentra el elemento en la lista.");
        }
        return posicion;
    }

    public static int busquedaOrdenada(int[] Mat1, int numero) {
        int posicion = -1;
        numero = Entrada.leerEntero("Introduzca un número para buscar su posicion: ");
        for (int i = 0; i < Mat1.length; i++) {
            if (numero <= Mat1[i]) {
                if (Mat1[i] == numero) {
                    posicion = i;
                    System.out.println("El elemento " + numero + " está en la posición " + (posicion + 1));
                }
            }

        }
        for (int i = 0; i < Mat1.length; i++) {
            System.out.print(Mat1[i]);
        }
        if (posicion == -1) {
            System.out.println("No se encuentra el elemento en la lista.");

        }
        System.out.println(" ");

        return posicion;
    }

    public static int busquedaBinaria(int[] Mat1, int numero) {
        int inicio = 0;
        int fin = Mat1.length - 1;
        int med;
        int encontrado = -1;
        numero = Entrada.leerEntero("Introduzca un número para buscar su posicion: ");
        while (inicio <= fin && encontrado == -1) {
            med = (inicio + fin) / 2;
            if (Mat1[med] == numero) {
                encontrado = med;
            } else if (Mat1[med] > numero) {
                fin = med - 1;
            } else {
                inicio = med + 1;
            }
        }

        return encontrado;
    }

    public static void ordenacionBurbuja(int[] Mat1, int numero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 3; j > i; j--) {
                if (Mat1[j] < Mat1[j - 1]) {
                    int aux = Mat1[j];
                    Mat1[j] = Mat1[j - 1];
                    Mat1[j - 1] = aux;
                }
            }
        }

        System.out.println("Vector ordenado por método burbuja.");
        for (int f = 0; f < Mat1.length; f++) {
            System.out.print(" " + Mat1[f]);
        }

        System.out.println(" ");
    }

    public static void ordenaSeleccion(int[] Mat1) {
        int menor;
        // Variable para intercambio.
        int aux;
        for (int i = 0; i < Mat1.length; i++) {
            // Se calcula el menor elemento a partir de i.
            menor = i;
            for (int j = i + 1; j < Mat1.length; j++) {
                if (Mat1[j] < Mat1[menor]) {
                    menor = j;
                }
            }
            // Se intercambia el elemento i con el elemento menor.
            aux = Mat1[i];
            Mat1[i] = Mat1[menor];
            Mat1[menor] = aux;
        }
    }

    public static boolean insercionyDesplazamiento(int[] Mat1) {

        // 1. Pedir número a insertar
        int nuevo = Entrada.leerEntero("Introduzca el número a insertar: ");

        // 2. Comprobar si el vector está ordenado
        boolean ordenado = true;
        for (int i = 0; i < Mat1.length - 1; i++) {
            if (Mat1[i] > Mat1[i + 1]) {
                ordenado = false;
                break;
            }
        }

        int pos;

        if (!ordenado) {
            System.out.println("El vector está DESORDENADO.");
            pos = Entrada.leerEntero("Introduzca la posición donde insertar (0 - " + (Mat1.length - 1) + "): ");
        } else {
            System.out.println("El vector está ORDENADO. Calculando posición automáticamente...");
            pos = 0;
            while (pos < Mat1.length && Mat1[pos] < nuevo) {
                pos++;
            }
            if (pos == Mat1.length) {
                pos = Mat1.length - 1;
            }
        }

        // 3. Comprobar si el vector está lleno
        boolean lleno = true;
        for (int i = 0; i < Mat1.length; i++) {
            if (Mat1[i] == 0) { // Consideramos 0 como celda vacía
                lleno = false;
                break;
            }
        }

        if (lleno) {
            System.out.println("El vector está lleno. Se perderá el último elemento.");
        }

        // 4. Desplazar a la derecha (de derecha a izquierda)
        for (int i = Mat1.length - 1; i > pos; i--) {
            Mat1[i] = Mat1[i - 1];
        }

        // 5. Insertar el nuevo valor
        Mat1[pos] = nuevo;

        // 6. Mostrar resultado
        System.out.println("Vector tras la inserción:");
        for (int i = 0; i < Mat1.length; i++) {
            System.out.print(Mat1[i] + " ");
        }
        System.out.println("");

        return true;
    }

}
