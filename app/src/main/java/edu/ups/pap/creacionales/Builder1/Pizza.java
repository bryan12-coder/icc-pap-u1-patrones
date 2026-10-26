package edu.ups.pap.creacionales.Builder1;

import java.util.List;

/**
 * 
 * Pizza
 * representa una pizza ya configurada
 */

public final class Pizza { //El final dice que no va a ser modificable --> Es inmutable 
    private final String size;
    private final List<String> ingredientes; //Se inicializa en el constructor
    //Constructor
    protected  Pizza(String size, List<String> ingredientes) {
        this.size = size;
        this.ingredientes = ingredientes;
    }
    public String descripcion(){
        return "Pizza " + size +  "Con " + ingredientes;
    }

    


}
