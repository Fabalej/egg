/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_9.servicios;

import ejercicio_9.utilidades.Matematica;

/**
Realizar una clase llamada Matemática que tenga como atributos dos números reales
con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
un constructor vacío, parametrizado y get y set. En el main se creará el objeto y se
usará el Math.random para generar los dos números y se guardaran en el objeto con
su respectivos set. Deberá además implementar los siguientes métodos:
• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
valor
• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
public class ServiciosMatematica {
    
    Matematica m1 = new Matematica();
    
    public void mostrarNumeros(Matematica m1) {
        
        System.out.println("El primer número es " + m1.getNumero1());
        System.out.println("El segundo número es " + m1.getNumero2());
        
    }
    
    public void devolverMayor(Matematica m1) {
        
        System.out.println("El mayor de los dos números es " + Math.max(m1.getNumero1(), m1.getNumero2()));
    }
    
    public void calcularPotencia(Matematica m1) {
        
        Long numero3 = Math.round(m1.getNumero1());
        Long numero4 = Math.round(m1.getNumero2());
        Long mayorNum = Math.max(numero3, numero4);
        Long menorNum = Math.min(numero3, numero4);
        
        System.out.println("La potencia del mayor elevado al menor número es: " + Math.pow(mayorNum, menorNum));
    }
    
    public void calcularRaiz(Matematica m1) {
        
         Double valorNum1 = Math.abs(m1.getNumero1());
         Double valorNum2 = Math.abs(m1.getNumero2());
         Double menorRaiz = Math.min(m1.getNumero1(), m1.getNumero2());
         
         System.out.println("La raiz cuadrada del numero " + menorRaiz + " es: " + Math.sqrt(menorRaiz));
    }
}
