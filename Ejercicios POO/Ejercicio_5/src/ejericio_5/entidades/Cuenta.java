/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejericio_5.entidades;

/**
 * Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
 * atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
 * operaciones asociadas a dicha clase son:
  * • Constructor por defecto y constructor con DNI, saldo y número de cuenta.
 * • Agregar los métodos getters y setters correspondientes
 * • Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
 * • Método ingresar(double ingreso): el método recibe una cantidad de dinero a
 *    ingresar y se la sumara a saldo actual.
 * • Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
 *    se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
 *    pondrá el saldo actual en 0.
 * • Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
 *    que el usuario no saque más del 20%.
 * • Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
 * • Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 * 
 */
public class Cuenta {
    
    private int numcuenta;
    private long dni;
    private double saldoactual;

    public Cuenta() {
        
    }

    public Cuenta(int numcuenta, long dni, double saldoactual) {
        this.numcuenta = numcuenta;
        this.dni = dni;
        this.saldoactual = saldoactual;
        
    }

    public void setNumcuenta(int numcuenta) {
        this.numcuenta = numcuenta;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setSaldoactual(double saldoactual) {
        this.saldoactual = saldoactual;
    }

    public int getNumcuenta() {
        return numcuenta;
    }

    public long getDni() {
        return dni;
    }

    public double getSaldoactual() {
        return saldoactual;
    }
    
    
    
    
}
