/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionarempresa;

/**
 *
 * @author DAW1-TARDE
 */
class Gerente extends Empleados{
    protected double comision;
    protected int proyectos;

    public Gerente(double comision, int proyectos, String nombre, String dni, double salario) {
        super(nombre, dni, salario);
        this.comision = comision;
        this.proyectos = proyectos;
    }

    @Override
    public double extras() {return this.comision*this.proyectos;}

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public int getProyectos() {
        return proyectos;
    }

    public void setProyectos(int proyectos) {
        this.proyectos = proyectos;
    }

    @Override
    public void datosEmpleados() {
        System.out.println("Gerente: ");
        super.datosEmpleados();
        System.out.println("  - Comision: "+this.comision+" \n  - Proyectos: "+this.proyectos);
    }
    
    
    
}
