/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package masejercicios;

/**
 *
 * @author DAW1-TARDE
 */
public class MasEjercicios {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // TODO code application logic here
        int opcion;
        do{
            opcion = menu();
            switch(opcion){
                case 0:
                    break;
                case 1:
                    System.out.println("Diseña una función en java que reciba como parámetro un número entero y devuelva el número de cifras que tiene dicho número.");
                    int num=Entrada.leerEntero("Introduce un numero");
                    int cifras=contarCifras(num);
                    System.out.println("El número tiene "+cifras+ " cifras");
                    break;
                case 2:
                    System.out.println("Diseña una función en java que reciba como parámetro un número entero y devuelva la suma de todas sus cifras.");
                    int num1=Entrada.leerEntero("Introduce un numero");
                    int suma=sumaCifras(num1);
                    System.out.println("La suma es "+suma);
                    break;
                case 3:
                    System.out.println("Diseña una función en java que reciba como parámetro dos números enteros numVeces y ultimoNumero. "
                            + "La función debe imprimir cada número que va desde 0 hasta ultimoNumero tantas veces como indique numVeces");
                    int numVeces=Entrada.leerEntero("Introduce un número de veces");
                    int ultimoNumero=Entrada.leerEntero("Introduzca otro numero");
                    int list=listaNumeros(numVeces, ultimoNumero);
                    break;
                case 4:
                    System.out.println("Diseña una función en java que pida al usuario un carácter y lo imprimirá por pantalla 20 veces. "
                            + "Esta acción se repetirá hasta que el carácter introducido sea el '*'. Dentro del bucle, imprimirá 20 veces seguidas el mismo carácter leido.");
                    String cara=Entrada.leerCadena("Introduce un caracter");
                    String carac=cadenasLeer(cara);
                    break;

                case 5:
                    System.out.println("Diseña una función en java que reciba como parámetro un número entero num e imprima:\n"
                               + "\n" +
                                "1 \n" +
                                "1 2\n" +
                                "1 2 3\n" +
                                "1 2 3 4\n" +
                                "1 2 3 4 ... num");
                    int num5=Entrada.leerEntero("Introduzca un numero");
                    int ejer5=ejercicio5 (num5);
                    break;
                default:
                    System.out.println("Opción no válida");
            }
            //ejercicio2();
            Entrada.leerTeclado("Pulse una tecla para continuar.");
        }while(opcion != 0);
    }
    
    public static int menu() {
        int op;
        System.out.println("Menu bucles");
        System.out.println(" 1.- Contar Cifras");
        System.out.println(" 2.- Sumar cifras de un número");
        System.out.println(" 3.- Imprimir numeros un numero de veces");
        System.out.println(" 4.- Imprimir caracteres 20 veces");
        System.out.println(" 5.- Ejercicio  5");   
        System.out.println(" 0.- Salir");    
        op = Entrada.leerEntero("Introduzca una opción:");
        return op;
    }
    
    public static int contarCifras (int num) {
        int contador=1, aux=num;
        while (aux>1) {
            aux=aux/10;
            contador++;
        }
        return contador;
        
    }
    public static int sumaCifras (int num1) {
        int suma=0, aux=num1, resto=0;
        while (aux>0) {
            resto=aux%10;
            suma+=resto;
            aux/=10;
        }
        return suma;
        
    }
    public static int listaNumeros (int numVeces, int ultimoNumero) {
        int i=0, j=0;
        for ( i = 0; i <= ultimoNumero; i++) {
            System.out.println( "\n");
        for ( j = 0; j < numVeces; j++) {
            System.out.print(i);
        }
    }
         return 0;
    }
       
    public static String cadenasLeer(String cara) {
        int contador=0;
        do {
            for (contador=0;contador<20;contador++){
                System.out.println(cara);
            }
            cara = Entrada.leerCadena("Introduza otro caracter, para salir escriba *");
        } while (!cara.equals("*"));
        return null;
    }
    

    public static int ejercicio5(int num5) {
        String cadena="";
        int contador=0;
        for (contador=0; contador<=num5; contador++){
            cadena=cadena+contador+" ";
            System.out.println(cadena);
        }
        return 0;
    }

    
    
}
