/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_5.servicios;

import ejericio_5.entidades.Cuenta;
import java.util.Scanner;

/**
 * Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
 * atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo
 * actual. Las operaciones asociadas a dicha clase son: • Constructor por
 * defecto y constructor con DNI, saldo y número de cuenta. • Agregar los
 * métodos getters y setters correspondientes • Metodo para crear un objeto
 * Cuenta, pidiéndole los datos al usuario. • Método ingresar(double ingreso):
 * el método recibe una cantidad de dinero a ingresar y se la sumara a saldo
 * actual. • Método retirar(double retiro): el método recibe una cantidad de
 * dinero a retirar y se la restará al saldo actual. Si la cuenta no tiene la
 * cantidad de dinero a retirar, se pondrá el saldo actual en 0. • Método
 * extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que
 * el usuario no saque más del 20%. • Método consultarSaldo(): permitirá
 * consultar el saldo disponible en la cuenta. • Método consultarDatos():
 * permitirá mostrar todos los datos de la cuenta
 */
public class ServiciosCuenta {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cuenta creaCuenta() {

        Cuenta c1 = new Cuenta();

        System.out.print("Ingrese el número de cuenta: ");
        c1.setNumcuenta(leer.nextInt());

        System.out.print("Ingrese el número de DNI: ");
        c1.setDni(leer.nextLong());

        System.out.print("Ingrese el monto: ");
        c1.setSaldoactual(leer.nextDouble());

        return c1;
    }

    public void Ingresar(Cuenta c1) {

        System.out.print("Monto a ingresar: ");

        double montoing = leer.nextDouble();

        c1.setSaldoactual(montoing + c1.getSaldoactual());

        System.out.println("El saldo actual es: " + c1.getSaldoactual());

    }

    public void Retiro(Cuenta c1) {

        System.out.print("Monto a retirar: ");

        double montoret = leer.nextDouble();

        if (montoret > c1.getSaldoactual()) {
            c1.setSaldoactual(0);
        } else {
            c1.setSaldoactual(c1.getSaldoactual() - montoret);

        }
        System.out.println("El saldo actual es: " + c1.getSaldoactual());

    }

    public void extraccionRapida(Cuenta c1) {

        System.out.print("Monto a retirar, máximo 20%: ");
        double montorap = leer.nextDouble();

        if (montorap > (c1.getSaldoactual() * 0.2)) {
            System.out.println("Puede sacar un 20% como maximo");
        } else {
            c1.setSaldoactual(c1.getSaldoactual() - montorap);
        }

    }

    public void consultaSaldo(Cuenta c1) {

        System.out.println("El saldo actul es: " + c1.getSaldoactual());

    }

    public void consultaDatos(Cuenta c1) {

        System.out.println("El número de la cuenta es: " + c1.getNumcuenta());
        System.out.println("El DNI del titular de la cuenta es: " + c1.getDni());
        System.out.println("El saldo de la cuenta es: " + c1.getSaldoactual());

    }
}
