/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avanzados;

/**
 *
 * @author DAW1-TARDE
 */
public class Avanzados {
public static void main(String[] args) {
        // TODO code application logic here
        int opcion;
        do{
            opcion = menu();
            switch(opcion){
                case 0:
                    break;
                case 1:
                    System.out.println("Diseña una función en java que reciba como parámetro dos números enteros y devuelva el MCD (máximo común divisor) de ambos.");
                    int num1, num2;
                    num1=Entrada.leerEntero("Introduzca un numero");
                    num2=Entrada.leerEntero("Introduzca un numero");
                    int mxd=maximoComunDivisor(num1, num2);
                    break;
                case 2:
                    System.out.println("Diseña una función en java que reciba como parámetro dos números enteros y devuelva el mcm (mínimo común múltiplo) de ambos");
                    int num1_2, num2_2;
                    num1_2 = Entrada.leerEntero("Introduzca un numero");
                    num2_2 = Entrada.leerEntero("Introduzca un numero");
                    int mcm=minimoComunMultiplo (num1_2, num2_2);
                    break;
                case 3:
                    System.out.println("Diseña una función en java que reciba como parámetro un número entero y devuelva \"true\" si es primo o \"false\" si no lo es.");
                    int num1_3= Entrada.leerEntero("Introduce un numero");
                    boolean primo = calcularPrimos(num1_3);
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
        System.out.println(" 1.- Ejercicio  1");
        System.out.println(" 2.- Ejercicio  2");
        System.out.println(" 3.- Ejercicio  3");
        System.out.println(" 4.- Ejercicio  4");
        System.out.println(" 5.- Ejercicio  5");
        System.out.println(" 6.- Ejercicio  6");
        System.out.println(" 7.- Ejercicio  7");
        System.out.println(" 8.- Ejercicio  8");
        System.out.println(" 9.- Ejercicio  9");
        System.out.println("10.- Ejercicio 10");    
        System.out.println(" 0.- Salir");    
        op = Entrada.leerEntero("Introduzca una opción:");
        return op;
    }

    public static int maximoComunDivisor(int num1, int num2) {
        int contador=1, contador1=1,max=0;
        for (contador=0;contador<=(num1/2);contador++){
            if (num1%contador==0){
                for (contador1=0; contador1<=num2/2;contador1++){
                    if (num2%contador1==0){
                        if (contador1==(contador)){
                            max=contador1;
                        } 
                    }
                }
            }
        }
        System.out.println("El maximo comun divisor es: ");
        return max;
    }
    public static int minimoComunMultiplo(int num1_2, int num2_2) {
        int max, mcm = 0, contador=0;
        if (num1_2 > num2_2) {
            max = num1_2;
        } else {
            max = num2_2;
        }
        for (contador= max;contador<=max ; contador++) {
            if (contador%num1_2==0 && contador%num2_2== 0) {
                mcm = contador;
            break;
            }
        }
        System.out.println("El mínimo común múltiplo es: " + mcm);
        return mcm;
    }

    public static boolean calcularPrimos(int num1_3) {
        int contador=2;
        boolean esPrimo=(true);
        for (contador=2;contador<=(num1_3/2); contador++){
            if (num1_3%contador!=0){
                esPrimo=(true);
            } else {
                esPrimo=(false);
                break;
            }
        }
        if (esPrimo==(true)){
            System.out.println("El número es primo");
        } else if (esPrimo==(false)){
            System.out.println("El numero no es primo");
        }  
        return esPrimo;
        
    }

    
    
}
