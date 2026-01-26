/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package garajetest;

/**
 *
 * @author DAW1-TARDE
 */
public class Garaje {

    public int numPlazas;
    public Vehiculo[] vehiculos = new Vehiculo[numPlazas];
    public int plazaLibre;

    public Garaje(int numPlazas) {
        this.numPlazas = numPlazas;
        this.vehiculos = new Vehiculo[numPlazas];
    }

    public int getplazaLibre() {
        return plazaLibre;
    }

    public boolean añadirVehiculo() {
        String dec = "";
        int numPlaza;
        float potencia;
        String matricula;
        System.out.println("¿Qué tipo de vehículo quiere añadir?(Coche=c, Moto=m");
        dec = Entrada.leerCadena();
        if (dec.equals("c")) {
            numPlaza = Entrada.leerEntero("Introduzca el numero de plazas");
            potencia = Entrada.leerFloat("Introduzca la potencia");
            matricula = Entrada.leerCadena("Introduza la matrícula");
            this.vehiculos[plazaLibre] = new Coche(numPlaza, potencia, matricula);
            this.plazaLibre++;
            return true;
        } else if (dec.equals("m")) {
            potencia = Entrada.leerFloat("Introduzca la potencia");
            matricula = Entrada.leerCadena("Introduza la matrícula");
            this.vehiculos[plazaLibre] = new Moto(potencia, matricula);
            this.plazaLibre++;
            return true;
        }

        return false;
    }

    public Vehiculo devuelveVehiculo(int pos) {
        if (this.vehiculos[pos] != null) {
            return this.vehiculos[pos];
        }
        return null;
    }

    public double cuotaMes(int pos) {
        double cuota = 0;
        if (this.vehiculos[pos] != null && this.vehiculos[pos] instanceof Coche) {
            Coche c = (Coche) this.vehiculos[pos];
            cuota = c.getPotencia() * c.numPlazas;
        } else if (this.vehiculos[pos] != null && this.vehiculos[pos] instanceof Moto) {
            Moto m = (Moto) this.vehiculos[pos];
            cuota = m.getPotencia() * 2;
        }

        return cuota;
    }

    public boolean hayPlazas() {
        for (int i = 0; i < numPlazas; i++) {
            if (this.vehiculos[i].equals(null)) {
                return true;
            }
        }
        return false;
    }

}
