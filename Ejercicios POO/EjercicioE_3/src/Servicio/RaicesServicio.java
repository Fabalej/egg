/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Utilidades.Raices;
import java.util.Scanner;

/**
Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b
y c. Hay que insertar estos 3 valores para construir el objeto a través de un método
constructor. Luego, las operaciones que se podrán realizar son las siguientes:
*/
public class RaicesServicio {
    
    Scanner leer = new Scanner(System.in);
    
    public Raices ingresarDatos() {
        
        Raices nr = new Raices();
                
        System.out.println("Calculo de ecuación de 2° grado!");
        System.out.print("Ingrese el valor de ´a´: ");
        nr.setA(leer.nextDouble());
        
        System.out.print("Ingrese el valor de ´b´: ");
        nr.setB(leer.nextDouble());
        
        System.out.print("Ingrese el valor de ´c´: ");
        nr.setC(leer.nextDouble());
        
        return nr;
    }
    
// Método getDiscriminante(): devuelve el valor del discriminante (double). El
// discriminante tiene la siguiente formula: (b^2)-4*a*c
    
    public Double getDiscriminante(Raices nr) {
        
        Double discriminante = (Math.pow(nr.getB(), 2)) - 4 * nr.getA() * nr.getC();
        
        return discriminante;
    }
    
// Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
// que esto ocurra, el discriminante debe ser mayor o igual que 0.
    
    Boolean tieneRaices;
    
    public Boolean tieneRaices(Double discriminante) {
        
        if (discriminante > 0) {
            
            tieneRaices = true;
            
        } else {
            
            tieneRaices = false;
            
        }
        
        return tieneRaices;
    }
    
// Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución,
// para que esto ocurra, el discriminante debe ser igual que 0.
    
    Boolean tieneRaiz;
    
    public Boolean tieneRaiz(Double discriminante) {
        
        if (discriminante == 0) {
            
            tieneRaiz = true;
            
        } else {
            
            tieneRaiz = false;
            
        }
        
        return tieneRaiz;
    }
    
// Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
// posibles soluciones (-b±√((b^2)-(4*a*c)))/(2*a)
    
    Double x1;
    Double x2;
    Double x3;
            
    public void obtenerRaices(Raices nr, Boolean tieneRaices) {
        
      if (tieneRaices == true) {
            
             x1 = (-nr.getB() + Math.sqrt((Math.pow(nr.getB(), 2) - (4 * nr.getA() * nr.getC())))) / (2 * nr.getA());
             x2 = (-nr.getB() - Math.sqrt((Math.pow(nr.getB(), 2) - (4 * nr.getA() * nr.getC())))) / (2 * nr.getA());
                                    
        } 
     
      }
    
// Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
// Es en el caso en que se tenga una única solución posible.
    
    public void obtenerRaiz(Raices nr, Boolean tieneRaiz) {
        
      if (tieneRaiz == true) {
            
            x3 = (-nr.getB() + Math.sqrt((Math.pow(nr.getB(), 2) - (4 * nr.getA() * nr.getC())))) / (2 * nr.getA());
                                                
        } 
      }
        
// Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
// pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
// obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en
// caso de no existir solución, se mostrará un mensaje.
// Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo
// delante de -b
    
    public void calcularRaizces(Raices nr, Boolean tieneRaices, Boolean tieneRaiz) {
        
        if (tieneRaices == true) {
            System.out.println("La ecuación tiene 2 resultados!!");
            System.out.println("Los resultados de la ecuación son: " + x1 + " / " + x2);
        } else if (tieneRaiz == true) {
            System.out.println("La ecuación tiene 1 resultado!!");
            System.out.println("El resultado de la ecuación es: " + x3);
        } else {
            System.out.println("La ecuación tiene como resultado numeros imaginarios!!!");
        }
        
    }
    

    
}
