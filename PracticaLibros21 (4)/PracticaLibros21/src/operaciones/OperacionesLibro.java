/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import entidades.Libro;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Karla Abad
 */
public class OperacionesLibro implements IOperacionesLibro {

    ArrayList<Libro> lista;

    public OperacionesLibro() {
        this.lista = new ArrayList();
    }

    public ArrayList<Libro> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Libro> lista) {
        this.lista = lista;
    }

    @Override
    public void agregar(Libro libro) {
        this.lista.add(libro);
    }

    @Override
    public void guardarEnArchivo(Libro libro) {
        //escribir en archivo
        //1. declarar las variables
        File file = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            //2. crear los objetos para escritura
            file = new File(RUTAARCHIVOLIBROS);
            if (!file.exists()) {
                file.createNewFile();
            }
            fw = new FileWriter(file, true);// true
            // para agregar y no sobreescribir
            bw = new BufferedWriter(fw);
            if (file.length() > 0) {//no esta vacio
                bw.newLine();//salto de linea
            }
            //3. escribir
            bw.write(libro.toString());
            bw.flush();
            //liberar recursos (cerrar los streams)

            
        } catch (IOException io) {
            System.out.println("Error en guardar libro");
            System.out.println(io.getMessage());
        }

    }

    @Override
    public ArrayList<Libro> leerDeArchivo(String criterioBusqueda) {
        return this.lista;
    }

}
