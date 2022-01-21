/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_8.servicios;

import ejercicio_8.entidades.Cadena;
import java.util.Scanner;

/**
 * Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String) y su longitud. 
 * En el main se creará el objeto y se le pedirá al usuario que ingrese una frase que puede ser una palabra 
 * o varias palabras separadas por un espacio en blanco y a través de los métodos set, se guardará la frase y 
 * la longitud de manera automática según la longitud de la frase ingresada. Deberá además implementar 
 * los siguientes métodos: 
 
 */
public class ServiciosCadena {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void ingresarCadena(Cadena c1) {
        
        System.out.println("Ingrese una frase");
        c1.setFrase(leer.next());
        c1.setLongCadena(c1.getFrase().length());
                
    }
    
    //Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada. 
    
    public void contarVocales(Cadena c1) {
        
        String frase1 = c1.getFrase();
        int cont=0;
        for (int i = 0; i < c1.getFrase().length(); i++) {
           
           String caracter = frase1.substring(i, i+1);
                       
            if (caracter.equalsIgnoreCase("a") || caracter.equalsIgnoreCase("e") || caracter.equalsIgnoreCase("i")
                    || caracter.equalsIgnoreCase("o") || caracter.equalsIgnoreCase("u")) {
                
                cont++;
            }
        }
        
        System.out.println("La cantidad de vocales de la frase es = " + cont);
        System.out.println("");
    }
    
// • Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. 
//   Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac". 
    
    public void invertirFrase(Cadena c1) {
        
        int frase2 = c1.getFrase().length();
        
        for (int i = frase2; i > 0; i--) {
            
            String caracter2 = c1.getFrase().substring(i-1, i);
            
            System.out.print(caracter2);
            
        }
        
    }
    
// • Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar cuántas 
//   veces se repite el carácter en la frase, por ejemplo: 
//   Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces. 
    
    public void vecesRepetida(Cadena c1) {
        
        System.out.println("");
        System.out.print("Ingrese un caracter a buscar: ");
        String caracter3 = leer.next();
        String frase3 = c1.getFrase();
        int cont1=0;
        
        for (int i = 0; i < c1.getFrase().length(); i++) {
           
           String caracter4 = frase3.substring(i, i+1);
                       
            if (caracter3.equals(caracter4)) {
                
                cont1++;
            }
        }
        
        System.out.println("El caracter " + caracter3 + " se repite " + cont1 + " veces.");
        System.out.println("");
    }
    
// • Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase 
//   con otra nueva frase ingresada por el usuario. 
    
    public void compLong(Cadena c1) {
        
        System.out.println("");
        System.out.println("Ingrese una cadena para comparar sus longitudes: ");
        String frase4 = leer.next();
        
        if (c1.getFrase().length() == frase4.length()) {
            System.out.println("Las cadenas tienen el mismo largo!");
        } else {
            System.out.println("Las cadenas NO tienen el mismo largo!");
        }
     
    }

// • Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase 
//   ingresada por el usuario y mostrar la frase resultante. 
    
    public void unirFrases(Cadena c1) {
        
        System.out.println("");
        System.out.println("Ingrese una frase a unir con la existente:");
        String frase5 = leer.next();
        System.out.println(c1.getFrase().concat(frase5));
        
    }
    
// • Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y 
//   devuelve verdadero si la contiene y falso si no.
    
    public void contienLetra(Cadena c1) {
        
        System.out.println("");
        System.out.print("Ingrese el caracter a buscar: ");
        String caracter7 = leer.next();
        
        System.out.println("El resultado de la busqueda es: " + c1.getFrase().contains(caracter7));
        
    }
    
// • Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, 
//   por algún otro carácter seleccionado por el usuario y mostrar la frase resultante. 
    
    public void reemplazaCarac(Cadena c1) {
        
        System.out.println("");
        System.out.print("Ingrese el caracter por el cual se reemplazara la letra ´a´: ");
        String caracter5 = leer.next();
        
         for (int i = 0; i < c1.getFrase().length(); i++) {
           
           String caracter6 = c1.getFrase().substring(i, i+1);
                       
            if (caracter6.equals("a")) {
                
                caracter6 = caracter5;
            }
            System.out.print(caracter6);
        }
    }
        
         public void reemplazaCarac1(Cadena c1) {
        
        System.out.println("");
        System.out.print("Ingrese el caracter por el cual se reemplazara la letra ´a´: ");
        String caracter8 = leer.next();
        
        String frase5 = c1.getFrase().replace("a", caracter8);
         
             System.out.println(frase5);
        }
        
                
    }
    

    
    
    

