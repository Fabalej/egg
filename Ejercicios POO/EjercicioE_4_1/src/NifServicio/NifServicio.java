/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NifServicio;

import java.util.Scanner;
import utilidades.Nif;

/**
• Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
resultado del calculo.
• Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra
en mayúscula; por ejemplo: 00395469-F).
La letra correspondiente al dígito verificador se calculará a traves de un método que
funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir el
número de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe
buscar en un array (vector) de caracteres la posición que corresponda al resto de la
división para obtener la letra correspondiente. La tabla de caracteres es la siguiente:
 */
public class NifServicio {
    
    public Nif craeNif() {
        
        Scanner leer = new Scanner(System.in);
        
        Nif nn = new Nif();
        
        System.out.print("Ingrese el número del DNI: ");
        nn.setDni(leer.nextLong());
        
       int resto = (int) nn.getDni()%23;
        
        String vectorA[] = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        
        for (int i = 0; i < 24; i++) {
            if (i == resto) {
                nn.setNif(vectorA[i]);
            }
        }
                      
        return nn;
    }
    
    public void mostrarNif(Nif nn) {
        
        System.out.println("El NIF del DNI ingresado es " + nn.getDni() + "-" + nn.getNif());
        
    }
    
}
