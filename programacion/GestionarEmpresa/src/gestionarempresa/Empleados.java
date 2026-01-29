/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionarempresa;

/**
 *
 * @author DAW1-TARDE
 */
public abstract class Empleados {
    private String nombre;
    private String dni;
    private double salario;
    private Cuenta cuentaEmpleado;

    public Empleados(String nombre, String dni, double salario) {
        this.nombre = nombre;
        this.dni = dni;
        this.salario = salario;
        this.cuentaEmpleado = new Cuenta (this.nombre,this.dni,5,this.salario);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Cuenta getCuentaEmpleado() {
        return cuentaEmpleado;
    }

    public void setCuentaEmpleado(Cuenta cuentaEmpleado) {
        this.cuentaEmpleado = cuentaEmpleado;
    }
    
    public abstract double extras();
    
    public void datosEmpleados(){
        System.out.println("Empleado: "+this.nombre+" \n  - DNI:"+this.dni+
                " \n  - Cuenta:"+this.cuentaEmpleado+" \n  - Salario:"+this.salario+" \n  - Extras:"+this.extras());
    }
    
}
