/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colegio;

/**
 *
 * @author DAW1-TARDE
 */
public class Grupo {

    public String grupo;
    public Alumno[] alumnado;
    public int n_alumnos;

    public Grupo(String grupo) {
        this.grupo = grupo;
        this.alumnado = new Alumno[10];
        this.n_alumnos = 0;

    }

    public Grupo() {
        this.grupo = "";
        this.alumnado = new Alumno[10];
        this.n_alumnos = 0;

    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public Alumno[] getAlumnado() {
        return alumnado;
    }

    public void setAlumnado(Alumno[] alumnado) {
        this.alumnado = alumnado;
    }

    public int getN_alumnos() {
        return n_alumnos;
    }

    public void setN_alumnos(int n_alumnos) {
        this.n_alumnos = n_alumnos;
    }

    public void listadoAlumnos() {
        for (int i = 0; i < n_alumnos; i++) {
            System.out.println(alumnado[i].boletin());
        }
    }
    
    public boolean insertarAlumno(){
        if (n_alumnos<alumnado.length){
            alumnado[n_alumnos]=new Alumno();
            return true;
        }  
        return false;
    }
    
    public boolean buscarAlumno(int nombre){
        for (int i = 0; i < n_alumnos; i++) {
            if (alumnado[i].equals(nombre)){
                
            }
        }
        
        return false;
    }

}
