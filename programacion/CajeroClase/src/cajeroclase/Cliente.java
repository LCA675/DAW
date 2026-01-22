/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajeroclase;

/**
 *
 * @author DAW1-TARDE
 */
public class Cliente {

    public String dni;
    public double salario;
    public Cuenta cuenta;

    public Cliente(String dni, double salario, Cuenta cuenta) {
        this.dni = dni;
        this.salario = salario;
        this.cuenta = cuenta();
    }

    public Cliente() {
        this.dni = "";
        this.salario = 0;
        this.cuenta = new Cuenta();
    }

    public String getDni() {
        return dni;
    }

    public double getSalario() {
        return salario;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setDni(String dni) {
        while (!dni.matches("^[0-9]{8}[A-Z]$")) {
            System.out.println("DNI no valido, vuelva a introducirlo");
        }
        this.dni = dni;
    }

    public void setSalario(double salario) {
        while (salario < 0) {
            System.out.println("Introduzca un salario válido");
        }
        this.salario = salario;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public void mostrarDatos() {
        System.out.println("Su DNI es : " + this.dni + "\n Su salario es: " + this.salario);
    }

    public void ingresarNomina() {
        cuenta.setSaldo(cuenta.getSaldo() + this.salario);
        System.out.println("Se ha ingresasdo su nómina");
    }

    public void sacarDinero() {
        if (cuenta.validarContraseña(0) == true) {
            System.out.println("Contraseña correcta");
            System.out.println("¿Cuanto dinero quiere retirar?");
            int dinero = Entrada.leerEntero();
            cuenta.reintegro(dinero);
        }
    }

}
