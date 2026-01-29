/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array;

/**
 *
 * @author DAW1-TARDE
 */
public class Array {

    private static int[] azar;
    // Constante con el número de posiciones del vector
    final static int LON = 10;

    private static int[] ajedrez;
    // Constante con el número de posiciones del vector
    final static int LO2 = 8;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] azar = new int[LON][LON];
        char[][] ajedrez = new char[LO2][LO2];
        int opcion;
        do {
            opcion = menu();
            switch (opcion) {
                case 0:
                    break;
                case 1:
                    System.out.println("Diseñar un algoritmo que cree una tabla de 10x10 elementos llamado tabla, "
                            + "para ello crear la función rellenar que la rellene con 0 y 1 al azar y, la función ver, que muestre su contenido.");
                    rellenarAzar(azar);
                    mostrarAzar(azar);
                    break;

                case 2:
                    System.out.println("Diseñar un algoritmo similar al anterior que, usando una tabla, "
                            + "guarde la información de las posiciones iniciales de una partida de ajedrez tal como sigue, y muestre su contenido:");
                    rellenarAjedrez(ajedrez);
                    mostrarAjedrez(ajedrez);
                    break;
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
        System.out.println(" 0.- Salir");
        op = Entrada.leerEntero("Introduzca una opción:");
        return op;
    }

    public static void rellenarAzar(int[][] azar) {
        int fila = 0, columna = 0;
        for (columna = 0; columna < azar.length; columna++) {
            for (fila = 0; fila < azar.length; fila++) {
                azar[columna][fila] = (int) (Math.random() * 2);
            }

        }
    }

    public static void mostrarAzar(int[][] azar) {
        for (int columna = 0; columna < azar.length; columna++) {
            for (int fila = 0; fila < azar.length; fila++) {
                System.out.println("Coordenada :" + columna + "," + fila + " = [" + azar[columna][fila] + "]");
            }

        }
    }

    public static void rellenarAjedrez(char[][] ajedrez) {
        for (int fila = 0; fila < ajedrez.length; fila++) {
            for (int columna = 0; columna < ajedrez[fila].length; columna++) {
                if (fila == 1 || fila == 6) {
                    ajedrez[fila][columna] = 'P';
                } else if ((fila == 0 && columna == 0) || (fila == 0 && columna == 7) || (fila == 7 && columna == 0) || (fila == 7 && columna == 7)) {
                    ajedrez[fila][columna] = 'T';
                } else if ((fila == 0 && columna == 1) || (fila == 0 && columna == 6) || (fila == 7 && columna == 1) || (fila == 7 && columna == 6)) {
                    ajedrez[fila][columna] = 'C';
                } else if ((fila == 0 && columna == 2) || (fila == 0 && columna == 5) || (fila == 7 && columna == 2) || (fila == 7 && columna == 5)) {
                    ajedrez[fila][columna] = 'A';
                } else if ((fila == 0 && columna == 3) || (fila == 7 && columna == 3)) {
                    ajedrez[fila][columna] = 'Q';
                } else if ((fila == 0 && columna == 4) || (fila == 7 && columna == 4)) {
                    ajedrez[fila][columna] = 'K';
                } else {
                    ajedrez[fila][columna] = '-';
                }
            }
        }
    }

    public static void mostrarAjedrez(char[][] ajedrez) {
        for (int fila = 0; fila < ajedrez.length; fila++) {
            for (int columna = 0; columna < ajedrez[fila].length; columna++) {
                System.out.print(ajedrez[fila][columna] + "\t");
            }
            System.out.println();
        }
    }

}
