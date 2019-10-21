/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.controlador;

import com.udec.modelo.Carro;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Leidy Torres
 */
@ManagedBean(name="control")
@SessionScoped
public class Controlador {
   
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
    /**
     * Variable auxiliar
     */
    private int auxControl;
    
    private Carro carro = new Carro();
    
    @ManagedProperty("#{vista}")
    private Vista vista = new Vista();

    public Controlador() {
    }
    
    /**
     * Metodo que agrega el carro en la lista
     * @param car 
     */
    public void agregarCarro(Carro car){
        System.out.println("ENTRA");
        String nombre = car.getNombre();
        String marca = car.getMarca();
        int modelo = car.getModelo();
        
        Carro agregarC = new Carro(nombre, marca, modelo);
        agregarC.setNombre(nombre);
        agregarC.setMarca(marca);
        agregarC.setModelo(modelo);
                
        vista.insertar(agregarC);
        System.out.println(carro.getNombre());
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

    /**
     * Metodo que retorna el carro
     * @return 
     */
    public Carro getCarro() {
        return carro;
    }

    /**
     * Metodo que modifica el carro
     * @param carro 
     */
    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    /** 
     * Metodo que retorna la vista
     * @return 
     */
    public Vista getVista() {
        return vista;
    }

    /**
     * Metodo que modifica la vista
     * @param vista 
     */
    public void setVista(Vista vista) {
        this.vista = vista;
    }

    /**
     * Metodo que retorna la variable auxiliar
     * @return 
     */
    public int getAuxControl() {
        return auxControl;
    }

    /**
     * Metodo que modifica la variable auxiliar
     * @param auxControl 
     */
    public void setAuxControl(int auxControl) {
        this.auxControl = auxControl;
    }
    
}
