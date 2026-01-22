/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajeroclase;

/**
 *
 * @author DAW1-TARDE
 */
public class Cuenta {

    public String nombre;
    protected String n_cuenta;
    protected double saldo;
    protected int contraseña;

    public Cuenta() {
        this.nombre = "";
        this.n_cuenta = "";
        this.saldo = 0;
        this.contraseña = 0;
    }

    public Cuenta(String nombre, String n_cuenta, double saldo, int contraseña) {
        this.nombre = nombre;
        this.n_cuenta = n_cuenta;
        this.saldo = saldo;
        this.contraseña = contraseña;
    }

    public Cuenta(Cuenta cuentaCopia) {
        this.nombre = cuentaCopia.nombre;
        this.n_cuenta = cuentaCopia.n_cuenta;
        this.saldo = cuentaCopia.saldo;
        this.contraseña = cuentaCopia.contraseña;
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

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }

    public int getContraseña() {
        return contraseña;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "/ln nombre= " + nombre + " /ln n_cuenta= " + n_cuenta
                + "/ln saldo= " + saldo + '}';
    }

    public boolean haySaldo() {
        return getSaldo() > 0;
    }

    protected boolean ingreso(int ingreso) {
        if (ingreso > 0) {
            this.saldo += ingreso;
            return true;
        }
        return false;
    }

    protected boolean reintegro(int gasto) {
        if (this.saldo>=gasto && gasto > 0) {
            this.saldo -= gasto;
            return true;
        }
        return false;
    }

    public boolean transferencia(Cuenta n_cuentaDestino, int importe) {
        if (this.reintegro(importe)) {
            n_cuentaDestino.ingreso(importe);
            return true;
        }
        return false;
    }

    protected int generarContraseña() {
        if (this.contraseña == 0) {
            this.contraseña = (int) (Math.random() * 9000) + 1000;
            System.out.println("Su contraseña es: " + this.contraseña);
        } else {
            System.out.println("Ya tiene contraseña");
        }

        return contraseña;
    }

    public boolean validarContraseña(int contraseña) {
        if (contraseña == this.contraseña) {
            System.out.println("Contraseña correcta");
            return true;
        }
        System.out.println("Contraseña incorrecta");
        return false;
    }

    public void cambiarContraseña(int contraseña) {
        while (contraseña != this.contraseña) {
            System.out.println("Contraseña incorrecta");
        }
        System.out.println("Contraseña correcta. Generando contraseña nueva");
        this.contraseña = (int) (Math.random() * 9000) + 1000;
        System.out.println("Su nueva contraseña es: " +this.contraseña);
    }

    protected void mostrarDatos(int contraseña) {
        if (contraseña == this.contraseña) {
            System.out.println("Contraseña correcta");
            System.out.println(this.toString());
        } else {
            System.out.println("Contraseña incorrecta. Vuelva a intentarlo");
        }
    }

}
