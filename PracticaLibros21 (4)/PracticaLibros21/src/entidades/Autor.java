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
public class Autor {
    private String nombres;
    private String apellidos;
    private String paisOrigen;

    public Autor() {
    }

    public Autor(String nombres, String apellidos, String paisOrigen) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.paisOrigen = paisOrigen;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    @Override
    public String toString() {
        return this.nombres+";"+this.apellidos+";"+this.paisOrigen;
    }
}
