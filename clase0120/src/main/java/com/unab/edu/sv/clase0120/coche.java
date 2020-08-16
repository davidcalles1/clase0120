/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.sv.clase0120;

/**
 *
 * @author nelson
 */
public class coche {
    private String marca;
    private int año;
    private String color;
    private int npuertas;
    
    public coche(String pmarca,int paño,String Pcolor){
     marca = pmarca;
     año = paño;
     color = Pcolor;
     
     
        
    }
     public coche(String pmarca,int paño,String Pcolor,int pnpuertas){
     marca = pmarca;
     año = paño;
     color = Pcolor;
     npuertas = pnpuertas;
     
     
        
    }

    @Override
    public String toString() {
        return "coche{" + "marca=" + marca + ", a\u00f1o=" + año + ", color=" + color + ", npuertas=" + npuertas + '}';
    }

    
    

    
}
