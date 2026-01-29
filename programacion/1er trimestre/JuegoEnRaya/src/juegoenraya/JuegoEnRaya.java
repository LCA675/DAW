/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juegoenraya;

/**
 *
 * @author DAW1-TARDE
 */
public class JuegoEnRaya {

    private static int[] lista1;
    // Constante con el número de posiciones del vector
    final static int LO2 = 7;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[][] tablero = new char[LO2][LO2];
        char[][] ultimaFicha = new char[LO2][LO2];
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
                    System.out.println("El tablero será una matriz de tamaño 7 x 7.\n"
                            + "El jugador (con fichas \"X\") se enfrentará al ordenador (con fichas \"O\").\n"
                            + "Para ocupar una determinada posición, el jugador elegirá la columna en la que deposita su ficha (sólo podrá elegir posiciones que estén libres).\n"
                            + "El ordenador ocupará sus posiciones de forma aleatoria.\n"
                            + "El juego termina cuando gane el jugador, el ordenador o empaten (cuando no queden posiciones libres).\n"
                            + "Para ganar tendrá que tener al menos 4 fichas consecutivas iguales en horizontal, vertical o diagonal.\n"
                            + "El aspecto del juego sería como sigue:\n"
                            + "|1|2|3|4|5|6|7|\n"
                            + "| | | | | | | |\n"
                            + "| | | | | | | |\n"
                            + "| | | | | | | |\n"
                            + "| | | |O| | | |\n"
                            + "| | |O|X| | | |\n"
                            + "| |O|X|X| |O| |\n"
                            + "|O|O|X|O|X|X|X|");

                    while (true) {
                        ordenador(tablero);
                        if (comprobarGanador(tablero)) {
                            break;
                        }

                        jugador1(tablero);
                        if (comprobarGanador(tablero)) {
                            break;
                        }

                    }

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

    public static void jugador1(char[][] tablero) {
        System.out.println("| 1 |   | 2 |   | 3 |   | 4 |   | 5 |   | 6 |   | 7 |");
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print("| " + tablero[j][i] + " | \t");
            }
            System.out.println(" ");
        }
        int jugadorColumna = Entrada.leerEntero("Elija una columna para poner su ficha: ") - 1;
        int jugadorFila = 0;
        for (int h = 0; h < tablero[jugadorColumna].length; h++) {
            if (tablero[jugadorColumna][h] != 'O' && tablero[jugadorColumna][h] != 'X') {
                jugadorFila = h;
            }
        }
        tablero[jugadorColumna][jugadorFila] = 'X';

    }

    public static void ordenador(char[][] tablero) {
        int jugadaOrdenadorColumna = (int) (Math.random() * tablero.length);
        int jugadaOrdenadorFila = 0;
        for (int i = 0; i < tablero[jugadaOrdenadorColumna].length; i++) {
            if (tablero[jugadaOrdenadorColumna][i] != 'O' && tablero[jugadaOrdenadorColumna][i] != 'X') {
                jugadaOrdenadorFila = i;
            }
        }
        if (jugadaOrdenadorFila != -1) {
            tablero[jugadaOrdenadorColumna][jugadaOrdenadorFila] = 'O';
        }

    }

    public static boolean comprobarGanador(char[][] tablero) {

        /* Horizontal*/
        for (int columna = 0; columna < tablero.length; columna++) {
            for (int fila = 0; fila < tablero[0].length; fila++) {
                if (columna < (tablero.length - 4)) {
                    if (tablero[columna][fila] != ' '
                            && tablero[columna][fila] == tablero[columna + 1][fila]
                            && tablero[columna][fila] == tablero[columna + 2][fila]
                            && tablero[columna][fila] == tablero[columna + 3][fila]) {
                        quienesGanador(tablero[columna][fila]);
                        return true;
                    }
                }
            }

            // Vertical
            for (int col = 0; col < (tablero.length); col++) {
                for (int fila = 0; fila <= (tablero.length - 4); fila++) {
                    if (tablero[columna][fila] != ' '
                            && tablero[col][fila] != ' '
                            && tablero[col][fila] == tablero[col][fila + 1]
                            && tablero[col][fila] == tablero[col][fila + 2]
                            && tablero[col][fila] == tablero[col][fila + 3]) {

                        quienesGanador(tablero[col][fila]);
                        return true;
                    }
                }
            }

        }
        
        
        
        
        
        
        
        
        return false;

    }

    public static void quienesGanador(char ficha) {
        if (ficha == 'O') {
            System.out.println("Ha ganado el ordenador");
        } 
        if (ficha=='X') {
            System.out.println("Ha ganado el jugador");
        }
    }

}
