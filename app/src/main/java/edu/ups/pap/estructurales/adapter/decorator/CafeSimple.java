package edu.ups.pap.estructurales.adapter.decorator;

public class CafeSimple implements Bebida{

    @Override
    public String descripcion() {
        return "Un Cafecito simple";
    }

    @Override
    public double precio() {
        return 2.00;
    }

	
}
