/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloestudiante;

import java.io.Serializable;

/**
 *
 * @author gianlucasorem
 */
public class PreguntaE implements Serializable{
    
    private int numero;
    private int porcentaje;
    private String enunciado;

    public PreguntaE(int porcentaje, String enunciado) {
        
        
        this.porcentaje=porcentaje;
        this.enunciado=enunciado;
    }
    
    
    
    
    
}
