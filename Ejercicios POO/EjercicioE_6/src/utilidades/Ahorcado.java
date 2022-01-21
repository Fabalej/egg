/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

/**
 Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener
como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y
la cantidad jugadas máximas que puede realizar el usuario. Definir los siguientes
métodos con los parámetros que sean necesarios.
• Constructores, tanto el vacío como el parametrizado.

 */
public class Ahorcado {
    
    private String palabra;
    private String letraIng;
    private int longPalabra;
    private int jugMax;
    private int cantLetrasEnc;
    private int intentos;
    private String vector[];

    public Ahorcado() {
    }

    public Ahorcado(String palabra, String letraIng, int longPalabra, int jugMax, int cantLetrasEnc, int intentos) {
        this.palabra = palabra;
        this.letraIng = letraIng;
        this.longPalabra = longPalabra;
        this.jugMax = jugMax;
        this.cantLetrasEnc = cantLetrasEnc;
        this.intentos = intentos;
    }

    

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public void setLetraIng(String letraIng) {
        this.letraIng = letraIng;
    }

    public void setLongPalabra(int longPalabra) {
        this.longPalabra = longPalabra;
    }

    public void setJugMax(int jugMax) {
        this.jugMax = jugMax;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }
    
    public void setCantLetrasEnc(int cantLetrasEnc) {
        this.cantLetrasEnc = cantLetrasEnc;
    }

    public void setVector(String[] vector) {
        this.vector = vector;
    }
    
    public String getPalabra() {
        return palabra;
    }

    public String getLetraIng() {
        return letraIng;
    }

    public int getLongPalabra() {
        return longPalabra;
    }

    public int getJugMax() {
        return jugMax;
    }

    public int getCantLetrasEnc() {
        return cantLetrasEnc;
    }

    public int getIntentos() {
        return intentos;
    }

    public String[] getVector() {
        return vector;
    }
    
    
    
    
    
    
}
