package edu.ups.pap.factoryMethod;
//Mantiene el proceso de importancion y delega la creacion

import java.util.ArrayList;
import java.util.List;

public abstract class Importador {

    // Factory Method
    protected abstract LecturaLinea crearLector();

    public final List<Lectura> importacion(List<String> lecturas) {

        LecturaLinea lector = crearLector();//Polimorfica
        //impC-> ImportadorPuntoComa-> LectorPuntoComa

        List<Lectura> resultado = new ArrayList<>();

        for (String lectura : lecturas) {
 
            if (lectura.isBlank()) {
                continue;
            }

            try {
                resultado.add(lector.leer(lectura));

            } catch (Exception e) {
                throw new IllegalArgumentException("LINEA MAL FORMADA", e);
            }
        }

        return resultado;
    }
}
