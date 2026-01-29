/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alternativos6;

/**
 *
 * @author DAW1-TARDE
 */
public class Alternativos6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Diseña un proyecto en java que pida al usuario un número entero entre 0 y 9999 y muestre por pantalla cuantas cifras tiene dicho número.");
        int num;
        System.out.println("Escribe un numero:");
        num = Entrada.leerEntero();
        if (num>0 && num<10000) {
            if (num<10) {
                System.out.println("El número tiene 1 cifra");
            }
            if (num>=10 && num<100) {
                System.out.println("El número tiene 2 cifras");
            }
            if (num>=100 && num<1000) {
                System.out.println("El número tiene 3 cifras");
            }
            if (num>=1000 && num<10000) {
                System.out.println("El número tiene 4 cifras");
            }
        }
    }
    
}
