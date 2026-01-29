/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles;

/**
 *
 * @author jmrivera
 */
public class Bucles {

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
                    ejercicio1();
                    break;
                case 2:
                    ejercicio2 ();
                    break;
                case 3:
                    ejercicio3 ();
                    break;
                case 4:
                    ejercicio4 ();
                    break;
                case 5:
                    ejercicio5 ();
                    break;
                case 6:
                    ejercicio6 ();
                    break;
                case 7:
                    ejercicio7 ();
                    break;
                case 8:
                    ejercicio8 ();
                    break;
                case 9:
                    ejercicio9 ();
                    break;
                case 10:
                    ejercicio10 ();
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
    
    public static void ejercicio1() {
        System.out.println("Dado un número positivo por el usuario, mostrar todos los números que hay desde 0 hasta dicho número inclusive.");
        int num, i;
        num = Entrada.leerEntero("Escriba un número positivo");
        i = 0;
        while(i<=num){
            System.out.println(i);
            i++;
        }
    }
    public static void ejercicio2() {
        System.out.println ("Dado dos números positivos (el primero más pequeño que el segundo), mostrar todos los números que hay desde el primero hasta el segundo (ambos inclusive)");
        int num1, num2, contador;
        num1 = Entrada.leerEntero("Escribe un numero positivo");
        num2 = Entrada.leerEntero("Escribe un numero positivo mayor que al anterior");
         if (num1>num2) {
            num1 = Entrada.leerEntero("Escribe un numero positivo");
            num2 = Entrada.leerEntero("Escribe un numero positivo mayor que al anterior");
        }
        for (contador=num1; contador<=num2; contador++) {
            System.out.println(+contador);
        }
    }
    
    public static void ejercicio3() {
        System.out.println("Dados dos números positivos (el primero más pequeño que el segundo), mostrar la suma de todos los números desde el primero hasta el segundo (ambos inclusive)");
        int num1, num2, contador,suma;
        suma=0;
        num1 = Entrada.leerEntero("Escribe un numero positivo");
        num2 = Entrada.leerEntero("Escribe un numero positivo mayor que al anterior");
         if (num1>num2) {
            num1 = Entrada.leerEntero("Escribe un numero positivo");
            num2 = Entrada.leerEntero("Escribe un numero positivo mayor que al anterior");
        }
        for (contador=num1; contador<=num2; contador++){
            suma=suma+contador;
        }
        System.out.println("La suma es "+suma);
    }
    
    public static void ejercicio4 (){
        System.out.println("Dado dos números positivos (el primero más pequeño que el segundo), "
                + "mostrar todos los números, desde el primero hasta el segundo, que sean divisores de un número concreto (dado también por el usuario)");
        int num1, num2, divisor;
        num1 = Entrada.leerEntero("Escribe un numero positivo");
        num2 = Entrada.leerEntero("Escribe un numero positivo mayor que al anterior");
        divisor = Entrada.leerEntero("Introduzca un numero");
         if (num1>num2) {
            num1 = Entrada.leerEntero("Escribe un numero positivo");
            num2 = Entrada.leerEntero("Escribe un numero positivo mayor que al anterior");
        }
        if (divisor%num1==0 && divisor%num2==0) {
            System.out.println("Los números "+num1+ " y " +num2+ " son divisores de " +divisor);
            for (int i = num1; i <= num2; i++) {
        if (divisor % i == 0) {
            System.out.println(i);
        }}
    }
    }
    
    public static void ejercicio5 () {
        System.out.println("Dados dos números positivos (el primero más pequeño que el segundo), "
                + "mostrar la suma de todos los números, desde el primero hasta el segundo, que sean divisores de un número concreto (dado también por el usuario)");
        int num1, num2, divisor, contador,suma;
        num1 = Entrada.leerEntero("Escribe un numero positivo");
        num2 = Entrada.leerEntero("Escribe un numero positivo mayor que al anterior");
        divisor = Entrada.leerEntero("Introduzca un numero");
        contador=0;
        suma=0;
        if (num1>num2) {
            num1 = Entrada.leerEntero("Escribe un numero positivo");
            num2 = Entrada.leerEntero("Escribe un numero positivo mayor que al anterior");
        }
        for (contador=num1; contador<=num2; contador++) {
            if (divisor%contador==0) {
                  suma=suma+contador;
        }
        }
        System.out.println("La suma es "+suma);
    }
    
    public static void ejercicio6 (){
        System.out.println("Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se introduzca un 0");
        int num;
        num = Entrada.leerEntero("Introduzca un número");
        while (num!=0) {
            if (num>0) {
                System.out.println("El numero es positivo");
            } else if (num<0) {
                System.out.println("El numero es negativo");
            }
            num = Entrada.leerEntero("Introduzca otro numero, para salir, pulse 0");
        }
    }
    
    public static void ejercicio7 () {
        System.out.println("Pedir números hasta que se teclee uno negativo. Una vez ocurra esto, "
                + "el algoritmo debe imprimir la suma de todos los números introducidos a excepción del número negativo");
        int num, suma;
        num = Entrada.leerEntero("Introduzca un numero");
        suma=0;
        while (num>0) {
            suma=suma+num;
            num = Entrada.leerEntero("Introduzca un numero");
        }
        System.out.println("La suma de los numeros introducidos son "+suma);
    }
    
    public static void ejercicio8() {
        System.out.println("Realiza un juego para adivinar un número numSecreto (por ejemplo, entre 0 y 20). "
                + "El algoritmo debe ir pidiendo números al usuario indicando si es mayor o menor que numSecreto. "
                + "El algoritmo acaba cuando el usuario acierta el número (Utilizar la función Math.random())");
        int num, secr;
        secr = (int)(Math.random() * 21);
        num = -1;
        while (num!=secr) {
            num = Entrada.leerEntero("Introduzca un numero");
            if (num>secr){
                System.out.println("El numero es menor");
            } else if (num<secr) {
                System.out.println("El numero es mayor");
            }
        }
        System.out.println("Has acertado!");
    }
    
    public static void ejercicio9 (){
        System.out.println("Pedir 10 números y escribir la suma total");
        int num, suma, contador;
        suma=0;
        for (contador=0; contador<10; contador++){
            num = Entrada.leerEntero("Introduce un numero");
            suma=suma+num;
        }
        System.out.println("La suma total de los numeros es "+suma);
    }
    
    public static void ejercicio10 (){
        System.out.println("Pedir un número N, introducir N números y mostrar el mínimo, máximo y la media");
        int num,numveces, maximo, minimo, media, contador;
        numveces = Entrada.leerEntero("Introduce un numero para meter ese numero de numeros:");
        contador=1;
        num = Entrada.leerEntero("Introduce un numero");
        maximo=num;
        minimo=num;
        media=num;
        for (contador=1; contador<numveces; contador++) {
            num = Entrada.leerEntero("Introduce un numero");
            if (maximo<num) {
                maximo=num;
            }
            if (minimo>num) {
                minimo=num;
            }
            media=media+num;
        }
        media=media/numveces;
        System.out.println("El máximo es "+maximo+ " , el minimo es " +minimo+ " y la media es "+media);
        
         
    }
}

