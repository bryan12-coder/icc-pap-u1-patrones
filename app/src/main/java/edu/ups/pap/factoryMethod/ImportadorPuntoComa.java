package edu.ups.pap.factoryMethod;

public class ImportadorPuntoComa extends Importador{

    @Override
    protected LecturaLinea crearLector() { //Instyancia de lectura linea de instancia de lector punto y coma 
       return new LectorPuntoComa();
    }

   
    
}
