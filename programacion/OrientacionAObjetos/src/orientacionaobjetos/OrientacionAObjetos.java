/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package orientacionaobjetos;
import java.util.Scanner;

/**
 *
 * @author DAW1-TARDE
 */
public class OrientacionAObjetos {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        Cuenta cuenta1 = new Cuenta();
        Cuenta cuenta2 = new Cuenta("Diego Rodríguez de Silva y Velázquez", "1234567890", 1.25, 500);
        Cuenta cuenta3 = new Cuenta(cuenta1);
        
        int opcion=-1;
        while (opcion!=0){
           System.out.println("Ejercicio 1: Ingreso a cuenta1 y mostrar saldo ");
           System.out.println("Ejercicio 2: Mostrar datos de la cuenta2 ");
           System.out.println("Ejercicio 3: Mostrar datos de la cuenta3 ");
           System.out.println("Ejercicio 4: Transferencia de 10 euros de cuenta3 a cuenta2");

           opcion=Entrada.leerEntero("Introduzca un ejercicio");
           switch(opcion){
            case 1:
                System.out.println("Ingreso a la cuenta 1");
                int ingreso=Entrada.leerEntero();
                while (cuenta1.ingreso(ingreso)==false) { 
                    System.out.println("No puede tener un ingreso negativo, vuelva a escribirlo bien");
                    ingreso=Entrada.leerEntero();
                }
                
                System.out.println("Mostrar el saldo tras el ingreso:");
                System.out.println("El saldo actual de la cuenta es "+cuenta1.getSaldo());
            break;
            
            case 2:
                System.out.println("Mostrar datos de la cuenta2");
                System.out.println("Los datos de la cuenta2 son los siguientes: "+cuenta2.toString());
            break;
            
            case 3:
                System.out.println("Mostrar datos de la cuenta3");
                System.out.println("Los datos de la cuenta3 son los siguientes: "+cuenta3.toString());
            break;
            
            case 4:
                System.out.println("Transferencia de 10 euros de cuenta3 a cuenta2");
                cuenta3.transferencia(cuenta2, 10);
                System.out.println("El saldo de la cuenta3 es:  "+cuenta3.getSaldo());
        } 
        }
        
        
    }
    
}
