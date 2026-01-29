/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad7ed;


import java.util.Scanner;


public class Actividad7ED {


    public static void main(String[] args) {
        // Generar número secreto entre 1 y 10
        int numeroSecreto = (int)(Math.random() * 10) + 1;

        Scanner scanner = new Scanner(System.in);

        // Pedir intento al usuario
        System.out.print("Adivina el número (del 1 al 10): ");
        int intento = scanner.nextInt();


        // Comprobar si acertó
        if (intento == numeroSecreto) {
            System.out.println("¡Correcto! El número era " + numeroSecreto);
        } else {
            System.out.println("Incorrecto. El número era " + numeroSecreto);
        }


        scanner.close();
   
}


}

