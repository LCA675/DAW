/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alternativas5;

/**
 *
 * @author DAW1-TARDE
 */
public class Alternativas5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Diseña un proyecto en java que pida al usuario tres caracteres y muestre por pantalla los tres caracteres ordenados de mayor a menor.");
        char char1, char2, char3;
        System.out.println("Escriba un caracter");
        char1 = Entrada.leerCaracter("");
        System.out.println("Escriba un caracter");
        char2 = Entrada.leerCaracter("");
        System.out.println("Escriba un caracter");
        char3 = Entrada.leerCaracter("");
        if (char1>char2 && char2>char3) {
            System.out.println("El orden de caracteres es "+char1+ " " +char2+ " " +char3);
        } else if (char1>char2 && char3>char2) {
            System.out.println("El orden de caracteres es "+char1+ " " +char3+ " " +char2);

        }
        if (char2>char3 && char3>char1) {
            System.out.println("El orden de caracteres es "+char2+ " " +char3+ " " +char1);            
        } else if (char2>char3 && char1>char3) {
            System.out.println("El orden de caracteres es "+char2+ " " +char1+ " " +char3);
        }
        
        if (char3>char1 && char1>char2){
            System.out.println("El orden de caracteres es "+char3+ " " +char1+ " " +char2);
        } else if (char3>char2 && char2>char1){
            System.out.println("El orden de caracteres es "+char3+ " " +char2+ " " +char1);
        }
    }
    
}
