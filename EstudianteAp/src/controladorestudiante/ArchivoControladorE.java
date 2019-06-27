                            /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladorestudiante;

import modeloestudiante.PreguntaE;
import modeloestudiante.Prueba;
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
public class ArchivoControladorE {

    
    private static ArchivoControladorE instance;

    private ArchivoControladorE() {
    }

    public static ArchivoControladorE getInstance() {
        if (instance == null) {
            instance = new ArchivoControladorE();
        }
        return instance;
    }
    
    
    // revisar este metodo para adjuntar cargar prueba, necesario para los demas metodos del profesor
    

   /* public Prueba cargarPrueba() {
        Prueba prueba = null;
        
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Examen.cad"))) {
            
                Object readObject = ois.readObject();
                if (readObject != null && readObject instanceof Pregunta) {
                    prueba= ((Prueba) readObject);
                } 
            
        } catch (Exception ex) {
//            System.err.println("Error al leer archivo: " + ex);
        }

        return prueba;
    }/*
    
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

   
   
   public Prueba cargarPrueba() {
       List <PreguntaE> preg =new ArrayList<>();
        Prueba prueba1=new Prueba(preg);
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/gianlucasorem/NetBeansProjects/Ajedrez-version-pro-Gianluca/Proyecto2/ProyectoExamen/ProfesorApp/prueba.cad"))) {
            
                Object readObject = ois.readObject();
                if (readObject != null && readObject instanceof Prueba) {
                    prueba1=((Prueba)readObject);
                   
                
                }
        } catch (Exception ex) {
//            System.err.println("Error al leer archivo: " + ex);
        }
        System.out.println(""+prueba1.getDescripcion());
        return prueba1;
    }
   
   
    
}

