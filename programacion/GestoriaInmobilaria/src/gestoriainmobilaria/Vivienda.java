/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestoriainmobilaria;

/**
 *
 * @author DAW1-TARDE
 */
public class Vivienda extends Inmueble {
    
    protected int numHabitaciones;
    protected int numBaños;
    protected int plazasGaraje;
    protected int planta;
    protected boolean ascensor;

    public Vivienda(int numHabitaciones, int numBaños, int plazasGaraje, int planta, boolean ascensor, double superficie, String direccion, double precio) {
        super(superficie, direccion, precio);
        this.numHabitaciones = numHabitaciones;
        this.numBaños = numBaños;
        this.plazasGaraje = plazasGaraje;
        this.planta = planta;
        this.ascensor = ascensor;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public int getNumBaños() {
        return numBaños;
    }

    public void setNumBaños(int numBaños) {
        this.numBaños = numBaños;
    }

    public int getPlazasGaraje() {
        return plazasGaraje;
    }

    public void setPlazasGaraje(int plazasGaraje) {
        this.plazasGaraje = plazasGaraje;
    }

    public int getPlanta() {
        return planta;
    }

    public void setPlanta(int planta) {
        this.planta = planta;
    }

    public boolean isAscensor() {
        return ascensor;
    }

    public void setAscensor(boolean ascensor) {
        this.ascensor = ascensor;
    }
    

    @Override
    public double precioAlquiler() {
        int sum=0;
        if (this.ascensor==true){
            sum=50;
        } else {
            sum=this.planta*(-10);
        }
        return (this.getSuperficie()*10+this.getNumHabitaciones()*50+
                this.getNumBaños()*10+sum);
    }

    @Override
    public double comision() {
        return (this.precioAlquiler()+(this.precioAlquiler()*1.15));
    }
    
    public void verDatos(){
        System.out.println("Vivienda: ");
        this.verDatos();
    }

    @Override
    public void setPrecio(double precio) {
        super.setPrecio(precio); 
    }

    @Override
    public double getPrecio() {
        return super.getPrecio(); 
    }

    @Override
    public void setDireccion(String direccion) {
        super.setDireccion(direccion); 
    }

    @Override
    public String getDireccion() {
        return super.getDireccion(); 
    }

    @Override
    public void setSuperficie(double superficie) {
        super.setSuperficie(superficie); 
    }

    @Override
    public double getSuperficie() {
        return super.getSuperficie(); 
    }
    
    
    
}
