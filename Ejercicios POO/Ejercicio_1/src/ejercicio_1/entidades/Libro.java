/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_1.entidades;

/**
 * Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
 * Autor, Número de páginas, y un constructor con todos los atributos pasados por
 * parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
 * datos al usuario y luego informar mediante otro método el número de ISBN, el título,
 * el autor del libro y el numero de páginas.
 * 
 */
public class Libro {
    
    private String isbn;
    private String titulo;
    private String autor;
    private int num_pagina;
    
    public Libro() {
        
    }

    public Libro(String isbn, String titulo, String autor, int num_pagina) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.num_pagina = num_pagina;
    }
    
    public void setIsbn(String isbn) {
        this.isbn = isbn;

    }
        
    public void setTitulo(String titulo) {
        this.titulo = titulo;

    }
        
    public void setAutor(String autor) {
        this.autor = autor;

    }
        
    public void setNum_pagina(int num_pagina) {
        this.num_pagina = num_pagina;

    }
    
    public String getIsbn() {
        return isbn;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public int getNum_pagina() {
        return num_pagina;
    }
    
    
    
}
