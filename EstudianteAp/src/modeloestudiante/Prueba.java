/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloestudiante;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gianlucasorem
 */
public class Prueba implements Serializable{
    
    private String descripcion;
    
    private List <PreguntaE> preguntas;
   

    public Prueba(List<PreguntaE> preguntas) {
        
        this.preguntas=preguntas;
        
    }

    public void setPreguntas(List<PreguntaE> preguntas) {
        this.preguntas = preguntas;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
        
    }

    public List<PreguntaE> getPreguntas() {
        return preguntas;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    
    
}
