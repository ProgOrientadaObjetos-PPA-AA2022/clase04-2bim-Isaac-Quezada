/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;
import paquete02.Automovil;
/**
 *
 * @author reroes
 */
public class AutomovilDiesel extends Automovil {
    
    public double LitrosMaximo;
    public double costoLitro;
    public double descuentoLitros = 10;
    
    public void establecerLitrosMaximos(double lm) {
        LitrosMaximo = lm;
    }
    public void establecercostolitro(double cl) {
        costoLitro = cl;
    }
    public void establecerdescuentoLitros(double dl) {
       descuentoLitros = dl;
    }
    
    @Override
    public void calcularValor() {
        valor = ;
    }
    
}
