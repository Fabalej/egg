/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_7.entidades;

/**
 *  Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
 * sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún
 * otro atributo, puede hacerlo. Los métodos que se implementarán son:
 * • Un constructor por defecto.
 * • Un constructor con todos los atributos como parámetro.
 * • Métodos getters y setters de cada atributo.
 */
public class Persona {
    
    private String nombre;
    private int edad;
    private String sexo;
    private Double peso;
    private Double altura;
    private Double imc;
    
    public Persona() {
        
    }

    public Persona(String nombre, int edad, String sexo, Double peso, Double altura, Double imc) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.imc = imc;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
    
    public void setImc(Double imc) {
        this.imc = imc;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public Double getPeso() {
        return peso;
    }

    public Double getAltura() {
        return altura;
    }
    
    public Double getImc() {
        return imc;
    }
    
    
}
