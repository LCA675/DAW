/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package garajetest;

/**
 *
 * @author DAW1-TARDE
 */
class Coche extends Vehiculo {

    public int numPlazas;

    public Coche(int numPlazas, float potencia, String matricula) {
        super(potencia, matricula);
        this.numPlazas = numPlazas;
    }

    @Override
    public void trucarVehiculo() {
        double poten=this.getPotencia()*2;
    }

    public int getNumPlazas() {
        return numPlazas;
    }

    @Override
    public String toString() {
        return "Coche{"+super.toString() + "numPlazas=" + numPlazas + '}';
    }
    
    

}
