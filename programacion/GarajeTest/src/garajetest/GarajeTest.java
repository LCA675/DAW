/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package garajetest;

/**
 *
 * @author DAW1-TARDE
 */
public class GarajeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Garaje garaje1 = new Garaje (3);

        int opcion = -1;
        while (opcion != 0) {
            System.out.println("");
            System.out.println("Ejercicio 1: Añadir vehiculo ");
            System.out.println("Ejercicio 2: Sacar vehículo");
            System.out.println("Ejercicio 3: Datos de los vehículos del garaje");


            opcion = Entrada.leerEntero("Introduzca un ejercicio");

            switch (opcion) {
                case 1:
                    garaje1.añadirVehiculo();
                break;
                
                case 2:
                    int pos = Entrada.leerEntero("Introduzca en que plaza está su vehículo(plaza 0,1,2,3...)");
                    garaje1.devuelveVehiculo(pos);
                break;
                
                case 3:
                    for (int i=0; i<garaje1.plazaLibre;i++){
                        System.out.println(garaje1.vehiculos[i].toString());
                    }

            }
        }

    
    }
    
}
