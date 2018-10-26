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
public class Juntada {
    double pozo;
    double integrantes;
    double cadaunodebeponer;
    ListaEnlazadaGenerica<Persona> lis= new ListaEnlazadaGenerica<Persona>();
    
    
    
    public Juntada(){}

    public ListaEnlazadaGenerica<Persona> getLis() {
        return lis;
    }
    
    
    
    public double agragarIntegrante(String unNombre, double loquepuso){
    Persona unaPersona = new Persona(unNombre,loquepuso);
    
    lis.agregarFinal(unaPersona);
    return (pozo+loquepuso);
    }
    
    
   
    public void calcular(){
    cadaunodebeponer = pozo/lis.tamanio();
    
    
    lis.comenzar();
    Persona P= lis.proximo();
    
    if(P.getLoquepuso()>0){// Si puso algo
    
        if(P.debe(cadaunodebeponer)){  //Si puso pero sigue debiendo
            P.setDebe(cadaunodebeponer - P.getLoquepuso());   
        }
        else
            P.setLedeben(P.getLoquepuso() - cadaunodebeponer);
    
    }
    else
        P.setDebe(cadaunodebeponer);
    
   // lisdebe.agregarFinal(P);
    }
}
