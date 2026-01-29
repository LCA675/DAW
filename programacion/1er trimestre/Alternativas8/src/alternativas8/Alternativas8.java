/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alternativas8;

/**
 *
 * @author DAW1-TARDE
 */
public class Alternativas8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Diseña un proyecto en java que calcule el área de un triángulo y el área de un círculo, para ello pedirá al usuario la base "
                + "y la altura del triangulo y el radio del círculo, y que muestre por pantalla ambos cálculos y cual de las dos figuras es mayor.");
        double arT, arC, alt, radio, base;
        System.out.println("Introduzca la altura del triangulo");
        alt = Entrada.leerDouble();
        System.out.println("Introduzca el radio del circulo");
        radio = Entrada.leerDouble();
        System.out.println("Introduzca la base del triangulo");
        base = Entrada.leerDouble();
        arT = ((alt * base)/2);
        arC = Math.PI * (radio * radio);
        System.out.println("Area triangulo "+arT);
        System.out.println("Area circulo "+arC);
        if (arT > arC) {
            System.out.println("El área del triangulo es mayor que la del circulo");
        } else {
            System.out.println("El area del circulo es mayor que la del triangulo");
        }
    }
    
}
