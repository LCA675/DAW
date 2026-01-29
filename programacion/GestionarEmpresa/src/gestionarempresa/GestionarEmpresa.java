/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionarempresa;

/**
 *
 * @author DAW1-TARDE
 */
public class GestionarEmpresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Empresa empresa1 = new Empresa("SEUR", "1234", 50000);

        int opcion = -1;
        while (opcion != 0) {
            System.out.println("");
            System.out.println("Ejercicio 1: Ver/modificar los datos de la empresa:");
            System.out.println("Ejercicio 2: Contratar a un empleado");
            System.out.println("Ejercicio 3: Ver los datos de un empleado");
            System.out.println("Ejercicio 4: Ver los datos de todos los empleado)");
            System.out.println("Ejercicio 5: Pagar todas las nóminas");
            System.out.println("Ejercicio 6: Ingresar en la cuenta de la empresa");

            opcion = Entrada.leerEntero("Introduzca un ejercicio");

            switch (opcion) {
                case 1:
                    System.out.println("Los datos de la empresa son: ");
                    empresa1.datosEmpresa();
                    String dec = Entrada.leerCadena("¿Quiere modificar algún dato?(s para cambiarlos)");
                    if (dec.equals("s")) {
                        String nom = Entrada.leerCadena("Introduzca el nombre");
                        String ci = Entrada.leerCadena("Introduzca el CIF");
                        int sal = Entrada.leerEntero("Introduzca el saldo actual");
                        empresa1.setNombreEmpresa(nom);
                        empresa1.setCif(ci);
                        empresa1.getCuentaEmpresa().setSaldo(sal);
                    }
                    break;

                case 2:
                    System.out.println("Introduzca los datos del empleado");

                    String nombre = Entrada.leerCadena("Introduzca el nombre del empleado");
                    String dni = Entrada.leerCadena("Introduzca el DNI del empleado");
                    double salario = Entrada.leerDouble("Introduzca el salario del empleado");
                    Empleados empleado = new Empleados(nombre, dni, salario);
                    
                    empresa1.contratar(empleado);

            }
        }

    }
}
