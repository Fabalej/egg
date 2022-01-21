/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_10;

import java.util.Arrays;

/**
 * Realizar un programa en Java donde se creen dos arreglos: el primero será un
 * arreglo A de 50 números reales, y el segundo B, un arreglo de 20 números,
 * también reales. El programa deberá inicializar el arreglo A con números
 * aleatorios y mostrarlo por pantalla. Luego, el arreglo A se debe ordenar de
 * menor a mayor y copiar los primeros 10 números ordenados al arreglo B de 20
 * elementos, y rellenar los 10 últimos elementos con el valor 0.5. Mostrar los
 * dos arreglos resultantes: el ordenado de 50 elementos y el combinado de 20.
 */
public class Ejercicio_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Declaracion de los 2 arreglos pedidos
        
        Double vectorA[] = new Double[50];
        Double vectorB[] = new Double[20];
        
        //A continuacion relleno el vectorA con 50 numeros aleatorios, y lo hago de la siguiente forma para que me imprima 5
        //linea con 10 numeros cada una (en la impresion estan redondeados para que no se haga muy larga la impresion.
        int k = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                vectorA[k] = (Math.random() * 10);
                System.out.print("| " + Math.round(vectorA[k]) + " |");
                k++;
            }
            System.out.println("");
        }

        //Ordeno el vectorA de menor a mayor
        Arrays.sort(vectorA);

        //Copio los primeros 10 numeros del vectorA al vectorB
        //vectorB = Arrays.copyOf(vectorA, 10);
        
        //Para que funcione tengo que llenar el vectorB, si no tira un error
        vectorB = Arrays.copyOf(vectorA, 20);

        //Relleno el vectorB del indice 10 al 19
        Arrays.fill(vectorB, 10, 20, 0.5);
        
//Esto fue otra forma de llenar el vectorB desde el indice 10 al 19
//        int p = 10;
//        for (int n = 0; n < 10; n++) {
//            vectorB[p] = 0.5;
//            p++;
//        }

        //System.out.println("Vector A: " + Arrays.toString(vectorA));
        //System.out.println("Vector B: " + Arrays.toString(vectorB));
        
        System.out.println("---------------------------------------------------------------"); //Imprimo el vectorA
        int m = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("| " + Math.round(vectorA[m]) + " |");
                m++;
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("----------------------------------------------------------------"); //Imprimo el vectorB
        
        int o = 0;
        for (int i = 0; i < 10; i++) {
                System.out.print("| " + Math.round(vectorB[o]) + " |");
                o++;
            }
        System.out.println("");
        for (int i = 0; i < 10; i++) {
                System.out.print("| " + vectorB[o] + " |");
                o++;
            }
            
            
        System.out.println("");

        //System.arraycopy(vectorA, 0, vectorB, 0, 10);
    }

    }

