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
    

        Cargador c1= new DecoradorRegistro(cargador1);
        Cargador c2= new DecoradorSeguridad(cargador2, true);
        Cargador c3= new DecoradorSeguridad(cargador1, false);
        Cargador c4= new DecoradorSeguridad(new DecoradorRegistro(c2), true);
        //Cargador c5 = new DecoradorRegistro(c3);
        //Cargador c4 = new DecoradorSeguridad(c2,true);
        System.out.println("Caso 1 ");
        c1.cargarCelular();
        System.out.println();
        System.out.println("Caso 2");
        c2.cargarCelular();
        System.out.println();
        System.out.println("Caso 3");
        c3.cargarCelular();
        System.out.println();
        System.out.println("Caso 4");
        c4.cargarCelular();

        //cARGAR EL CELULAR
        //cargador1.cargarCelular();
        //cargador2.cargarCelular();

         //cARGAR EL CELULAR sin el patron
         //Si el cargador es antiguo 
         //cAntiguo.cargarConector();
        // cInalambrico.cargarBase();
            
    

    }
    
}
