/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vectores7;

/**
 *
 * @author DAW1-TARDE
 */
public class Vectores7 {
    private static int[] lista1;
    // Constante con el número de posiciones del vector
    final static int LO2 = 2;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] [] Mat = new int [LO2] [LO2];
        int [] [] Mat1 = new int [LO2] [LO2];
        int [] [] Mat2 = new int [LO2] [LO2];
        int [] [] MatResultado = new int [LO2] [LO2];
        int[] lista1 = new int[LO2];
        int [] lista2 = new int[LO2];
        int opcion;
        do {
            opcion = menu();
            switch (opcion) {
                case 0:
                    break;
                case 1:
                    System.out.println("Diseñar una función llamada iguales, que reciba como parámetros dos argumentos: "
                            + "dos arrays de la misma dimensión, y devuelva VERDADERO o FALSO, si son iguales o no ambos arrays.");
                    System.out.println("¿Son las listas iguales? "+iguales(lista1,lista2));
                    break;

                case 2:
                    System.out.println("Diseñar una función llamada aciertos, que reciba como parámetros dos argumentos: "
                            + "dos arrays de la misma dimensión, y devuelva tantas 'A' como aciertos tenga. Un acierto será que las casillas de la misma posición de ambos arrays son iguales.");
                    iguales(lista1,lista2);
                    System.out.println("Ha acertado : ");
                    aciertos(lista1,lista2);
                    break;
                    
                case 3:
                    System.out.println("Diseñar las siguientes funciones para matrices cuadradas del mismo tamaño:\n" +
                                            "\n" +
                                            "MostrarMatriz(Mat)\n" +
                                            "\n" +
                                            "RellenarMatriz(Mat)\n" +
                                            "\n" +
                                            "SumarMatrices(Mat1,Mat2,MatResultado)\n" +
                                            "\n" +
                                            "RestarMatrices(Mat1,Mat2,MatResultado)\n" +
                                            "\n" +
                                            "MultiplicarMatrices(Mat1,Mat2,MatResultado)");
                    RellenarMatriz(Mat1);
                    RellenarMatriz(Mat2);
                    SumarMatrices(Mat1,Mat2,MatResultado);
                    RestarMatrices(Mat1,Mat2,MatResultado);
                    MultiplicarMatrices(Mat1,Mat2,MatResultado);
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
        System.out.println(" 0.- Salir");
        op = Entrada.leerEntero("Introduzca una opción:");
        return op;
    }

    public static boolean iguales(int [] lista1, int [] lista2) {
        boolean resultado=false;
        
        for (int i=0; i<lista1.length; i++){
            lista1[i]= Entrada.leerEntero("Introduce un numero");
        }
        
        for (int i=0; i<lista2.length; i++){
            lista2[i]= Entrada.leerEntero("Introduce un numero");
        }
        
        for (int i=0; i<lista2.length; i++){
            if (lista2[i]== lista1[i]){
                return resultado=true;
            }
        }
        return resultado;
    }

    public static void aciertos(int[] lista1, int[] lista2) {
        int aciertos=0;
        for (int i=0; i<lista2.length; i++){
            if (lista2[i]== lista1[i]){
               aciertos++;
            }
        }       
        for (int i=0; i<aciertos; i++){
            System.out.print(" A");
        }
        System.out.println(" ");
    }

    public static void MostrarMatriz(int[][] Mat) {
        for (int i=0; i<Mat.length; i++){
            for (int j=0; j<Mat[0].length; j++){
                System.out.println("La posición ["+(i+1)+","+(j+1)+"] es: "+Mat[i][j]);
            }
        }
    }

    public static void RellenarMatriz(int[][] Mat) {
        for (int i=0; i<Mat.length; i++){
            for (int j=0; j<Mat[0].length; j++){
                Mat [i][j]= Entrada.leerEntero("Introduzca un número");
            }
        }
    }

    public static void SumarMatrices(int[][] Mat1, int[][] Mat2, int[][] MatResultado) {
        for (int i=0; i<Mat1.length; i++){
            for (int j=0; j<Mat1[0].length; j++){
                for (int e=0; e<Mat2.length; e++){
                    for (int k=0; k<Mat2[0].length; k++){
                        for (int o=0; o<MatResultado.length; o++){
                            for (int h=0; h<MatResultado[0].length; h++){
                                MatResultado[o][h]=Mat1[i][j]+Mat2[e][k];
                            }
                        }
                    }
                }
        }
        }
        for (int o=0; o<MatResultado.length; o++){
            for (int h=0; h<MatResultado[0].length; h++){
                System.out.println("La suma de las matrices ["+(o+1)+" , "+(h+1)+"]: "+MatResultado[o][h]);
                            }
                        }
        
    }

    public static void RestarMatrices(int[][] Mat1, int[][] Mat2, int[][] MatResultado) {
       for (int i=0; i<Mat1.length; i++){
            for (int j=0; j<Mat1[0].length; j++){
                for (int e=0; e<Mat2.length; e++){
                    for (int k=0; k<Mat2[0].length; k++){
                        for (int o=0; o<MatResultado.length; o++){
                            for (int h=0; h<MatResultado[0].length; h++){
                                MatResultado[o][h]=Mat1[i][j]-Mat2[e][k];
                            }
                        }
                    }
                }
        }
        }
        for (int o=0; o<MatResultado.length; o++){
            for (int h=0; h<MatResultado[0].length; h++){
                System.out.println("La resta de las matrices ["+(o+1)+" , "+(h+1)+"]: "+MatResultado[o][h]);
                            }
                        }
        
    }

    public static void MultiplicarMatrices(int[][] Mat1, int[][] Mat2, int[][] MatResultado) {
        for (int i=0; i<Mat1.length; i++){
            for (int j=0; j<Mat1[0].length; j++){
                for (int e=0; e<Mat2.length; e++){
                    for (int k=0; k<Mat2[0].length; k++){
                        for (int o=0; o<MatResultado.length; o++){
                            for (int h=0; h<MatResultado[0].length; h++){
                                MatResultado[o][h]=Mat1[i][j]*Mat2[e][k];
                            }
                        }
                    }
                }
        }
        }
        for (int o=0; o<MatResultado.length; o++){
            for (int h=0; h<MatResultado[0].length; h++){
                System.out.println("La multiplicación de las matrices ["+(o+1)+" , "+(h+1)+"]: "+MatResultado[o][h]);
                            }
                        }
    }
    
   
    
    
    
}