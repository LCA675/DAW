/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package vectores;

/**
 *
 * @author DAW1-TARDE
 */
public class Vectores {
    private static int[ ] notas;
	// Constante con el número de posiciones del vector
    final static int LON = 5;
    
    private static int[ ] pares;
	// Constante con el número de posiciones del vector
    final static int POS = 20;
    
    private static int[ ] tiradas;
	// Constante con el número de posiciones del vector
    final static int LON2 = 100;
    
    private static int[ ] impar;
	// Constante con el número de posiciones del vector
    final static int LON3 = 10;
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [] notas=new int [LON];
        int [] pares=new int [POS];
        int [] tiradas=new int [LON2];
        int [] nota=new int[LON2];
        int [] impar=new int[LON3];
        int opcion;
        do{
            opcion = menu();
            switch(opcion){
                case 0:
                    break;
                case 1:
                    System.out.println("Diseñar un algoritmo que pida 5 notas que se almacenaran en un array y calcule las notas máxima, mínima y media . Para ello diseña las funciones: "
                            + "rellenar(vector) que no devuelve nada y las funciones maximo(vector), Minimo(vector) y media(vector) que devolverán nota máxima, mínima y la media respectivamente.");
                    rellenarNotas(notas);
                    minimaNota(notas);
                    mediaNota(notas);
                    maximaNota(notas);
                    System.out.println("La nota mínima es: " + minimaNota(notas));
                    System.out.println("La media de las notas es: " + mediaNota(notas));
                    System.out.println("La nota máxima es: " + maximaNota(notas));
                    break;
                case 2:
                    System.out.println("Diseñar un algoritmo que cree un vector de 20 elementos llamado pares, "
                            + "lo rellene con los 20 primeros números pares y muestre su contenido: crear las funciones rellenar y mostrar, correspondientes.");
                    rellenarPares(pares);
                    mostrarPares(pares);
                    
                    break;
                case 3:
                    System.out.println("Diseñar un algoritmo que cree un vector de 100 elementos, almacene en él las tiradas de un dado (recuerda la función Math.random()). "
                            + "Por último deberá mostrar cuantas veces ha aparecido cada punto del dado."
                            + "Diseñar la función tiradas que rellene el vector y la función contarPunto(vector, punto) que devolverá cuantas veces aparece en el vector el valor punto.");
                    rellenarTiradas(tiradas);
                    int puntos=Entrada.leerEntero("Introduce un numero del 1 al 6");
                    int cuenta=mostrarTiradas (tiradas,puntos);
                    System.out.println("El número "+puntos+" ha salido "+cuenta+ " veces");
                    break;
                case 4:
                    System.out.println("Diseñar un algoritmo que cree un vector de 100 elementos, almacene en él 100 notas generadas al azar. "
                            + "Por último deberá mostrar cuantos aprobados y cuantos suspensos hay. Igual que el anterior con las funciones rellenar, cuentaAprobados y cuentaSuspensos");
                    rellenarNota(nota);
                    cuentaAprobados(nota);
                    cuentaSuspensos(nota);
                    int cuentaA=cuentaAprobados(nota);
                    int cuentaS=cuentaSuspensos(nota);
                    System.out.println("Ha aprobado un número de : "+cuentaA+" veces" );
                    System.out.println("Ha suspendido un número de : "+cuentaS+" veces" );
                    break;
                case 5:
                    System.out.println("Diseñar un algoritmo como el anterior que muestre cuantos suspensos, suficientes, bien, notables y sobresalientes hay. "
                            + "En este caso usaremos la función rellenar del ejercicio anterior y una función mostrarNotas que mostrará cuantos suspensos, suficientes, bien, notables y sobresalientes hay. "
                            + "También crearemos las funciones cuentaSuspensos, cuentaSuficientes, cuentaBien, cuentaNotables y cuentaSobresalientes.");
                    rellenarNota(nota);
                    cuentaSuspensos(nota);
                    cuentaSuficientes(nota);
                    cuentaBien(nota);
                    cuentaNotables(nota);
                    cuentaSobresalientes(nota);
                    int cuentaSu=cuentaSuspensos(nota), suficiente=cuentaSuficientes(nota), bien=cuentaBien(nota), notable=cuentaNotables(nota), sobresaliente=cuentaSobresalientes(nota);
                    System.out.println("Ha suspendido un número de : "+cuentaSu+" veces" );
                    System.out.println("Ha sacado suficiente un número de: "+suficiente+" veces");
                    System.out.println("Ha sacado bien un número de: "+bien+" veces");
                    System.out.println("Ha sacado notable un número de: "+notable+" veces");
                    System.out.println("Ha sacado sobresaliente un número de: "+sobresaliente+" veces");
                    break;
                case 6:
                    System.out.println("Diseñar un algoritmo que cree un vector de 10 elementos, "
                            + "lo rellene con los 10 primeros números impares y muestre su contenido en orden inverso. Diseñar la correspondiente funcion rellenarImpar y mostrarAlReves");
                    rellenarImpar(impar);
                    mostrarAlReves(impar);
                    
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
        System.out.println(" 0.- Salir");    
        op = Entrada.leerEntero("Introduzca una opción:");
        return op;
    }
    /* EJERCICIO 1 NOTAS */
    public static int minimaNota(int[] notas) {
        int i=0, minimo=notas[0];
        for (i=0; i<notas.length; i++){
            if (minimo>notas[i]) {
                minimo=notas[i];
            }
        }
        return minimo;
    }

    public static void rellenarNotas(int[] notas) {
        for (int i = 0; i < notas.length; i++) {
            notas[i] = Entrada.leerEntero("Introduzca la nota " + (i + 1) + ":");
        }
        
    }

    public static int mediaNota(int[] notas) {
        int i=0,suma=0;
        for (i=0; i<notas.length; i++){
            suma+=notas[i];
        }
        return suma/notas.length;
    }

    public static int maximaNota(int[] notas) {
        int i=0, maximo=notas[0];
        for (i=0; i<notas.length; i++){
            if (maximo<notas[i]){
                maximo=notas[i];
            }
        }
        return maximo;
    }

/* EJERCICIO 1 NOTAS */


    
    
    
    
/*EJERCICIO 2 PARES */

    public static void rellenarPares(int[] pares) {
            int i=0, cont=2;
            for (i=0; i<pares.length; i++){
                pares[i]=cont;
                cont=cont+2;
            }
        }

    public static int mostrarPares(int[] pares) {
        int i=0;
        for (i=0; i<pares.length; i++){
                System.out.println(pares[i]);
            }
        return 0;
    } 
 
  /*EJERCICIO 2 PARES */
    
    
  /*EJERCICIO 3 TIRADAS */

    public static int[] rellenarTiradas(int[] tiradas) {
        int i=0;
        for (i=0; i<tiradas.length; i++){
            tiradas[i]=(int)(Math.random()*6)+1 ;
        }  
        return tiradas;
    }

    public static int mostrarTiradas (int [] tiradas, int puntos){
        int i=0, cuenta=0;
        for (i=0; i<tiradas.length; i++){
            if (puntos==tiradas[i]){
                    cuenta++;
            }
        }
        return cuenta;
    }

    /*EJERCICIO 4*/
    
    public static int[] rellenarNota(int[] nota) {
        int i=0;
        for (i=0; i<nota.length; i++){
            nota[i]=(int)(Math.random()*10)+1 ;
        }  
        return nota;
    }

    public static int cuentaAprobados(int[] nota) {
        int i=0, aprobado=0;
        for (i=0; i<nota.length; i++){
            if (nota[i]>=5){
                    aprobado++;
            }
        }
        return aprobado;
    }

    public static int cuentaSuspensos(int[] nota) {
        int i=0, suspenso=0;
        for (i=0; i<nota.length; i++){
            if (nota[i]<5){
                    suspenso++;
            }
        }
        return suspenso;
    }
    /*EJERCICIO 4*/
    
    /*EJERCICIO 5*/

    public static int cuentaSuficientes(int[] nota) {
        int i=0, suficiente=0;
        for (i=0; i<nota.length; i++){
            if (nota[i]==5){
                    suficiente++;
            }
        }
        return suficiente;
    }

    public static int cuentaBien(int[] nota) {
        int i=0, bien=0;
        for (i=0; i<nota.length; i++){
            if (nota[i]==6){
                    bien++;
            }
        }
        return bien;
    }

    public static int cuentaNotables(int[] nota) {
       int i=0, notable=0;
        for (i=0; i<nota.length; i++){
            if (nota[i]==7 || nota[i]==8){
                    notable++;
            }
        }
        return notable;
    }
    public static int cuentaSobresalientes(int[] nota) {
        int i=0, sobresaliente=0;
        for (i=0; i<nota.length; i++){
            if (nota[i]==9 || nota[i]==10){
                    sobresaliente++;
            }
        }
        return sobresaliente;
    }
    
    /*EJERCICIO 5*/
    
    /*EJERCICIO 6*/

    public static int[] rellenarImpar(int[] impar) {
        int i=0, cont=1;
            for (i=0; i<impar.length; i++){
                impar[i]=cont;
                cont=cont+2;
            }
            return impar;
    }

    public static void mostrarAlReves(int[] impar) {
        for (int i=impar.length-1; i>=0;i--){
            System.out.print(impar[i]+" ");
        }
        System.out.println("");
    }
    
    /*EJERCICIO 6*/
   
}