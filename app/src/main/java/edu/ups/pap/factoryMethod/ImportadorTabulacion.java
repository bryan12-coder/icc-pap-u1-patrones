package edu.ups.pap.factoryMethod;



public class ImportadorTabulacion extends Importador{

    @Override
    protected LecturaLinea crearLector() {
        return new LecturaTabulacion();
    }

   
   
    
}
