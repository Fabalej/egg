/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicion_11;

import java.util.Date;
import java.util.Scanner;

/**
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con
la clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la
clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le
pedirán al usuario para poner el constructor del objeto Date. Una vez creada la fecha
de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la
fecha actual, que se puede conseguir instanciando un objeto Date con constructor
vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
Si necesiten acá tienen más información en clase Date: Documentacion Oracle
*/
public class Ejercicion_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
         Date fechaActual = new Date();
        
        System.out.print("Ingrese un día: ");
        int dia = leer.nextInt();
        
        System.out.print("Ingrese un mes: ");
        int mes = leer.nextInt();
        
        System.out.print("Ingrese un año: ");
        int anio = leer.nextInt();
        
        Date fecha = new Date(anio-1900, mes-1, dia);
        
        System.out.println("La fecha actual es: " + fecha);
        System.out.println("La fecha actual es: " + fecha.toString());
        System.out.println("");
        int diferencia = fechaActual.getYear() - fecha.getYear();
        System.out.println("La diferencia entre las fechas es de: " + diferencia + " años.");
        System.out.println("");
        System.out.println("La fecha actual es: " + fechaActual);
        System.out.println("");
        System.out.println("La fecha actual esta antes de la fecha ingresada? " + fechaActual.before(fecha));
        System.out.println("");
        System.out.println("La fecha actual esta despues de la fecha ingresada? " + fechaActual.after(fecha));
        
    }
    
}
