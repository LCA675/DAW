/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libroclase;

/**
 *
 * @author DAW1-TARDE
 */
public class Libro {
    public String titulo;
    public String autor;
    public int n_libros;
    public int n_libros_prestados;
    
    public Libro(){
        this.titulo="";
        this.autor="";
        this.n_libros=0;
        this.n_libros_prestados=0;
    }
    
    public Libro(String titulo, String autor, int n_libros, int n_numero_prestados){
        this.titulo=titulo;
        this.autor=autor;
        this.n_libros=n_libros;
        this.n_libros_prestados=n_numero_prestados;
    }
    
    public Libro (Libro libroCopia){
        this.titulo=libroCopia.titulo;
        this.autor=libroCopia.autor;
        this.n_libros=libroCopia.n_libros;
        this.n_libros_prestados=libroCopia.n_libros_prestados;
    }

    @Override
    public String toString() {
        return "Libro: \n" + "titulo=" + titulo + "\nautor=" + autor + ""
                + "\nn_libros=" + n_libros + "\nn_libros_prestados=" + n_libros_prestados;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the n_libros
     */
    public int getN_libros() {
        return n_libros;
    }

    /**
     * @param n_libros the n_libros to set
     */
    public void setN_libros(int n_libros) {
        this.n_libros = n_libros;
    }

    /**
     * @return the n_libros_prestados
     */
    public int getN_libros_prestados() {
        return n_libros_prestados;
    }

    /**
     * @param n_libros_prestados the n_libros_prestados to set
     */
    public void setN_libros_prestados(int n_libros_prestados) {
        this.n_libros_prestados = n_libros_prestados;
    }
    
    
    public boolean prestamo(){
        if (this.n_libros>0){
            this.n_libros_prestados++;
            this.n_libros--;
            return true;
        }
        return false;
    }
    
    public boolean devolucion(){
        if (this.n_libros_prestados>0){
            this.n_libros++;
            return true;
        }
        return false;
    }
    
}
