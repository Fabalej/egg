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

    public Operacion crearOperacion() {

        System.out.print("Ingrese un número: ");
        double numero1 = leer.nextDouble();

        System.out.print("Ingrese otro número: ");
        double numero2 = leer.nextDouble();

        return new Operacion(numero1, numero2);
    }

    public double suma(Operacion op) {

        double suma = op.getNumero1() + op.getNumero2();

        return suma;
    }

    public double resta(Operacion op) {

        double resta = op.getNumero1() - op.getNumero2();

        return resta;
    }

    public double multiplicar(Operacion op) {
        
        double mult;

        if (op.getNumero1() == 0 || op.getNumero2() == 0) { 
            
            mult = 0;
            
        } else {
            
            mult = op.getNumero1() * op.getNumero2();
        }

            return mult;
        }
    
    

    public double dividir(Operacion op) {

        double div;

        if (op.getNumero1() == 0 || op.getNumero2() == 0) { 
            
            div = 0;
            
        } else {
            
           div = op.getNumero1() / op.getNumero2();
        }
       
        return div;
    }

}
