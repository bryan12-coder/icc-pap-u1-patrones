package edu.ups.pap.comportamiento.observerDos.observers;

import java.util.function.Consumer;

import edu.ups.pap.comportamiento.observerDos.CambioEstudiante;
import edu.ups.pap.comportamiento.observerDos.Matricula;

public class SeguimientoIntegral implements Consumer<CambioEstudiante> {

    @Override
    public void accept(CambioEstudiante t) {
        if(!t.atributo().equals("asistencias") && !t.atributo().equals("promedio") && !t.atributo().equals("estado")){
            return;
            
        }
        boolean riesgoAnteorio=false;
        if(t.atributo().equals("asistencias")){
            
            int anterior=(Integer)t.old();
            int nuevo=(Integer)t.nuevo();
            riesgoAnteorio=t.est().getPromedio()<7.0 && anterior>= 6 && t.est().getEstado()==Matricula.ACTIVO;

            boolean riesgoNuevo=t.est().getPromedio()<7.0 && nuevo>=6 && t.est().getEstado()==Matricula.ACTIVO;
            if(!riesgoAnteorio && riesgoNuevo){
                System.out.println("[Integral] estudiante en riesgo : " + t.est());
            }
        }else if(t.atributo().equals("promedio")){
            double anterior=(Double)t.old();
            double nuevo=(Double)t.nuevo();

            boolean riesgoAnterior= anterior<7.0 && t.est().getAsistencias()>=6 && t.est().getEstado()==Matricula.ACTIVO;
            boolean riesgonuevo= nuevo<7.0 && t.est().getAsistencias()>=6 && t.est().getEstado()==Matricula.ACTIVO;
            if(!riesgoAnterior && riesgonuevo){
                System.out.println("[Alerta] estudiante en riesgo : " + t.est());
            }

        }else if(t.atributo().equals("estado")){
            Matricula anterior=(Matricula)t.old();
            Matricula nuevo=(Matricula)t.nuevo();
           

            boolean riesgoaterior=t.est().getPromedio()<7.0 && t.est().getAsistencias()>=6 && anterior==Matricula.ACTIVO;
            boolean riesgonevo=t.est().getPromedio()<7.0 && t.est().getAsistencias()>=6 && nuevo==Matricula.ACTIVO;
            if(!riesgoaterior && riesgonevo) {
                System.out.println("[Alerta] estudiante en riesgo : " + t.est());
                
            }

        }
    }
    
}
