/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public abstract class Automovil {
    public String nombreOP;
    public String placa;
    public double valor;
    
    public void establecerNombrePropietario(String nombre){
        nombreOP = nombre;
    }
    
    public void establecerPlaca(String pla){
        placa = pla;
    }
    
    public  abstract void calcularValor();
    
    public String obtenerNombrePropietario(){
        return nombreOP;
    }
    
    public String obtenerPlaca(){
        return placa;
    }
    
    public double obtenerValor(){
        return valor;    
    }  
}
