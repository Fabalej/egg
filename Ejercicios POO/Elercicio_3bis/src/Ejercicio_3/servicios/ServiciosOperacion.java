/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_3.servicios;

import Ejercicio_3.entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author fabla
 */
public class ServiciosOperacion {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    double suma1;
    double resta1;
    double mult;
    double div;

    public Operacion crearOperacion() {

        System.out.print("Ingrese un número: ");
        double numero1 = leer.nextDouble();

        System.out.print("Ingrese otro número: ");
        double numero2 = leer.nextDouble();

        return new Operacion(numero1, numero2);
    }

    public int menuOperacion() {

        System.out.println("1 - Suma");
        System.out.println("2 - Resta");
        System.out.println("3 - Multiplicación");
        System.out.println("4 - División");
        System.out.println("5 - Salir");
        System.out.println("Ingrese la operacion a realizar: ");
        int opcion = leer.nextInt();

        return opcion;
    }

    public void elecOperacion(int mn, Operacion op) {

        switch (mn) {

            case 1:
                suma(op.getNumero1(), op.getNumero2());
                System.out.println("La suma es = " + suma1);
                break;

            case 2:
                resta(op.getNumero1(), op.getNumero2());
                System.out.println("La resta es = " + resta1);
                break;

            case 3:
                multiplicar(op.getNumero1(), op.getNumero2());
                if (op.getNumero1() == 0 || op.getNumero2() == 0) {
                    System.out.println("Uno de los números ingresado fue el 0!!!");
                } else {
                    System.out.println("La multiplicación es = " + mult);
                }

                break;

            case 4:
                dividir(op.getNumero1(), op.getNumero2());
                if (op.getNumero1() == 0 || op.getNumero2() == 0) {
                    System.out.println("Uno de los números ingresado fue el 0!!!");
                } else {
                    System.out.println("La división es = " + div);

                }

                break;

            case 5:
                break;

            default:
                System.out.println("No existe la opción elegida");

        }

    }

    public double suma(double numero1, double numero2) {

        suma1 = numero1 + numero2;

        return suma1;
    }

    public double resta(double numero1, double numero2) {

        resta1 = numero1 - numero2;

        return resta1;
    }

    public double multiplicar(double numero1, double numero2) {

        if (numero1 == 0 || numero2 == 0) {

            mult = 0;

        } else {

            mult = numero1 * numero2;
        }

        return mult;
    }

    public double dividir(double numero1, double numero2) {

        if (numero1 == 0 || numero2 == 0) {

            div = 0;

        } else {

            div = numero1 / numero2;
        }

        return div;
    }

}
