/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 * @author Johand Esteban Castro Rodriguez
 * @version 10.7 Version Final bien chevere
 */
public class Departamento {
    private int id;
    private String nombre;
    
    /**
     *Constructor vacio por defecto de la clase
     */
    public Departamento() {
    }

    /**
     *
     * @param id
     * @param nombre
     */
    public Departamento(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     *
     * @return
     */
    public String getDepartamento(){
        return id + "," + nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    

}
