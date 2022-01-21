/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_2.servicios;

import ejercicio_2.entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author fabla
 */
public class ServicioCircunferencia {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Circunferencia crearCircunferencia() {
        
        System.out.print("Ingrese el radio de la circunferencia: ");
        
        double radio = leer.nextDouble();
        
        return new Circunferencia(radio);
    }
    
    public void Area(Circunferencia c2) {
        
        double area1 = Math.PI * Math.pow(c2.getRadio(), 2);
        
        System.out.println("El area es = " + area1);
               
    }
    
    public void Perimetro(Circunferencia c2) {
        
        double perimetro1 = 2 * c2.getRadio() * Math.PI;
        
        System.out.println("El perimetro es = " + perimetro1);
                
    }
   
}