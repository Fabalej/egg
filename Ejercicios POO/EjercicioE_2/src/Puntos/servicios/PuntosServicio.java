/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Puntos.servicios;

import ejercicioe_2.utilidades.Puntos;
import java.util.Scanner;

/**
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa
en los atributos del objeto. Después, a través de otro método calcular y devolver la
distancia que existe entre los dos puntos que existen en la clase Puntos. Para conocer
como calcular la distancia entre dos puntos consulte el siguiente link:
 */
public class PuntosServicio {
    
    public Puntos crearPuntos () {
        
        Scanner leer = new Scanner(System.in);
        
        Puntos pn = new Puntos();
        
        System.out.print("Ingrese el punto X1: ");
        pn.setX1(leer.nextDouble());
        
        System.out.print("Ingrese el punto Y1: ");
        pn.setY1(leer.nextDouble());
        
        System.out.print("Ingrese el punto X2: ");
        pn.setX2(leer.nextDouble());
        
        System.out.print("Ingrese el punto Y2: ");
        pn.setY2(leer.nextDouble());
        
        return pn;
    }
    
    public Double calculoDistancia(Puntos pn) {
        
        Double distancia;
        
        distancia = Math.sqrt(Math.pow((pn.getX2()-pn.getX1()), 2) + Math.pow((pn.getY2()-pn.getY1()), 2));
        
        return distancia;
    }
    
}
