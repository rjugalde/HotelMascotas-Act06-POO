/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ronal
 */
public class FicherosBinarios {
    
    public FicherosBinarios(){
    }
    
    public void escribir(Object objeto,String nombreArchivo){
        File file;
        FileOutputStream fileOutputStream;
        ObjectOutputStream objectOutputStream;
        file = new File(nombreArchivo);
        try {
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            
            objectOutputStream.writeObject(objeto);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FicherosBinarios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FicherosBinarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Object leer(String nombreArchivo){
        File file;
        
        FileInputStream fileInputStream;
        ObjectInputStream objectInputStream;
        
        file = new File(nombreArchivo);
        try {
            fileInputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fileInputStream);
            
            Object data = objectInputStream.readObject();
            return data;
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FicherosBinarios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FicherosBinarios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FicherosBinarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
}
