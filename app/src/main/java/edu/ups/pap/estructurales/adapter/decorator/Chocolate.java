package edu.ups.pap.estructurales.adapter.decorator;

public final class Chocolate implements  Bebida{

    protected final Bebida choco;

    public Chocolate(Bebida choco){
        this.choco=choco;
    }


    @Override
    public String descripcion() {
        return choco.descripcion() + " Con  chocolate";
       
    }

    @Override
    public double precio() {
       return choco.precio() + 0.75;
    }
    
}
