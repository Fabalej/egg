/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_7;

import ejercicio_7.entidades.Persona;
import ejercicio_7.servicios.ServiciosPersona;

/**
 * Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
 * sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún
 * otro atributo, puede hacerlo. Los métodos que se implementarán son:
 * • Un constructor por defecto.
 * • Un constructor con todos los atributos como parámetro.
 * • Métodos getters y setters de cada atributo.
 * • Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
 *   al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
 *   Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
 *   O. Si no es correcto se deberá mostrar un mensaje
 * • Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
 *   kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
 *   que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
 *   fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
 *   está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
 *   fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
 *   función devuelve un 1.
 * • Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
 * 
 * A continuación, en la clase main hacer lo siguiente:
 * Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
 * los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
 * tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
 * persona es mayor de edad.
 * Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
 * en distintas variables, para después en el main, calcular un porcentaje de esas 4
 * personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
 * encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
 * cuantos menores.
 */
public class Ejercicio_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        ServiciosPersona pp1 = new ServiciosPersona();
        Persona pn1 = pp1.crearPersona();
        
        int mayorEdad=0;
        int menorEdad=0;
        int bajoPeso=0;
        int pesoIdeal=0;
        int sobrePeso=0;
        
        switch (pp1.calcularImc(pn1)) {
            case -1:
                System.out.println("Esta por debajo de su peso ideal!");
                pn1.getImc();
                bajoPeso++;
                break;
            case 0:
                System.out.println("Esta en su peso ideal!");
                pn1.getImc();
                pesoIdeal++;
                break;
            default:
                System.out.println("Uds tiene sibrepeso!");
                pn1.getImc();
                sobrePeso++;
                break;
        }
        
        if (pp1.mayorEdad(pn1) == true) {
            System.out.println("Es mayor de edad!");
            mayorEdad++;
        } else {
            System.out.println("Es menor de edad!");
            menorEdad++;
        }
        
        ServiciosPersona pp2 = new ServiciosPersona();
        Persona pn2 = pp2.crearPersona();
        
        switch (pp2.calcularImc(pn2)) {
            case -1:
                System.out.println("Esta por debajo de su peso ideal!");
                pn2.getImc();
                bajoPeso++;
                break;
            case 0:
                System.out.println("Esta en su peso ideal!");
                pn2.getImc();
                pesoIdeal++;
                break;
            default:
                System.out.println("Uds tiene sibrepeso!");
                pn2.getImc();
                sobrePeso++;
                break;
        }
        
        if (pp2.mayorEdad(pn2) == true) {
            System.out.println("Es mayor de edad!");
            mayorEdad++;
        } else {
            System.out.println("Es menor de edad!");
            menorEdad++;
        }
        
        ServiciosPersona pp3 = new ServiciosPersona();
        Persona pn3 = pp3.crearPersona();
        
        switch (pp3.calcularImc(pn3)) {
            case -1:
                System.out.println("Esta por debajo de su peso ideal!");
                pn3.getImc();
                bajoPeso++;
                break;
            case 0:
                System.out.println("Esta en su peso ideal!");
                pn3.getImc();
                pesoIdeal++;
                break;
            default:
                System.out.println("Uds tiene sibrepeso!");
                pn3.getImc();
                sobrePeso++;
                break;
        }
        
        if (pp3.mayorEdad(pn3) == true) {
            System.out.println("Es mayor de edad!");
            mayorEdad++;
        } else {
            System.out.println("Es menor de edad!");
            menorEdad++;
        }
        
        ServiciosPersona pp4 = new ServiciosPersona();
        Persona pn4 = pp4.crearPersona();
        
        switch (pp4.calcularImc(pn4)) {
            case -1:
                System.out.println("Esta por debajo de su peso ideal!");
                pn4.getImc();
                bajoPeso++;
                break;
            case 0:
                System.out.println("Esta en su peso ideal!");
                pn4.getImc();
                pesoIdeal++;
                break;
            default:
                System.out.println("Uds tiene sibrepeso!");
                pn4.getImc();
                sobrePeso++;
                break;
        }
        
        if (pp4.mayorEdad(pn4) == true) {
            System.out.println("Es mayor de edad!");
            mayorEdad++;
        } else {
            System.out.println("Es menor de edad!");
            menorEdad++;
        }
        
// Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
// en distintas variables, para después en el main, calcular un porcentaje de esas 4
// personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
// encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
// cuantos menores.
        
        System.out.println("");
        System.out.println("El promedio con bajo peso es de " + bajoPeso*100/4 + "%");
        System.out.println("El promedio con peso ideal es de " + pesoIdeal*100/4 + "%");
        System.out.println("El promedio con sobre peso es de " + sobrePeso*100/4 + "%");

        double promedioImc = (pn1.getImc() + pn2.getImc() + pn3.getImc() + pn4.getImc()) / 4;
        System.out.println("El promedio de IMC es : " + promedioImc);
        
        System.out.println("");
        System.out.println("El promedio de mayores de edad es de " + mayorEdad*100/4 + "%");
        System.out.println("El promedio de menores de edad es de " + menorEdad*100/4 + "%");
        
        
    }
    
}
