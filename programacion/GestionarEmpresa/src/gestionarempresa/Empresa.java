/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionarempresa;

/**
 *
 * @author DAW1-TARDE
 */
public class Empresa {

    protected String nombreEmpresa;
    protected String cif;
    protected int numeroEmpleados;
    protected Cuenta cuentaEmpresa;
    protected Empleados[] empleados = new Empleados[numeroEmpleados];

    public Empresa(String nombreEmpresa, String cif, int saldo) {
        this.nombreEmpresa = nombreEmpresa;
        this.cif = cif;
        this.numeroEmpleados = 0;
        this.empleados = new Empleados[numeroEmpleados];
        this.cuentaEmpresa = new Cuenta(nombreEmpresa, cif, 10, saldo);
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public int getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public void setNumeroEmpleados(int numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }

    public Cuenta getCuentaEmpresa() {
        return cuentaEmpresa;
    }

    public void setCuentaEmpresa(Cuenta cuentaEmpresa) {
        this.cuentaEmpresa = cuentaEmpresa;
    }

    public Empleados[] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleados[] empleados) {
        this.empleados = empleados;
    }

    public boolean contratar(Empleados empleado) {
        if (numeroEmpleados < empleados.length) {
            empleados[numeroEmpleados] = empleado;
            numeroEmpleados++;
            return true;
        }
        return false;
    }

    public Empleados devolverEmpleado(int pos) {
        if (pos <= numeroEmpleados) {
            return empleados[pos];
        }
        return null;
    }

    public boolean pagarNomina(int pos) {
        if (pos <= numeroEmpleados) {
            double salar = empleados[pos].extras() + empleados[pos].getSalario();
            this.cuentaEmpresa.transferencia(empleados[pos].getCuentaEmpleado(), salar);
            return true;
        }

        return false;
    }

    public void listarEmpleados() {
        if (numeroEmpleados > 0) {
            for (int i = 0; i < numeroEmpleados; i++) {
                empleados[i].datosEmpleados();
            }
        }
    }
    
    
    public void datosEmpresa(){
        System.out.println("Nombre: "+this.nombreEmpresa+" \n CIF: "+this.cif+" \n Saldo: "+this.cuentaEmpresa.getSaldo());
    }

}
