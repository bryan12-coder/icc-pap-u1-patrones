package edu.ups.pap.comportamiento.observerDos.observers;


import java.util.function.Consumer;

import edu.ups.pap.comportamiento.observerDos.CambioEstudiante;

public class ControlDeAsistencia implements Consumer<CambioEstudiante> {

    @Override
    public void accept(CambioEstudiante t) {
        if(!t.atributo().equals("asistencias")){
            return;
        }
        int anterior=(Integer)t.old();
        int nuevo=(Integer)t.nuevo();
        switch (nuevo) {
            case 0,1,2:
                if(anterior<0 && anterior >=2){
                    System.out.println("[ASISTENCIA] Normal" + t.est());
                }

                
                break;
            case 3,4,5:
                if(anterior<=3 && anterior>5){
                    System.out.println("[Asistencia] Advertencia : "+  t.est() );
                }
            break;
            default:
                if(anterior<=6 && anterior>6){
                    System.out.println("[Asistencia] Crítico " + t.est());
                }
                break;
        }
    }
    
}
