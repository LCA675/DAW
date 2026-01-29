/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alternativos7;

/**
 *
 * @author DAW1-TARDE
 */
public class Alternativos7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Diseña un proyecto en java que pida al usuario un número real y muestre por pantalla la nota del alumno, teniendo en cuenta:"
                + "0-5 es INSUFICIENTE (0 inclusive)"
                + "5-6 es SUFICIENTE (5 inclusive)"
                + "6-7 es BIEN (6 inclusive)"
                + "7-9 es NOTABLE (7 inclusive)"
                + "9-10 es SOBRESALIENTE (9 y 10 inclusive)");
        int nota;
        System.out.println("Introduzca su nota");
        nota = Entrada.leerEntero();
        switch(nota) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("La nota es insuficiente");
                break;
            case 5:
                System.out.println("La nota es suficiente");
                break;
            case 6:
                System.out.println("La nota es bien");
                break;
            case 7:
            case 8:
                System.out.println("La nota es notable");
                break;
            case 9:
            case 10:
                System.out.println("La nota es sobresaliente");
        }
            
                
        
    }
    
}
