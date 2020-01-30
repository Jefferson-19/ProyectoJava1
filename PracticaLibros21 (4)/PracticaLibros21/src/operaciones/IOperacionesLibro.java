/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import entidades.Libro;
import java.util.ArrayList;

/**
 *
 * @author Karla Abad
 */
public interface IOperacionesLibro {
    String RUTAARCHIVOLIBROS="archivos/libros.txt";
    
   void agregar(Libro libro);
    void guardarEnArchivo(Libro libro);
    ArrayList<Libro> leerDeArchivo(String criterioBusqueda);
    
}
