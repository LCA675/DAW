/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionarempresa;

/**
 *
 * @author DAW1-TARDE
 */
public class Cuenta {

    private String nombre;
    private String n_cuenta;
    private double interes;
    private double saldo;

    public Cuenta() {
        this.nombre = "";
        this.n_cuenta = "";
        this.interes = 0;
        this.saldo = 0;
    }

    public Cuenta(String nombre, String n_cuenta, double interes, double saldo) {
        this.nombre = nombre;
        this.n_cuenta = n_cuenta;
        this.interes = interes;
        this.saldo = saldo;
    }

    public Cuenta(Cuenta cuentaCopia) {
        this.nombre = cuentaCopia.nombre;
        this.n_cuenta = cuentaCopia.n_cuenta;
        this.interes = cuentaCopia.interes;
        this.saldo = cuentaCopia.saldo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the n_cuenta
     */
    public String getN_cuenta() {
        return n_cuenta;
    }

    /**
     * @param n_cuenta the n_cuenta to set
     */
    public void setN_cuenta(String n_cuenta) {
        this.n_cuenta = n_cuenta;
    }

    /**
     * @return the interes
     */
    public double getInteres() {
        return interes;
    }

    /**
     * @param interes the interes to set
     */
    public void setInteres(double interes) {
        this.interes = interes;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta: " + "  nombre= " + this.nombre + " , numero de cuenta= " + this.n_cuenta
                + " , interes = " + this.interes + " , saldo= " + this.saldo;
    }

    public boolean haySaldo() {
        return getSaldo() > 0;
    }

    public boolean ingreso(double ingreso) {
        if (ingreso > 0) {
            this.saldo += ingreso;
            return true;
        }
        return false;
    }

    public boolean reintegro(double gasto) {
        if (this.haySaldo() && gasto > 0) {
            this.saldo -= gasto;
            return true;
        }
        return false;
    }

    public boolean transferencia(Cuenta n_cuentaDestino, double importe) {
        if (this.reintegro(importe)) {
            n_cuentaDestino.ingreso(importe);
            return true;
        }
        return false;
    }

}
