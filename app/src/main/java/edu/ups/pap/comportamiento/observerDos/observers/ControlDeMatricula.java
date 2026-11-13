package edu.ups.pap.comportamiento.observerDos.observers;

import java.util.function.Consumer;

import edu.ups.pap.comportamiento.observerDos.CambioEstudiante;
import edu.ups.pap.comportamiento.observerDos.Matricula;

public class ControlDeMatricula implements Consumer<CambioEstudiante> {

    @Override
    public void accept(CambioEstudiante t) {
        if(!t.atributo().equals("estado")){
            return;
        }
        Matricula anterior=(Matricula)t.old();
            Matricula nuevo=(Matricula)t.nuevo();
       

        if(anterior.equals(Matricula.ACTIVO) && nuevo.equals(Matricula.SUSPENDIDO)){
            System.out.println("[Matricula] El estudante ha sido suspendido: "+ t.est());
        }else if(anterior.equals(Matricula.SUSPENDIDO) && nuevo.equals(Matricula.ACTIVO)){
            System.out.println("[Matricula] El estudiante ha sido reactivado: " + t.est());
        }else if(nuevo.equals(Matricula.REPROBADO)){
            System.out.println("[Matricula] El estudiante ha sido reprobado: " + t.est());
        }
        
    }
    
}
