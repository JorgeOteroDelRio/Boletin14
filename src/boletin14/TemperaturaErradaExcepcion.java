/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin14;

/**
 *
 * @author Jota
 */
public class TemperaturaErradaExcepcion extends Exception{
    
    public TemperaturaErradaExcepcion(){
        super("No se permite una temperatura menor a 80 grados");
    }
    
    public TemperaturaErradaExcepcion(String mensaje){
        super(mensaje);
    }
}
