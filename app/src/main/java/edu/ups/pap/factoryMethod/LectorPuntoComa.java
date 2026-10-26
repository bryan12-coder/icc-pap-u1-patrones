package edu.ups.pap.factoryMethod;

public class LectorPuntoComa implements LecturaLinea {

    @Override
    public Lectura leer(String linea) {
        String[]datos=linea.split(";");
        return new Lectura(datos[0],Double.parseDouble((datos[1])),datos[2]);

        //Dividir la linea por el separador ";"
        //devolver una Instancia de lectura;
    }
    
}
