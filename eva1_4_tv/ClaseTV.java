/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_4_tv;

/**
 *
 * @author eduar
 */
public class ClaseTV {
    private int volumen;
    private int canal;
    private boolean poder;
    //constrcutores
    public ClaseTV (){//constructor default
       volumen = 2;
       canal = 0;
       poder = false;//apagado
    }
    //métodos para operar la TV (interfaz)
    //encender y apagar la TV
    public void cambiarEstadoPoder (){
        //verificar el estado de la Tv
        if(poder == true){
            poder = false;
            System.out.println("Apagando Pantalla");
        }else{
            poder = true;
            System.out.println("Encendiendo Pantalla");
        }
    }
    //volumen
    public void subirVolumen (){
        if(poder == true){//la tv está prendida
            //no debe pasar de 100
            if(volumen < 100){
        volumen = volumen + 1;//acumulador
        //volumen++;
        //volumen+=1;
        System.out.println("Volumen: " + volumen);
            }
        }
    }
     public void bajarVolumen (){
         if(poder == true){
             if(volumen > 0){
        volumen = volumen - 1;
        //volumen++;
        //volumen+=1;
        System.out.println("Volumen: " + volumen);
             }
         }
    }
     public void subirCanal (){
         if (poder == true){
             canal = canal + 1;
             if (canal > 100){
                 canal = 0;
                 System.out.println("Canal: " + canal);
                 
             }
         }
     }
     public void bajarCanal (){
         if(poder == true){
             canal = canal - 1;
             if(canal < 0){
                 canal = 100;
                  System.out.println("Canal: " + canal);
                 
             }
         }
         
     }
}
