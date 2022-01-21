/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_7.servicios;

import ejercicio_7.entidades.Persona;
import java.util.Scanner;

/**
 * • Metodo crearPersona(): el método crear persona, le pide los valores de
 *   los atributos al usuario y después se le asignan a sus respectivos atributos
 *   para llenar el objeto Persona. Además, comprueba que el sexo introducido sea
 *   correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje
 */
public class ServiciosPersona {

    public Persona crearPersona() {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Persona p1 = new Persona();
        
        String sexoPer;

        System.out.print("Ingrese el nombre de la persona: ");
        p1.setNombre(leer.next());

        System.out.print("Ingrese la edad: ");
        p1.setEdad(leer.nextInt());

        System.out.print("Ingrese el sexo (H/M/O): ");
        
        do {
           sexoPer = leer.next();
            if (sexoPer.equalsIgnoreCase("H") || sexoPer.equalsIgnoreCase("M") || sexoPer.equalsIgnoreCase("O")) {
                 p1.setSexo(sexoPer);
            } else {
                System.out.println("Ingreso incorrecto, ingrese H/M/O");
            }
        } while (!sexoPer.equalsIgnoreCase("H") && !sexoPer.equalsIgnoreCase("M") && !sexoPer.equalsIgnoreCase("O")
                && !sexoPer.equals("") && !sexoPer.equals(" "));

        System.out.print("Ingrese el peso en Kg.: ");
        p1.setPeso(leer.nextDouble());

        System.out.print("Ingrese la altura en Mts.: ");
        p1.setAltura(leer.nextDouble());

        return p1;
    }


// • Método calcularIMC(): calculara si la persona está en su peso ideal (peso
//   en kg/(altura^2 en mt)). Si esta fórmula da por resultado un valor menor que
//   20, significa que la persona está por debajo de su peso ideal y la función
//   devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25
//   (incluidos), significa que la persona está en su peso ideal y la función
//   devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor
//   que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.
    
    public int calcularImc(Persona p1) {
        
        int indice;
        
        p1.setImc(p1.getPeso() / Math.pow(p1.getAltura(), 2));
        
        if (p1.getImc() < 20) {
            indice = -1;
        } else if (p1.getImc() >= 20 && p1.getImc() <= 25){
            indice = 0;
        } else {
            indice = 1;
        }
        
        return indice;
    }
    

//  • Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
//    devuelve un booleano.

    public Boolean mayorEdad(Persona p1) {
        
        Boolean mayorEdad;
        
        if (p1.getEdad() > 18) {
            mayorEdad = true;
        } else {
            mayorEdad = false;
        }
        
        return mayorEdad;
    }
    
}
