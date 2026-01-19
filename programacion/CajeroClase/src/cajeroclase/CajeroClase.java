/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cajeroclase;

import java.util.Scanner;

/**
 *
 * @author DAW1-TARDE
 */
public class CajeroClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Cliente cliente1 = new Cliente("123456789E", 1100, new Cuenta("Pepe", "1234567", 0.4, 10000, 123456789));
        
        int opcion = -1;
        while (opcion != 0) {
            System.out.println("Ejercicio 1: Consultar/Modificar Datos perosnales ");
            System.out.println("Ejercicio 2: Ingresar nómina ");
            System.out.println("Ejercicio 3: Consultar datos Bancarios");
            System.out.println("Ejercicio 4: Sacar Dinero");
            System.out.println("Ejercicio 5: Modificar contraseña");
            System.out.println("Salir");
            
            opcion = Entrada.leerEntero("Introduzca un ejercicio");
            switch (opcion) {
                case 1:
                    System.out.println("Su DNI es: " + cliente1.getDni() + " y su sueldo es: " + cliente1.getSalario());
                    String res = Entrada.leerCadena("¿Quiere cambiar estos datos?");
                    
                    if (res.equals("s")) {
                        String dni = Entrada.leerCadena("Introduzca su nuevo DNI");
                        cliente1.setDni(dni);
                        double salar = Entrada.leerDouble("Introduzca su nuevo salario");
                        cliente1.setSalario(salar);
                    }
                    break;
                
                case 2:
                    cliente1.ingresarNomina();
                    System.out.println("Se ha ingresado la nomina a su cuenta; " + cliente1.getSalario());
                    break;
                
                case 3:
                    System.out.println("Para consultar los datos bancarios tendrá que introducir su contraseña");
                    System.out.println(cliente1.cuenta.getContraseña());
                    int opcio = Entrada.leerEntero("Introduzca su contraseña");
                    if (cliente1.getCuenta().validarContraseña(opcio) == true) {
                        System.out.println("Su numero de cuenta es: " + cliente1.getCuenta().getN_cuenta() + " y su saldo es: " + cliente1.getCuenta().getSaldo());
                        
                    }
                break;
                case 4:
                    int dinero = Entrada.leerEntero("¿Cuanto dinero quiere retirar?");
                    if (cliente1.getCuenta().reintegro(dinero) == false) {
                        System.out.println("No hay saldo suficiente");
                    } else {
                        System.out.println("Operación realizada con éxito");
                    }
                    break;                
                
                case 5:
                    int contraseña = Entrada.leerEntero("Introduzca su contraseña");
                    cliente1.getCuenta().cambiarContraseña(contraseña);
                
            }
        }
        
    }
    
}
