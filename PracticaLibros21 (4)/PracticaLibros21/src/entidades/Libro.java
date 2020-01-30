/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Karla Abad
 */
public abstract  class Libro {
    protected String isbn; //codigo del libro
    protected String titulo;
    protected double precio;
     protected int numeroPaginas;
   
    protected Autor autorPrincipal;

    public Libro(){}
    
    public Libro(String isbn, String titulo, int numeroPaginas, double precio, Autor autorPrincipal) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.numeroPaginas = numeroPaginas;
        this.precio = precio;
        this.autorPrincipal = autorPrincipal;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setAnioPublicacion(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Autor getAutorPrincipal() {
        return autorPrincipal;
    }

    public void setAutorPrincipal(Autor autorPrincipal) {
        this.autorPrincipal = autorPrincipal;
    }

    @Override
    public String toString() {
        return this.isbn + ";" + this.titulo + ";" + this.numeroPaginas + ";" + this.precio + ";" 
                + this.autorPrincipal ;
    }
   //metodo abstracto 
    public abstract double calcularPrecio();
   
}
