/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colegio;

/**
 *
 * @author DAW1-TARDE
 */
public class Alumno {

    public String dni;
    public String nombre;
    public int edad;
    public int nota_trimestre1;
    public int nota_trimestre2;
    public int nota_trimestre3;

    public Alumno(String dni, String nombre, int edad, int nota_trimestre1, int nota_trimestre2, int nota_trimestre3) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.nota_trimestre1 = nota_trimestre1;
        this.nota_trimestre2 = nota_trimestre2;
        this.nota_trimestre3 = nota_trimestre3;
    }

    public Alumno() {
        this.dni = "";
        this.nombre = "";
        this.edad = 0;
        this.nota_trimestre1 = -1;
        this.nota_trimestre2 = -1;
        this.nota_trimestre3 = -1;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNota_trimestre1() {
        return nota_trimestre1;
    }

    public void setNota_trimestre1(int nota_trimestre1) {
        if (nota_trimestre1 >= 0) {
            this.nota_trimestre1 = nota_trimestre1;
        }
    }

    public int getNota_trimestre2() {
        return nota_trimestre2;
    }

    public void setNota_trimestre2(int nota_trimestre2) {
        this.nota_trimestre2 = nota_trimestre2;
    }

    public int getNota_trimestre3() {
        return nota_trimestre3;
    }

    public void setNota_trimestre3(int nota_trimestre3) {
        this.nota_trimestre3 = nota_trimestre3;
    }

    public String boletin() {
        return "Alumno: " + nombre + "\n Edad: " + edad + "\n DNI: " + dni + "\n Media del curso: " + notaFinal();
    }

    public double notaFinal() {
        double notafinal = 0;
        if (this.nota_trimestre1 == -1 || this.nota_trimestre2 == -1 || this.nota_trimestre3 == -1) {
            System.out.println("No se ha podido realizar la media ya que hay algún trimestre sin evaluar");
            notafinal = -1;
        } else {
            notafinal = (this.nota_trimestre1 + this.nota_trimestre2 + this.nota_trimestre3) / 3;
            System.out.println("La media del curso es: " + notafinal);
        }
        return notafinal;
    }

    public void rellenarNotas() {
        this.nota_trimestre1 = (int) (Math.random() * 10 + 1);
        this.nota_trimestre2 = (int) (Math.random() * 10 + 1);
        this.nota_trimestre3 = (int) (Math.random() * 10 + 1);

    }
    
    

}
