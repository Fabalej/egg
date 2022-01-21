/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_1.servicios;

import ejercicio_1.entidades.Libro;
import java.util.Scanner;

/**
 * Crear una clase llamada Libro que contenga los siguientes atributos: ISBN,
 * Título, Autor, Número de páginas, y un constructor con todos los atributos
 * pasados por parámetro y un constructor vacío. Crear un método para cargar un
 * libro pidiendo los datos al usuario y luego informar mediante otro método el
 * número de ISBN, el título, el autor del libro y el numero de páginas.
 *
 */
public class ServicioLibro {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Libro crearLibro() {
        
        Libro nl = new Libro();
        
        System.out.print("Ingrese el ISBN del libro: ");
         nl.setIsbn(leer.next());
        
        System.out.print("Ingrese el título del libro: ");
        nl.setTitulo(leer.next());
        
        System.out.print("Ingrese el autor del libro: ");
        nl.setAutor(leer.next());
        
        System.out.print("Ingrese el número de páginas del libro: ");
       nl.setNum_pagina(leer.nextInt());
        
        //Libro l1 = new Libro(isbn, titulo, autor, num_pagina); Esto se ree,plaza por la linea inferior
        
        return nl;
                  
    }
    
    public void mostrarLibro(Libro nl) {
        System.out.println("El ISBN del libro es: " + nl.getIsbn());
        System.out.println("El titulo del libro es: " + nl.getTitulo());
        System.out.println("El autor del libro es: " + nl.getAutor());
        System.out.println("El libro tiene: " + nl.getNum_pagina() + " paginas");
        
        
    }

   

    
}
