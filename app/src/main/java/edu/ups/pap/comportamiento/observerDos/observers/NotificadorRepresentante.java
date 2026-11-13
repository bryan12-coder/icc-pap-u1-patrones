package edu.ups.pap.comportamiento.observerDos.observers;

import java.util.function.Consumer;

import edu.ups.pap.comportamiento.observerDos.CambioEstudiante;
import edu.ups.pap.comportamiento.observerDos.Matricula;

public class NotificadorRepresentante implements Consumer<CambioEstudiante> {

    @Override
    public void accept(CambioEstudiante t) {
        if (t.atributo().equals("promedio")) {

            double anterior = (Double) t.old();
            double nuevo = (Double) t.nuevo();

            if (anterior >= 6.0 && nuevo < 6.0) {
                System.out.println("[Representante] Promedio bajo: " + t.est());
            }

        } else if (t.atributo().equals("asistencias")) {

            int anterior = (Integer) t.old();
            int nuevo = (Integer) t.nuevo();

            if (anterior < 8 && nuevo >= 8) {
                System.out.println("[Representante] Exceso de inasistencias: " + t.est());
            }

        } else if (t.atributo().equals("estado")) {

            Matricula anterior=(Matricula)t.old();
            Matricula nuevo=(Matricula)t.nuevo();

            if (anterior != Matricula.SUSPENDIDO
                    && nuevo !=Matricula.SUSPENDIDO) {
                System.out.println("[Representante] Estudiante suspendido: " + t.est());
            }
        }
    }
    
    
}
