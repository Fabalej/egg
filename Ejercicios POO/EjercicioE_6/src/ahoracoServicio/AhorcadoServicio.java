/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahoracoServicio;

import java.util.Scanner;
import utilidades.Ahorcado;

/**
 * Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá
 * contener como atributos, un vector con la palabra a buscar, la cantidad de
 * letras encontradas y la cantidad jugadas máximas que puede realizar el
 * usuario. Definir los siguientes métodos con los parámetros que sean
 * necesarios: • Constructores, tanto el vacío como el parametrizado.
 */
public class AhorcadoServicio {

    Scanner leer = new Scanner(System.in);

//Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
//Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
//Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
//palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas,
//el valor que ingresó el usuario y encontradas en 0.
    public Ahorcado crearJuego() {

        Ahorcado nj = new Ahorcado();

        System.out.println("JUEGO DEL AHORCADO");
        System.out.println("");
        System.out.print("Ingrese la palabra con la cual jugará: ");
        nj.setPalabra(leer.nextLine());
        System.out.print("Inrese la cantidad de jugadas maximas: ");
        nj.setJugMax(leer.nextInt());
        
        nj.setLongPalabra(nj.getPalabra().length());
        System.out.println(nj.getLongPalabra());

        nj.setVector() = new String[nj.getLongPalabra()];

        for (int i = 0; i < nj.getLongPalabra(); i++) {

            vector[i] = nj.getPalabra().substring(i, i + 1);

        }

        nj.setCantLetrasEnc(0);

        return nj;
    }

//Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
//buscar como se usa el vector.length.
    public void longitudPalabra(Ahorcado nj) {

        System.out.println("La longitud de la palabra es de " + nj.getLongPalabra() + " caracteres!");

    }

//Método buscar(letra): este método recibe una letra dada por el usuario y busca si la
//letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
    public void buscarLetra(Ahorcado nj, String vector[]) {

            System.out.print("Ingrese una letra: ");
            nj.setLetraIng(leer.next());

            int letrasEnc = 0;
            int inten = 1;

            for (int i = 0; i < nj.getLongPalabra(); i++) {

                if (vector[i].equals(nj.getLetraIng())) {

                    System.out.println("La letra pertenece a la palabra");
                    letrasEnc++;
                    nj.setCantLetrasEnc(letrasEnc);
                }

            }
            inten++;
            nj.setIntentos(nj.getJugMax() - inten); 
                    
        }
        
    //Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
//cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
//devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
//busque una letra que no esté, se le restará uno a sus oportunidades.

    public void encontradas(Ahorcado nj) {

        System.out.println("Letras encontradas: " + nj.getCantLetrasEnc());
        int diferenciaLetras = nj.getLongPalabra() - nj.getCantLetrasEnc();
        System.out.println("Faltan " + diferenciaLetras);

    }
    
    //Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
    public void intentos(Ahorcado nj) {

        System.out.println("Quedan " + nj.getIntentos() + " intentos");

    }

//Método juego(): el método juego se encargará de llamar todos los métodos
//previamente mencionados e informará cuando el usuario descubra toda la palabra o
//se quede sin intentos. Este método se llamará en el main.
//    public void juego(Ahorcado nj, String vector[]) {
//        
//        crearJuego();
//        
//        longitudPalabra(nj);
//        
//        do {
//            
//            buscarLetra(nj, String vector[]);
//            encontradas(nj);
//            intentos(nj);
//            
//            
//        } while (nj.getIntentos() >= 0);
//    }
    
    }




