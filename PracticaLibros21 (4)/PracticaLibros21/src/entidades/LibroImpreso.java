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
public class LibroImpreso extends Libro{
    public static final double PRECIOIMPRESIONXPAGINA=0.01;
    private String tipoPasta;

    public LibroImpreso() {
        //super() //lamada implicita 
    }

    public LibroImpreso(int numeroPaginas, String tipoPasta, String isbn, String titulo, int anioPublicacion, double precio, Autor autorPrincipal) {
        super(isbn, titulo, numeroPaginas, precio, autorPrincipal);
        this.tipoPasta = tipoPasta;
    }

    public String getTipoPasta() {
        return tipoPasta;
    }

    public void setTipoPasta(String tipoPasta) {
        this.tipoPasta = tipoPasta;
    }

    @Override
    public String toString() {
        // el 1 nos indica el tipo de libro, en este caso libroImpreso
        return "1;"+super.toString() + ";" + this.tipoPasta;
    }

    @Override
    public double calcularPrecio() {
        super.precio = super.numeroPaginas * LibroImpreso.PRECIOIMPRESIONXPAGINA;
        return super.precio;             
    }
}
