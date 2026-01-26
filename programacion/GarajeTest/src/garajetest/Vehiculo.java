/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package garajetest;

/**
 *
 * @author jmrivera
 */
public abstract class Vehiculo {

  protected float potencia;
  protected String matricula;

  public Vehiculo(float potencia, String matricula) {
    this.potencia = potencia;
    this.matricula = matricula;
  }

  public float getPotencia() {
    return this.potencia;
  }

  public void setPotencia(float potencia) {
    this.potencia = potencia;
  }

  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

    @Override
    public String toString() {
        return "Vehiculo{" + "potencia=" + potencia + ", matricula=" + matricula + '}';
    }
  
  
  
  
  /*
  * Método abstracto 
  */
  public abstract void trucarVehiculo();

}


