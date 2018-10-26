/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queraton;


import tp02.ejercicio2.*;
/**
 *
 * @author DRAGON Z
 */
public class Persona {

    
    private String nombre;
    private double loquepuso;
    private double debe;
    private double ledeben;

    public Persona(String nombre, double loquepuso) {
        this.nombre = nombre;
        this.loquepuso = loquepuso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getLoquepuso() {
        return loquepuso;
    }

    public void setLoquepuso(double loquepuso) {
        this.loquepuso = loquepuso;
    }

    public double getDebe() {
        return debe;
    }

    public void setDebe(double debe) {
        this.debe = debe;
    }

    public double getLedeben() {
        return ledeben;
    }

    public void setLedeben(double ledeben) {
        this.ledeben = ledeben;
    }
    

    
    public boolean debe(double cadaunodebeponer){
    return(loquepuso <cadaunodebeponer);
    }    
    
    
    
}
