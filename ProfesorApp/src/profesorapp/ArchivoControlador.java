/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profesorapp;

import com.java4read.modelo.Pregunta;
import com.java4read.modelo.Prueba;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gianlucasorem
 */
public class ArchivoControlador {

    private static ArchivoControlador instance;

    private ArchivoControlador() {
    }

    public static ArchivoControlador getInstance() {
        if (instance == null) {
            instance = new ArchivoControlador();
        }
        return instance;
    }
    
    
    // revisar este metodo para adjuntar cargar prueba, necesario para los demas metodos del profesor
    

    
    
   /* public void guardarPrueba(List<Pregunta> preguntas) {
        try (ObjectOutputStream ois = new ObjectOutputStream(new FileOutputStream("prueba1.cad"))) {
            for (Pregunta pregunta : preguntas) {
                ois.writeObject(preguntas);
            }
        } catch (Exception ex) {
            System.err.println("Error al escribir archivo: " + ex);
        }
    }
   */

   public void guardarPrueba(Prueba prueba) {
        
        
        try (ObjectOutputStream ois = new ObjectOutputStream(new FileOutputStream("prueba2.cad"))) {
            
                ois.writeObject(prueba);
            
        } catch (Exception ex) {
            System.err.println("Error al escribir archivo: " + ex);
        }
    }
    
}

