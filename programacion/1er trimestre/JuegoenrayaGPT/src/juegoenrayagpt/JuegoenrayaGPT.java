/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juegoenraya;

public class JuegoEnRaya {

    final static int LO2 = 7;

    public static void main(String[] args) {
        char[][] tablero = new char[LO2][LO2];

        // *** CAMBIO 1: Inicializar el tablero con espacios en blanco ***
        // Antes estaba sin inicializar → contenía '\0' → errores en comprobaciones
        for (int i = 0; i < LO2; i++) {
            for (int j = 0; j < LO2; j++) {
                tablero[i][j] = ' ';
            }
        }

        int opcion;
        do {
            opcion = menu();
            switch (opcion) {
                case 0:
                    break;

                case 1:
                    System.out.println("El tablero será una matriz de 7x7...");
                    
                    while (true) {

                        // *** CAMBIO 2: Mostrar tablero siempre después de la jugada ***
                        ordenador(tablero);
                        mostrarTablero(tablero);

                        // *** CAMBIO 3: Comprobar ganador y tablero lleno después de CADA jugada ***
                        if (comprobarGanador(tablero)) break;
                        if (tableroLleno(tablero)) break;

                        jugador1(tablero);
                        mostrarTablero(tablero);

                        if (comprobarGanador(tablero)) break;
                        if (tableroLleno(tablero)) break;
                    }
                    break;

                default:
                    System.out.println("Opción no válida");
            }

            Entrada.leerTeclado("Pulse una tecla para continuar.");
        } while (opcion != 0);
    }

    public static int menu() {
        System.out.println("Menu");
        System.out.println(" 1.- Jugar");
        System.out.println(" 0.- Salir");
        return Entrada.leerEntero("Introduzca una opción:");
    }

    
    // *** CAMBIO 4: Método para mostrar tablero corregido ***
    // Antes mostraba al revés: intercambiaba filas y columnas
    public static void mostrarTablero(char[][] tablero) {
        System.out.println("  1 2 3 4 5 6 7");
        for (int fila = 0; fila < LO2; fila++) {
            System.out.print("|");
            for (int col = 0; col < LO2; col++) {
                System.out.print(tablero[col][fila] + "|");
            }
            System.out.println();
        }
        System.out.println();
    }

    // *** CAMBIO 5: jugador ahora usa filaDisponible() y evita columnas llenas ***
    public static void jugador1(char[][] tablero) {
        int col, fila;

        do {
            col = Entrada.leerEntero("Elija una columna (1-7): ") - 1;

            if (col < 0 || col >= LO2) {
                System.out.println("Columna inválida.");
                continue;
            }

            fila = filaDisponible(tablero, col);

            if (fila == -1)
                System.out.println("Columna llena. Elija otra.");

        } while (fila == -1);

        tablero[col][fila] = 'X';
    }


    // *** CAMBIO 6: ordenador coloca fichas correctamente (cayendo hacia abajo) ***
    // Tu versión colocaba la ficha SIEMPRE arriba, rompiendo el juego y nunca ganaba.
    public static void ordenador(char[][] tablero) {
        int col, fila;

        do {
            col = (int) (Math.random() * LO2);
            fila = filaDisponible(tablero, col);
        } while (fila == -1);

        tablero[col][fila] = 'O';
    }


    // *** CAMBIO 7: método nuevo para encontrar la primera fila libre desde abajo ***
    // Tu versión buscaba la última libre desde arriba → ERROR GRAVE solucionado.
    public static int filaDisponible(char[][] tablero, int col) {
        for (int fila = LO2 - 1; fila >= 0; fila--) {
            if (tablero[col][fila] == ' ') {
                return fila;
            }
        }
        return -1; // columna llena
    }


    // *** CAMBIO 8: comprobarGanador REESCRITO y CORREGIDO ***
    // Tu antigua versión tenía errores de límites, duplicaba bucles y confundía índices.
    public static boolean comprobarGanador(char[][] t) {

        // Horizontal
        for (int col = 0; col <= LO2 - 4; col++) {
            for (int fila = 0; fila < LO2; fila++) {
                if (t[col][fila] != ' ' &&
                    t[col][fila] == t[col+1][fila] &&
                    t[col][fila] == t[col+2][fila] &&
                    t[col][fila] == t[col+3][fila]) {

                    anunciarGanador(t[col][fila]);
                    return true;
                }
            }
        }

        // Vertical
        for (int col = 0; col < LO2; col++) {
            for (int fila = 0; fila <= LO2 - 4; fila++) {
                if (t[col][fila] != ' ' &&
                    t[col][fila] == t[col][fila+1] &&
                    t[col][fila] == t[col][fila+2] &&
                    t[col][fila] == t[col][fila+3]) {

                    anunciarGanador(t[col][fila]);
                    return true;
                }
            }
        }

        // Diagonal derecha
        for (int col = 0; col <= LO2 - 4; col++) {
            for (int fila = 0; fila <= LO2 - 4; fila++) {
                if (t[col][fila] != ' ' &&
                    t[col][fila] == t[col+1][fila+1] &&
                    t[col][fila] == t[col+2][fila+2] &&
                    t[col][fila] == t[col+3][fila+3]) {

                    anunciarGanador(t[col][fila]);
                    return true;
                }
            }
        }

        // Diagonal izquierda
        for (int col = 3; col < LO2; col++) {
            for (int fila = 0; fila <= LO2 - 4; fila++) {
                if (t[col][fila] != ' ' &&
                    t[col][fila] == t[col-1][fila+1] &&
                    t[col][fila] == t[col-2][fila+2] &&
                    t[col][fila] == t[col-3][fila+3]) {

                    anunciarGanador(t[col][fila]);
                    return true;
                }
            }
        }

        return false;
    }

    public static void anunciarGanador(char f) {
        if (f == 'X')
            System.out.println("¡Ha ganado el jugador!");
        else
            System.out.println("¡Ha ganado el ordenador!");
    }

    // *** CAMBIO 9: tableroLleno ahora funciona porque el tablero está inicializado correctamente ***
    public static boolean tableroLleno(char[][] t) {
        for (int col = 0; col < LO2; col++) {
            for (int fila = 0; fila < LO2; fila++) {
                if (t[col][fila] == ' ')
                    return false;
            }
        }
        System.out.println("¡Empate!");
        return true;
    }
}
