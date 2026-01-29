/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacionobjetos;

/**
 *
 * @author JMRivera
 */
public class Fecha {
  private int dia;
  private int mes;
  private int annio;
  private boolean esBisiesto;


  public Fecha(int dia, int mes, int annio) {
    this.dia = dia;
    this.mes = mes;
    this.annio = annio;
    this.esBisiesto= false;
  }

  public Fecha() {
    this.dia = 1;
    this.mes = 1;
    this.annio = 2000;
    esBisiesto(annio);
  }

  @Override
  public String toString() {
    return dia + "/" + mes + "/" + annio;
  }

  public int getDia() {
    return dia;
  }

  public void setDia(int dia) {
    this.dia = dia;

  }

  public int getMes() {
    return mes;
  }

  public void setMes(int mes) {
    this.mes = mes;

  }

  public int getAnnio() {
    return annio;
  }

  public void setAnnio(int annio) {
    this.annio = annio;

  }
 public esBisiesto(int annio){
     this.annio=annio;
     this.esBisiesto= ((annio%400==0) && (annio%4==0) && (annio%100!=0));
     
 }

  public boolean comprobarFecha(){
      boolean resul;
      this.esBisiesto=esBisiesto;
      resul = (dia >= 1 && dia <=12) && (mes >= 1 && mes <=31) && (annio >0);
      return 
  }
  
}
