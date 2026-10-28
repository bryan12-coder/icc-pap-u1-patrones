package edu.ups.pap.estructurales.adapter;

public class AdaptadorCargadorIna implements  Cargador{
    private final CargadorInalambrico cInalambrico;

    public AdaptadorCargadorIna(CargadorInalambrico cInalambrico){
        this.cInalambrico=cInalambrico;
    }

    @Override
    public void cargarCelular() {
        //Validaciones 
        //Try catch
        //Control de excepciones
        cInalambrico.cargarBase();
        
    }

    
}
