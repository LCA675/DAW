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

    public boolean insertarAlumno(Alumno alumno) {
        if (n_alumnos < alumnado.length) {
            alumnado[n_alumnos] = alumno;
            n_alumnos++;
            return true;
        }
        return false;
    }

    public Alumno buscarAlumno(String nombre) {
        Alumno alumnoEn = new Alumno();
        for (int i = 0; i < n_alumnos; i++) {
            if (alumnado[i].nombre.equals(nombre)) {
                alumnoEn = alumnado[i];
                System.out.println(alumnoEn.boletin());
                return alumnoEn;
            }
        }
        return null;
    }

    public void evaluar() {
        for (int i = 0; i < n_alumnos; i++) {
            alumnado[i].rellenarNotas();
        }
    }

    public boolean mediaGrupo() {
        int media=0, contador=0;
        for (int i = 0; i < n_alumnos; i++) {
            if (alumnado[i].notaFinal()!=-1){
                media+=alumnado[i].notaFinal();
                contador++;
            } else {
                System.out.println("No se puede calcular la media");
                return false;
            }
        }
        int notafinal=0;
        notafinal= media/contador;
        System.out.println("La media del grupo es: "+notafinal);
        return true;
    }
}
