/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_5.servicios;

import Ejercicio_5.entidades.Cafetera;
import java.util.Scanner;

/**
 * Programa Nespresso. Desarrolle una clase Cafetera con los atributos
 * capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
 * cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
 * menos, los siguientes métodos:
 * • Constructor predeterminado o vacío
 * • Constructor con la capacidad máxima y la cantidad actual
 * • Métodos getters y setters.
 * • Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
 * • Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
 *   tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
 *   cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
 *   método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
 *   cuanto quedó la taza.
 * • Método vaciarCafetera(): pone la cantidad de café actual en cero.
 * • Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
 *   recibe y se añade a la cafetera la cantidad de café indicada.
 *
 */
public class ServiciosCafetera {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    

    public Cafetera llenarCafetera() {
        
        Cafetera c1 = new Cafetera();
        System.out.println("Llenar cafetera:");
        c1.setCantActual(c1.getCapMaxima());
        System.out.println("La cafetera se lleno con " + c1.getCapMaxima()/1000 + " Lts.");
        return c1;
    }

    public void sevirTaza(Cafetera c1) {

        System.out.print("Ingrese la capacidad en ml de la taza: ");
        int capac = leer.nextInt();

        if (c1.getCantActual() < capac) {

          
            System.out.println("La taza se llenara en un " + (c1.getCantActual() * 100 ) / capac + "%");
            System.out.println("Desea continuar? S/N: ");
            String deseo = leer.next();
            if (deseo.equalsIgnoreCase("s")) {
                c1.setCantActual(0);
            } 
            
        } else {

            System.out.println("Su taza se ha llenado!");
            c1.setCantActual(c1.getCantActual() - capac);
        }

    }

    public void vaciarCafetera(Cafetera c1) {

        c1.setCantActual(0);
        System.out.println("La cafetra se ha vaciado!");

    }

    public void agregarCafe(Cafetera c1) {

        System.out.println("La cantidad de cafe que queda es: " + c1.getCantActual() + "ml");
        System.out.print("¿Quiere agregar cafe? S/N: ");
        String resp = leer.next();
        int agregarN;

        if (resp.equalsIgnoreCase("s")) {
            System.out.print("Ingrese la cantidad de cafe necesaria en ml:");
            int agregar = leer.nextInt();

            if ((c1.getCantActual() + agregar) > 5000) {

                do {

                    System.out.println("La cantidad ingresada supera la capacidad de la cafetera!");
                    System.out.print("Ingrese una cantidad menor: ");
                    agregarN = leer.nextInt();
                    
                } while ((c1.getCantActual() +  agregarN) > c1.getCapMaxima());
                
                c1.setCantActual(c1.getCantActual() + agregarN);

            } else {
                c1.setCantActual(c1.getCantActual() + agregar);
                System.out.println("La cantidad de cafe es: " + c1.getCantActual());
            }
        }
    }
}
