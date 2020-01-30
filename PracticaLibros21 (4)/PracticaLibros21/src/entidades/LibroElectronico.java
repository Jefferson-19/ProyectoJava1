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
public class LibroElectronico extends Libro {

    private double tamanioArchivo;
    private boolean esInteractivo;

    public LibroElectronico(double tamanioArchivo, boolean esInteractivo, String isbn, String titulo, int numeroPaginas, double precio, Autor autorPrincipal) {
        super(isbn, titulo, numeroPaginas, precio, autorPrincipal);
        this.tamanioArchivo = tamanioArchivo;
        this.esInteractivo = esInteractivo;
    }

    @Override
    public String toString() {
        // el 1 nos indica el tipo de libro, en este caso libro Electronico
        return "2;" + super.toString() + this.tamanioArchivo + ";" + this.esInteractivo;
    }

    @Override
    public double calcularPrecio() {
        if (this.tamanioArchivo > 10) {
            super.precio = 20;
        } else {
            super.precio = 10;
        }

        if (this.esInteractivo) {
            super.precio += 5;
        }
        return super.precio;
    }

}
