package operaciones;

import entidades.Autor;
import java.util.HashSet;

public class OperacionesAutor implements IOperacionesAutor{
     HashSet<Autor> lista ;

    public OperacionesAutor() {
        this.lista = new HashSet();
    }
   
    public HashSet<Autor> getLista() {
        return lista;
    }

    public void setLista(HashSet<Autor> lista) {
        this.lista = lista;
    }

    @Override
    public void agregar(Autor autor) {
        this.lista.add(autor);
    }

    @Override
    public void guardarEnArchivo(Autor autor) {   
    }

    @Override
    public HashSet<Autor> leerDeArchivo(String criterioBusqueda) {
          return this.lista;
    }
    
}
