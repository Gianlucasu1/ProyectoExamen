/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java4read.modelo;

import java.util.List;

/**
 *
 * @author gianlucasorem
 */
public class PreguntaMultiple extends Pregunta {
    String[] respuestas;
    Boolean [] solucion;
    int numero;
    
    public PreguntaMultiple(int porcentaje, String enunciado,String[] respuestas,Boolean[] solucion) {
        super(porcentaje, enunciado);
        this.respuestas=respuestas;
        this.solucion=solucion;
        int x=0;
    }
    
}
