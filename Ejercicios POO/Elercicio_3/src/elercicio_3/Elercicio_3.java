/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elercicio_3;


import Ejercicio_3.entidades.Operacion;
import Ejercicio_3.servicios.ServiciosOperacion;
import java.util.Scanner;

/**
 * Crear una clase llamada Operacion que tenga como atributos privados numero1 y
 * numero2. A continuación, se deben crear los siguientes métodos: 
 * a) Método constructor con todos los atributos pasados por parámetro. 
 * b) Metodo constructor sin los atributos pasados por parámetro. 
 * c) Métodos get y set. 
 * d) Método para crearOperacion(): que le pide al usuario los dos números y los
 * guarda en los atributos del objeto. 
 * e) Método sumar(): calcular la suma de los números y devolver el resultado al main. 
 * f) Método restar(): calcular la resta de los números y devolver el resultado al main 
 * g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a
 * multiplicar por cero, el método devuelve 0 y se le informa al usuario el
 * error. Si no, se hace la multiplicación y se devuelve el resultado al main 
 * h) Método dividir(): primero valida que no se haga una división por cero, si
 * fuera a pasar una división por cero, el método devuelve 0 y se le informa al
 * usuario el error se le informa al usuario. Si no, se hace la división y se
 * devuelve el resultado al main.
 *
 */
public class Elercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int opcion;

        ServiciosOperacion so = new ServiciosOperacion();

        Operacion op = so.crearOperacion();

        System.out.println("1 - Suma");
        System.out.println("2 - Resta");
        System.out.println("3 - Multiplicación");
        System.out.println("4 - División");
        System.out.println("5 - Salir");
        System.out.println("Ingrese la operacion a realizar: ");
        opcion = leer.nextInt();

        switch  (opcion) {
            
            case 1:
                so.suma(op);
                System.out.println("La suma es = " + so.suma(op));
                break;
                
            case 2:
                so.resta(op);
                System.out.println("La resta es = " + so.resta(op));
                break;
                
            case 3:
                so.multiplicar(op);
                if (so.multiplicar(op) == 0) {
                    System.out.println("Uno de los números ingresado fue el 0!!!");
                } else {
                    System.out.println("La multiplicación es = " + so.multiplicar(op));
                }
                
                break;
                
            case 4:
                so.dividir(op);
                if (so.dividir(op) == 0) {
                    System.out.println("Uno de los números ingresado fue el 0!!!");
                } else {
                    System.out.println("La división es = " + so.dividir(op));
                            
                }
                
                break;
                
            case 5:
                break;
            
        }
    }

}
