/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_6;

import Ejercicio_5.entidades.Cafetera;
import Ejercicio_5.servicios.ServiciosCafetera;
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
public class Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        ServiciosCafetera cn = new ServiciosCafetera();
        
         Cafetera ca = cn.llenarCafetera();
        
        int opcion;

        do {
          
            System.out.println("");
            System.out.println("1 - Servir Tazar");
            System.out.println("2 - Vaciar Cafetera");
            System.out.println("3 - Agregar Cafe");
            System.out.println("4 - Salir");
            System.out.print("Ingrese la operacion a realizar: ");
            opcion = leer.nextInt();

            switch (opcion) {

               case 1:
                    cn.sevirTaza(ca);
                    break;

                case 2:
                    cn.vaciarCafetera(ca);
                    break;

                case 3:
                    cn.agregarCafe(ca);
                    break;

                case 4:
                    opcion = 5;
                    break;

            }
            
        } while (opcion <= 4);
        
        
    }
    
}
