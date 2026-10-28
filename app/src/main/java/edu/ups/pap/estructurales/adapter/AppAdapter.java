package edu.ups.pap.estructurales.adapter;
/**
 * 
 * AppAdapter: permite usar un ternometro Fahrenheit con una aplicacion que espera
 * Celsius
 */

public class AppAdapter {

    public static void main(String[] args){
        //cargar mi celular con un cargador
        //Pero ahora como tengo un ca debo cargar un Adaptador
        CargadorAntiguo cAntiguo= new CargadorAntiguo();
        Cargador cargador1= new AdaptadorCargador(cAntiguo);//Inyecte la dependencia
        CargadorInalambrico cInalambrico= new CargadorInalambrico();
        Cargador cargador2= new AdaptadorCargadorIna(cInalambrico);

        //cARGAR EL CELULAR
        cargador1.cargarCelular();
        cargador2.cargarCelular();

         //cARGAR EL CELULAR sin el patron
         //Si el cargador es antiguo 
         //cAntiguo.cargarConector();
        // cInalambrico.cargarBase();
            
    

    }
    
}
