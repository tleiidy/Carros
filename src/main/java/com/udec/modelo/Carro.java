/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.modelo;

/**
 *
 * @author angie
 */
public class Carro {
    
   /**
     * Variable que almacena el nombre
     */
    private String nombre;
    /**
     * Variable que almacena la marca
     */
    private String marca;
    /**
     * Variable que almacena el modelo
     */
    private int modelo;
    

    public Carro() {
    }

    /**
     * Constructor de la clase
     * @param nombre
     * @param marca
     * @param modelo 
     */
    public Carro(String nombre, String marca, int modelo) {
        this.nombre = nombre;
        this.marca = marca;
        this.modelo = modelo;
    }

    /**
     * Metodo que retorna el nombre
     * @return 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que modifica el nombre
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo que retorna la marca
     * @return 
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Metodo que modifica la marca
     * @param marca 
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Metodo que retorna el modelo
     * @return 
     */
    public int getModelo() {
        return modelo;
    }

    /**
     * Metodo que modifica el modelo
     * @param modelo 
     */
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    
    
}
