/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.controlador;

import com.udec.modelo.Carro;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Leidy Torres
 */
@ManagedBean(name="vista")
@SessionScoped
public class Vista {
    
    /**
     * Variable que maneja la lista de carros
     */
    private List<Carro> listaCarro = new ArrayList();

    public Vista() {
    }
    
    /**
     * Metodo que inserta un carro en la lista
     * @param carro 
     */
    public void insertar(Carro carro){
        listaCarro.add(carro);
    }
    
    /**
     * Metodo que retorna la lista
     * @return 
     */
    public List<Carro> getListaCarro() {
        return listaCarro;
    }

    /**
     * Metodo que modifica la lista
     * @param listaCarro 
     */
    public void setListaCarro(List<Carro> listaCarro) {
        this.listaCarro = listaCarro;
    }
    
    
    
}
