package edu.ups.pap.estructurales.adapter.decorator;

/**
 * 
 * Leche es Mi decorador que envuleve a una bebida
 * Bebida -> General puede ser cualquuiera como un cafe
 * un expreson, chocolate etc.
 */

public final class Leche implements Bebida {

    protected final Bebida bebida;

    public Leche(Bebida bebida){
        this.bebida= bebida;
    }

    @Override
    public String descripcion() {
        return bebida.descripcion() + " Con leche ";
       
    }

    @Override
    public double precio() {
        return bebida.precio() + 0.5;
    }

    
}
