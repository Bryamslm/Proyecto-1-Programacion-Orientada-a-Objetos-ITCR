
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
public class Rutina implements Serializable{
    
    private LinkedList<Ejercicio>rutina;
    private String nombre;
    
    Rutina(String nombre){
        rutina=new LinkedList<Ejercicio>();
        this.nombre=nombre;
    }
    public void agregarEjercicio(String nombre, int repeticiones, int segundos){
        
        Ejercicio ejercicio= new Ejercicio(nombre, repeticiones, segundos);
        rutina.add(ejercicio);
    }
    
    String getNombreRutina(){
        return this.nombre;
    }
    
    int getCantidadEnLista(){
        return this.rutina.size();
    }
    
    
    
}
