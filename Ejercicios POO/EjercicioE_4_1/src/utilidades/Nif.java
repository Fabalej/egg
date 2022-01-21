/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

/**
Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su
correspondiente letra (NIF). Los atributos serán el número de DNI (entero largo) y la
letra (String o char) que le corresponde. Dispondrá de los siguientes métodos:
Métodos getters y setters para el número de DNI y la letra.
 */
public class Nif {
    
    private long dni;
    private String nif;

    public Nif() {
    }

    public Nif(long dni, String nif) {
        this.dni = dni;
        this.nif = nif;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public long getDni() {
        return dni;
    }

    public String getNif() {
        return nif;
    }
    
    
    
}
