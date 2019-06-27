/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladorestudiante;

import modeloestudiante.PreguntaE;
import modeloestudiante.PreguntaMultipleE;
import modeloestudiante.Prueba;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author gianlucasorem
 */
public class ExamenControladorE {
    
   private static ExamenControladorE instance;

    private ExamenControladorE() {
       // prueba = ArchivoControlador.getInstance().cargarPrueba();
    }

    public static ExamenControladorE getInstance() {
        if (instance == null) {
            instance = new ExamenControladorE();
        }
        return instance;
    }
    
    

    private List<PreguntaE> preguntas;
    private String descripcion1;
    private int porcentaje1=0;
    Prueba prueba= new Prueba(preguntas);
    

    public List<PreguntaE> getContactos() {
        return preguntas;
        
    }

    /*public Contacto getContacto(int posicion) {
        return contactos.get(posicion);
    }*/

    
    // Metodo cuando agregamos una pregunta tipo abierta, metemos la pregunta en el arreglo de preguntas
   
    
    
    
    

   /* public void guardarPruebaArchivo() {
        
        
        prueba.setPreguntas(preguntas);
        ArchivoControlador.getInstance().guardarPrueba(prueba);
        
    }*/

    
    
    public Prueba guardarPruebaDesdeArchivo(){
        
    
    prueba=ArchivoControladorE.getInstance().cargarPrueba();
    preguntas=prueba.getPreguntas();
    descripcion1=prueba.getDescripcion();
    return prueba;
    
    }
    
    
   
}
