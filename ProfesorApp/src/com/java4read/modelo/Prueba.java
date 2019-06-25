/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java4read.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gianlucasorem
 */
public class Prueba implements Serializable{
    
    private String descripcion;
    
    private List <Pregunta> preguntas;
   

    public Prueba(List<Pregunta> preguntas) {
        
        this.preguntas=preguntas;
        
    }

    public void setPreguntas(List<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
        int x=0;
    }
    
    
    
}
