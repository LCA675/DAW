/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mastermind2;

/**
 *
 * @author DAW1-TARDE
 */
public class MasterMind2 {

    private static int[] lista1;
    // Constante con el número de posiciones del vector
    final static int LO2 = 4;

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
                    RellenarMatrizMasterMind(Mat1);
                    System.out.println("El juego de MasterMind");
                    while (iguales(Mat1, Mat2) == false) {
                        RellenarMatriz(Mat2);
                        aciertos(Mat1, Mat2);
                        semiaciertos(Mat1, Mat2);
                        iguales(Mat1, Mat2);
                        MostrarVector(Mat2);
                        MostrarVector(Mat1);
                        System.out.println("Vuelve a intentarlo!");

                    }
                    System.out.println("Has acertado! ");

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

    public static int[] RellenarMatrizMasterMind(int[] Mat1) {
        for (int i = 0; i < Mat1.length; i++) {
            Mat1[i] = (int) (Math.random() * 8) + 1;
            for (int j = 0; j < i; j++) {
                if (Mat1[i]==Mat1[j]){
                    do {
                        Mat1[i] = (int) (Math.random() * 8) + 1;
                    } while (Mat1[i]==Mat1[j]);
                }
            }
        }
        return Mat1;
    }

    public static void RellenarMatriz(int[] Mat) {
        for (int i = 0; i < Mat.length; i++) {
            Mat[i] = Entrada.leerEntero("Introduzca un número del 1 al 8");
            for (int j = 0; j < i; j++) {
                if (Mat[i]==Mat[j]){
                    do {
                        Mat[i] = Entrada.leerEntero("No puede repetir ningun numero, introduzca otro");
                    } while (Mat[i] == Mat[j]);
            }}
        }
    }

    public static boolean iguales(int[] Mat1, int[] Mat2) {
        boolean resultado = false;
        if (Mat1.length != Mat2.length) {
            return false;
        }
        for (int i = 0; i < Mat1.length; i++) {
            if (Mat1[i] != Mat2[i]) {
                return resultado = false;
            }
        }
        return resultado = true;
    }

    public static void aciertos(int[] Mat1, int[] Mat2) {
        int aciertos = 0;
        for (int i = 0; i < Mat1.length; i++) {
            if (Mat1[i] == Mat2[i]) {
                aciertos++;
            }
        }
        for (int h = 0; h < aciertos; h++) {
            System.out.print("A");
        }
        System.out.println(" ");
    }

    public static void MostrarVector(int[] Mat) {
        for (int i = 0; i < Mat.length; i++) {
            System.out.print(" " + Mat[i]);
        }
        System.out.println(" ");
    }

    public static void semiaciertos(int[] Mat1, int[] Mat2) {
        for (int i = 0; i < Mat2.length; i++) {
            for (int j = 0; j < Mat1.length; j++) {
                if (Mat2[i] == Mat1[j] && i != j) {
                    System.out.print("S");
                }
            }
        }
        System.out.println(" ");
    }

}
