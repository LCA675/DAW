/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alternativos3;

/**
 *
 * @author DAW1-TARDE
 */
public class Alternativos3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Diseña un proyecto en java que pida al usuario dos números enteros y muestre por pantalla si el primer número es múltiplo del segundo número.");
        int num1, num2;
        System.out.println("Escribe un número entero:");
        num1 = Entrada.leerEntero();
        System.out.println("Escribe un número entero:");
        num2 = Entrada.leerEntero();
        if (num1 % num2 == 0) {
            System.out.println("El número " +num1+ " es múltiplo de " +num2);
        } else if (num2 % num1 ==0) {
            System.out.println("El número "+num2+ " es múltiplo de "+num1);
        }
    }
    
}
