/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import paquete02.Automovil;

/**
 *
 * @author reroes
 */
public class AutomovilGasolina extends Automovil {

    public double numeroGalo;
    public double costoGalo;
    public double iva = 10;

    public void establecerNumeroGalo(double ng) {
        numeroGalo = ng;
    }

    public void establecerCostoGalo(double cg) {
        costoGalo = cg;
    }

    public void establecerIva(double i) {
        iva = i;
    }

    @Override
    public void calcularValor() {
        valor = (costoGalo * numeroGalo) * numeroGalo + (iva / 100) * costoGalo * numeroGalo;
    }

    public double obtenerNumeroGalo() {
        return numeroGalo;
    }

    public double obtenerCostoGalo() {
        return costoGalo;
    }

    public double obtenerIva() {
        return iva;
    }

    @Override
    public String toString() {
        String cadena2;
        cadena2 = String.format("Nombre del Propietario: %s\n "
                + "Placa del Automovil: %s\n"
                + "Numero Galones: %s\n" 
                + "Costo Galon: %s\n"
                + "Iva: %s\n"
                +  "Valor Total" 
                , obtenerNombrePropietario()
                , obtenerPlaca()
                , obtenerNumeroGalo()
                , obtenerCostoGalo()
                , obtenerIva()
                , obtenerValor());
        return cadena2;
    }
}
