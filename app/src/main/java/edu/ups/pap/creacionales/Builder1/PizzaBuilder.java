package edu.ups.pap.creacionales.Builder1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * ObjetoBilder
 * PizzaBuilder acumula las opciones de una pizza
 * y creara el producto(Objeto(pizza)) cuando se le pida al metodo contruir
 * al metodo contruir(build)
 */

public final class PizzaBuilder {

    private  String size;
    private   Set<String> ingredientes;//Orden de la lista pa matenerse
    
    
    public PizzaBuilder() {
        this.size= "Mediana";
        this.ingredientes= new HashSet<>();
        this.ingredientes.add("queso");
    }
    //OPC 1
    public PizzaBuilder setSize(String size){
        this.size= size;
        return this;

    }
    // OPC2 //Metodos acumuladores
    public PizzaBuilder addIngrediente(String ingrediente){

        this.ingredientes.add(ingrediente);
        return this; //Devuelve siempre la misma instancia del mismo Builder para agregar mas cosas en el metodo y creaer un producto
    }

    //Metodo Build
    //Me devuelve el producto
    public Pizza build(){
        return new Pizza(size, "Queso" + ingredientes.toString());

        //Builder(Nombre) es el valor por defecto  ---> Contructor de
    }
}
