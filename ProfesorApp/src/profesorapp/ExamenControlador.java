/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profesorapp;

import com.java4read.modelo.Pregunta;
import com.java4read.modelo.PreguntaMultiple;
import com.java4read.modelo.Prueba;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author gianlucasorem
 */
public class ExamenControlador {
    
   private static ExamenControlador instance;

    private ExamenControlador() {
       // prueba = ArchivoControlador.getInstance().cargarPrueba();
    }

    public static ExamenControlador getInstance() {
        if (instance == null) {
            instance = new ExamenControlador();
        }
        return instance;
    }

    private List<Pregunta> preguntas;
    private String descripcion1;
    private int porcentaje1=0;
    Prueba prueba= new Prueba(preguntas);
    

    public List<Pregunta> getContactos() {
        return preguntas;
        
    }

    /*public Contacto getContacto(int posicion) {
        return contactos.get(posicion);
    }*/

    
    // Metodo cuando agregamos una pregunta tipo abierta, metemos la pregunta en el arreglo de preguntas
    public void agregarPregunta( String enunciado, int porcentaje) {
        
        
        if (preguntas == null) {
            preguntas = new ArrayList<>();
        }

        Pregunta pregunta = new Pregunta(porcentaje, enunciado);
        
        
        preguntas.add(pregunta);
        porcentaje1=porcentaje+porcentaje1; 
        if(porcentaje1==100)
        this.ImprimirPorcentaje(porcentaje1);
    }
    
    public void agregarPreguntaMultiple( String enunciado, int porcentaje, String[] respuestas, Boolean[] solucion ) {
        if (preguntas == null) {
            preguntas = new ArrayList<>();
        }
        PreguntaMultiple pregunta1 = new PreguntaMultiple(porcentaje, enunciado, respuestas, solucion);      
        preguntas.add(pregunta1);
        porcentaje1=porcentaje+porcentaje1;
        if (porcentaje1==100)
            this.ImprimirPorcentaje(porcentaje1);
        }
    
    public void agregarDescripcion(String descripcion){
        descripcion1=descripcion;
    
    prueba.setDescripcion(descripcion1);
    
    
    }

    public void guardarPruebaArchivo() {
        
        
        prueba.setPreguntas(preguntas);
        ArchivoControlador.getInstance().guardarPrueba(prueba);
        
    }

    public void ImprimirPorcentaje(int porcentaje1){
    
        JOptionPane.showMessageDialog(null, "El porcentaje ya es="+porcentaje1+" proceda a subir el examen", "Mensaje", JOptionPane.PLAIN_MESSAGE);
    }
    
    
   
}
