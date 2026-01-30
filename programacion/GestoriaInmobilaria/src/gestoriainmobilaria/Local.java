/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestoriainmobilaria;

/**
 *
 * @author DAW1-TARDE
 */
 class Local extends Inmueble {

    public Local(double superficie, String direccion, double precio) {
        super(superficie, direccion, precio);
    }
     
     
     
    @Override
    public double precioAlquiler() {
        return this.getSuperficie()*20;
    }

    @Override
    public double comision() {
        return 2*this.precioAlquiler();
    }
     
    public void verDatos(){
        System.out.println("Local: ");
        this.verDatos();
    }
     
    
}
