/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioe_5;

import java.util.Scanner;

/**
 * Crea una clase en Java donde declares una variable de tipo array de Strings
 * que contenga los doce meses del año, en minúsculas. A continuación, declara
 * una variable mesSecreto de tipo String, y hazla igual a un elemento del array
 * (por ejemplo, mesSecreto = mes[9]. El programa debe pedir al usuario que
 * adivine el mes secreto. Si el usuario acierta mostrar un mensaje, y si no lo
 * hace, pedir que vuelva a intentar adivinar el mes secreto. Un ejemplo de
 * ejecución del programa podría ser este: Adivine el mes secreto. Introduzca el
 * nombre del mes en minúsculas: febrero No ha acertado. Intente adivinarlo
 * introduciendo otro mes: agosto ¡Ha acertado!
 */
public class EjercicioE_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        String meses[] = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "setiembre", "octubre", "noviembre", "diciembre"};
        String mesSecreto = meses[4];

        System.out.println("Adivine el mes secreto!!!");
        System.out.println("Ingrese un mes del año en minúscula, tienes 5 intentos: ");
        String mes = leer.nextLine();

        int intentos = 0;

        do {

            if (mesSecreto.equals(mes)) {
                System.out.println("FELICITACIONES!!! Adivinaste el mes secreto");
                intentos = 5;
            } else {
                System.out.println("Intentalo nuevamente!");
                System.out.println("Ingrese un mes del año en minúscula, tienes " + (4-intentos) + " intentos: ");
                mes = leer.nextLine();
                 intentos++;
            }

        } while (intentos <= 3);
        
        if (intentos == 4) {
            
            System.out.println("Prueba nuevamete y tendras suerte!!!");
            
        }

    }

}


