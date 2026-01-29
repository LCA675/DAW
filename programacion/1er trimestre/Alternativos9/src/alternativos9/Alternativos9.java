/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alternativos9;

/**
 *
 * @author DAW1-TARDE
 */
public class Alternativos9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Diseña un proyecto en java que pida al usuario tres números enteros, y que muestre por pantalla si la suma de dos de esos números da como resultado el otro número");
        int num1, num2, num3;
        System.out.println("Introduza un numero");
        num1 = Entrada.leerEntero();
        System.out.println("Introduza un numero");
        num2 = Entrada.leerEntero();
        System.out.println("Introduza un numero");
        num3 = Entrada.leerEntero();
        
        if (num1+num2==num3) {
            System.out.println("La suma del numero " +num1+ " y el numero " +num2+ " da como resultado "+num3);
        } else if (num2+num3==num1){
            System.out.println("La suma del numero " +num3+ " y el numero " +num2+ " da como resultado "+num1);
        } else if (num1+num3==num2) {
            System.out.println("La suma del numero " +num1+ " y el numero " +num3+ " da como resultado "+num2);
        } else {
            System.out.println("Ninguno de los numeros cumple la ocndicion");
        }
    }
    
}
