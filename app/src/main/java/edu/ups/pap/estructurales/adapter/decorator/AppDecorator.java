package edu.ups.pap.estructurales.adapter.decorator;

/**
 * 
 * Decorator:agraga leche a una bebida encolviendo otra bebida
 */

public class AppDecorator {

    public static void main(String[] args) {
        // Bebida  --> Cafe simple
        Bebida bebida = new CafeSimple();// Bebida  --> Cafe simple
        //System.out.println(bebida.descripcion() + "$ " + bebida.precio());
        Bebida bebida2= new Leche(bebida);
        Bebida bebida3= new Chocolate(bebida);
        Bebida bebida4 = new Leche(bebida3);
        Bebida bebida5= new Chocolate(bebida2);
        Bebida bebida7= new Chocolate(bebida3);
        Bebida bebida6= new Leche(bebida7);
        System.out.println(bebida.descripcion() + "$ " + bebida.precio());
        System.out.println(bebida2.descripcion()+ "$ " + bebida2.precio());
        System.out.println(bebida3.descripcion() + "$ " + bebida3.precio());
        System.out.println(bebida4.descripcion()+ "$" + bebida4.precio());
        System.out.println(bebida5.descripcion()+ "$" + bebida5.precio());
        System.out.println(bebida6.descripcion()+ "$" + bebida6.precio());
        
    }
    
}
