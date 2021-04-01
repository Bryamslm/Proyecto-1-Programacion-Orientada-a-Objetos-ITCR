
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bryam y Luz
 */
public class Usuarios implements Serializable{
    
    private String nombre;
    private int edad;
    private String sexo;
    private double peso;
    private double estatura;
    private String usuario;
    private String contrasena;
    
    Usuarios(String nombre, int edad, String sexo, double peso, double estatura, String usuario, String contrasena){
        
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=sexo;
        this.peso=peso;
        this.estatura=estatura;
        this.usuario=usuario;
        this.contrasena=contrasena;
        
    }
    public String getUsuario(){
        return this.usuario;
    }
    public String getContra(){
        return this.contrasena;
    }
    
    
}
