/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package garajetest;

/**
 *
 * @author DAW1-TARDE
 */
class Moto extends Vehiculo {

    public Moto(float potencia, String matricula) {
        super(potencia, matricula);
    }

    @Override
    public void trucarVehiculo() {
        double poten = this.getPotencia() * 4;
    }

    @Override
    public String toString() {
        return "Moto{" +super.toString()+ '}';
    }

    
}
