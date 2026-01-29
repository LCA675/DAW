/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alternativos2;

/**
 *
 * @author DAW1-TARDE
 */
public class Alternativos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Diseña un proyecto en java que pida al usuario dos números enteros y muestre por pantalla qué número es mayor que el otro. En caso que sean iguales, mostrará por pantalla un mensaje diciendo que ambos números son iguales.\n");
        int num1, num2;
        System.out.println("Introduce un número entero");
        num1 = Entrada.leerEntero();
        System.out.println("Introduce otro número entero");
        num2 = Entrada.leerEntero();
        
        if (num1 > num2) {
            System.out.println("El número " +num1+ " es mayor que " +num2);
        } else if (num1 < num2) {
            System.out.println("El número " +num2+ " es mayor que " +num1);
        } else if (num1 == num2) {
            System.out.println("Los número son iguales");
        }
    }
    
}
