package edu.ups.pap.factoryMethod;

public class LecturaTabulacion implements LecturaLinea{

    @Override
    public Lectura leer(String linea) {
        String[] partes=linea.split("\t");// El split divide al string y ve el tabulador 
        return new Lectura(partes[0],Double.parseDouble((partes[1])),partes[2]);



       
    }
    
}
