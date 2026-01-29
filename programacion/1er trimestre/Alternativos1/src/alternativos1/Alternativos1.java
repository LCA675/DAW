/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alternativos1;

/**
 *
 * @author DAW1-TARDE
 */
public class Alternativos1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicio 1. Diseña un proyecto en java que pida al usuario un número real y muestre por pantalla si el número es positivo, negativo o CERO.");
        float num;
        System.out.println("Escribe un número real");
        num = Entrada.leerFloat();
        if (num < 0) {
            System.out.println("El número es negativo");
        } else if (num > 0) {
            System.out.println("El número es positivo");
        } else if (num == 0) {
            System.out.println("El número es 0");
        }
    }
}
