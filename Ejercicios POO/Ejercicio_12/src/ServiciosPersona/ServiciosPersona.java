/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiciosPersona;

import ejercicio_12.utilidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
  Implemente la clase Persona. Una persona tiene un nombre y una fecha de
  nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y
  set. Y los siguientes métodos: Nota: encontraras un ejemplo descargable de un
  Date como atributo en Moodle. 
  • Agregar un método de creación del objeto que
  respete la siguiente firma: crearPersona(). Este método rellena el objeto
  mediante un Scanner y le pregunta al usuario el nombre y la fecha de
  nacimiento de la persona a crear, recordemos que la fecha de nacimiento debe
  guardarse en un Date y los guarda en el objeto. 
  • Escribir un método
  calcularEdad() a partir de la fecha de nacimiento ingresada. Tener en cuenta
  que para conocer la edad de la persona también se debe conocer la fecha
  actual. 
  • Agregar a la clase el método menorQue(int edad) que recibe como
  parámetro otra edad y retorna true en caso de que el receptor tenga menor
  edad que la persona que se recibe como parámetro, o false en caso contrario.
  • Metodo mostrarPersona(): este método muestra la persona creada en el método
  anterior.
 */
public class ServiciosPersona {

    Scanner leer = new Scanner(System.in);

    Persona np = new Persona();

    Date fechaHoy = new Date();

    public void creaPersona(Persona np) {

        System.out.print("Ingrese el nombre de la persona: ");
        np.setNombre(leer.next());

        System.out.print("Ingrese un día: ");
        int dia = leer.nextInt();

        System.out.print("Ingrese un mes: ");
        int mes = leer.nextInt();

        System.out.print("Ingrese un año: ");
        int anio = leer.nextInt();

        np.setFechaNac(new Date(anio - 1900, mes - 1, dia));

    }

    public void calcularEdad(Persona np) {

        int diferencia = fechaHoy.getYear() - np.getFechaNac().getYear();
        System.out.println("La edad de la persona es de: " + diferencia + " años.");

    }

    public void menorQue(Persona np) {

        System.out.print("Ingrese la edad de otra persona: ");
        int edadNueva = leer.nextInt();

        int edadPer = fechaHoy.getYear() - np.getFechaNac().getYear();
        
        if (edadNueva < edadPer) {
            Boolean estado = true;
            System.out.println("La persona nueva es: " + estado);
        } else {
            Boolean estado = false;
            System.out.println("La persona nueva es menor? " + estado);
        }

    }
    
    public void mostrarPersona (Persona np) {
        
        System.out.println("El nombre de la persona es: " + np.getNombre());
        System.out.println("La fecha de nacimientos es: " + np.getFechaNac());
        
    }
}
