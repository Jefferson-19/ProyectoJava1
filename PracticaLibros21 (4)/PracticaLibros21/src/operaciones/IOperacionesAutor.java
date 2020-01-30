/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import entidades.Autor;
import java.util.HashSet;

/**
 *
 * @author Karla Abad
 */
public interface IOperacionesAutor {
    void agregar(Autor autor);
      void guardarEnArchivo(Autor autor);
      HashSet<Autor> leerDeArchivo(String criterioBusqueda);
}
