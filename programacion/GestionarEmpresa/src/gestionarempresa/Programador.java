/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionarempresa;

/**
 *
 * @author DAW1-TARDE
 */
 class Programador extends Empleados{
     
     protected int horasExtras;
         
     
    @Override
    public double extras() {return this.horasExtras*20;}

    public Programador(int horasExtras, String nombre, String dni, double salario) {
        super(nombre, dni, salario);
        this.horasExtras = horasExtras;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    @Override
    public void datosEmpleados() {
        super.datosEmpleados();
        System.out.println("Horas extras: "+this.horasExtras);
    }
    
       

    
}
