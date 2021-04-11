
import java.io.Serializable;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bryam
 */
public class Ejercicio implements Serializable{
    
    private String nombre;
    private int repeticiones;
    private int segundos;
    
    Ejercicio(String nombre, int repeticiones, int segundos){
        this.nombre=nombre;
        this.repeticiones=repeticiones;
        this.segundos=segundos;
    }

   
   String getNombre(){
       return nombre;
   }
   int getRepeticiones(){
       return repeticiones;
   }
   int getSegundos(){
       return segundos;
   }
    
}
