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
            System.out.println("Ejercicio 4: Ver los datos de todos los empleado");
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
                    pedirDatosEmpleado(empresa1);
                    break;

                case 3:
                    int deci = Entrada.leerEntero("¿Qué empleado quiere ver?(Introduzca el numero de su posición)");
                    empresa1.empleados[deci - 1].datosEmpleados();
                    break;

                case 4:
                    empresa1.listarEmpleados();
                    break;

                case 5:
                    for (int i = 0; i < empresa1.numeroEmpleados; i++) {
                        empresa1.pagarNomina(i);
                    }
                    System.out.println("Se han pagado todas las nóminas");
                    break;

                case 6:
                    int sal = Entrada.leerEntero("¿Cuanto dinero quiere ingresar en la cuenta de la empresa?");
                    empresa1.cuentaEmpresa.ingreso(sal);
            }
        }

    }

    public static Empleados pedirDatosEmpleado(Empresa empresa1) {
        System.out.println("Introduzca los datos del empleado");
        String categ = Entrada.leerCadena("¿Es programador(escriba p), gerente(escriba g) u otro tipo de empleado?(escriba e)");

        if (categ.equals("p")) {
            int he = Entrada.leerEntero("Introduzca las horas extras que hace al mes");
            String nombre = Entrada.leerCadena("Introduzca el nombre del empleado");
            String dni = Entrada.leerCadena("Introduzca el DNI del empleado");
            double salario = Entrada.leerDouble("Introduzca el salario del empleado");
            Empleados programador = new Programador(he, nombre, dni, salario);
            empresa1.contratar(programador);
            return programador;
        } else if (categ.equals("g")) {
            int pro = Entrada.leerEntero("Introduzca los proyectos que tiene el nuevo empleado");
            double com = Entrada.leerDouble("Introduzca la comision que recibe el nuevo empleado");
            String nombre = Entrada.leerCadena("Introduzca el nombre del empleado");
            String dni = Entrada.leerCadena("Introduzca el DNI del empleado");
            double salario = Entrada.leerDouble("Introduzca el salario del empleado");
            Empleados gerente = new Gerente(com, pro, nombre, dni, salario) ;
                

            empresa1.contratar(gerente);
            return gerente;
        } else {
            String nombre = Entrada.leerCadena("Introduzca el nombre del empleado");
            String dni = Entrada.leerCadena("Introduzca el DNI del empleado");
            double salario = Entrada.leerDouble("Introduzca el salario del empleado");
            Empleados empleado = new Empleados(nombre, dni, salario) {
                @Override
                public double extras() {
                    return 0;
                }
            };

            empresa1.contratar(empleado);
            return empleado;
        }

    }

}
