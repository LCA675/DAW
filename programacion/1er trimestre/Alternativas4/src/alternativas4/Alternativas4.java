/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alternativas4;

/**
 *
 * @author DAW1-TARDE
 */
public class Alternativas4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Diseña un proyecto en java que pida al usuario dos números enteros y muestre por pantalla si alguno de ellos es múltiplo del otro.");
        int num1, num2;
        System.out.println("Escribe un numero");
        num1 = Entrada.leerEntero("");
        System.out.println("Escribe un numero");
        num2 = Entrada.leerEntero("");
        if (num1%num2==0) {
            System.out.println("El número " +num1+ " es múltiplo de "+num2);
        } else if (num2%num1==0) {
            System.out.println("El número " +num2+ " es múltiplo de "+num1);
        }
    }
    
}
