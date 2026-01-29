/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alternativos10;

/**
 *
 * @author DAW1-TARDE
 */
public class Alternativos10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Diseña un proyecto en java que simule el juego de piedra, papel, tijera "
                + "(pidiendo a cada jugador que escriba PIEDRA, PAPEL o TIJERA). El juego debe mostrar por pantalla quien ha ganado el juego tras jugar una partida (puede que hayan empatado)");
        String res1, res2;
        System.out.println("Elija: PIEDRA, PAPEL o TIJERA:");
        res1 = Entrada.leerCadena();
        System.out.println("Elija: PIEDRA, PAPEL o TIJERA:");
        res2 = Entrada.leerCadena();
        
        if (res1.equals(res2)) {
            System.out.println("Empate");
        } else if (res1.equals("PIEDRA") && res2.equals("TIJERA")) {
            System.out.println("Gana el jugador 1");
        } else if (res2.equals("PIEDRA") && res1.equals("TIJERA")) {
            System.out.println("Gana el jugador 2"); 
        }  else if (res1.equals("TIJERA") && res2.equals("PAPEL")) {
            System.out.println("Gana el jugador 1");
        }  else if (res2.equals("TIJERA") && res1.equals("PAPEL")) {
            System.out.println("Gana el jugador 2");
        } else if (res1.equals("PIEDRA") && res2.equals("PAPEL")) {
            System.out.println("Gana el jugador 2");
        } else if (res1.equals("PAPEL") && res2.equals("PIEDRA")) {
            System.out.println("Gana el jugador 1");
        }
    }
    
}
