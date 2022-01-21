/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_4.servicios;

import ejercicio_4.entidades.Rectangulo;
import java.util.Scanner;

/**
 * Crear una clase Rectángulo que modele rectángulos por medio de un atributo
 * privado base y un atributo privado altura. La clase incluirá un método para
 * crear el rectángulo con los datos del Rectángulo dados por el usuario.
 * También incluirá un método para calcular la superficie del rectángulo y un
 * método para calcular el perímetro del rectángulo. Por último, tendremos un
 * método que dibujará el rectángulo mediante asteriscos usando la base y la
 * altura. Se deberán además definir los métodos getters, setters y
 * constructores correspondientes. Superficie = base * altura / Perímetro =
 * (base + altura) * 2.
 */
public class ServiciosRectangulo {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Rectangulo crearRectangulo() {

        System.out.print("Ingrese el valor de la base: ");
        double base = leer.nextDouble();

        System.out.print("Ingrese el valor de la altura; ");
        double altura = leer.nextDouble();

        return new Rectangulo(base, altura);
    }

    public void Area(Rectangulo rt) {

        double sup = rt.getBase() * rt.getAltura();

        System.out.println("La superficie del rectangulo es = " + sup);

    }

    public void Perimetro(Rectangulo rt) {

        double perim = (rt.getBase() + rt.getAltura()) * 2;

        System.out.println("La superficie del rectangulo es = " + perim);

        
    }

    public void Dibuja(Rectangulo rt) {

        System.out.println("El dibujo del rectangulo es el siguiente:");
        System.out.println("");
        int i;
        int j;
        int k;

        for (i = 0; i < rt.getAltura(); i++) {
            for (j = 0; j < rt.getBase(); j++) {
                if (i == 0 || i == rt.getBase() - 1) {
                    System.out.print(" *");
                }
                if (i > 0 && i < rt.getBase() - 1 && j == 1) {
                    System.out.print(" *");
                }
                if (i > 0 && i < rt.getBase() - 1 && j > 0 && j < rt.getBase() - 1) {

                    System.out.print("   ");

                }

                if (i > 0 && i < rt.getBase() - 1 && j == rt.getBase() - 1) {
                    System.out.print(" *");
                }
            }
            System.out.println(" ");
        }
    }
}
