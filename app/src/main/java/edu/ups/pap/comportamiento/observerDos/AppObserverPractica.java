package edu.ups.pap.comportamiento.observerDos;

import java.util.function.Consumer;

import edu.ups.pap.comportamiento.observerDos.observers.ControlDeAsistencia;
import edu.ups.pap.comportamiento.observerDos.observers.ControlDeMatricula;
import edu.ups.pap.comportamiento.observerDos.observers.NotificadorRepresentante;
import edu.ups.pap.comportamiento.observerDos.observers.SeguimientoAcademico;
import edu.ups.pap.comportamiento.observerDos.observers.SeguimientoIntegral;

public class AppObserverPractica {

    public static void main(String[] args) {
        Estudiante ana= new Estudiante("EST001", "Ana Torres", 8.5, 1, Matricula.ACTIVO);
      
        Estudiante luis= new Estudiante("EST002", "Luis Perez", 7.2, 4, Matricula.ACTIVO);
        Estudiante maria= new Estudiante("EST003", "María Lopez", 9.1, 0, Matricula.ACTIVO);
        
        //Observado 1
        Consumer<CambioEstudiante> auditoria= cambio ->{
            
            System.out.printf("[Auditoria] %s | %s: %s -> %s%n", cambio.est(), cambio.atributo(),cambio.old(),cambio.nuevo());

        };


        ana.suscribir(auditoria);
        luis.suscribir(auditoria);
        maria.suscribir(auditoria);
        System.out.println("Caso 1");

        ana.setCodigo("EST004");
        ana.setNombre("ANA");

        //Observador 2 academico
        
        SeguimientoAcademico obAcademico= new SeguimientoAcademico();

        ana.suscribir(obAcademico);
        luis.suscribir(obAcademico);
        maria.suscribir(obAcademico);

        System.out.println("Caso 2");
        ana.setPromedio(7.9);;

        maria.setPromedio(4.0);

        //Observador 3
        ControlDeAsistencia obAsistencia= new ControlDeAsistencia();
        ana.suscribir(obAsistencia);
        luis.suscribir(obAsistencia);
        maria.suscribir(obAsistencia);

        System.out.println("Caso 3");

        luis.setAsistencias(7);

        //Observador 4
        ControlDeMatricula obMatricula= new ControlDeMatricula();
        ana.suscribir(obMatricula);
        luis.suscribir(obMatricula);
        maria.suscribir(obMatricula);
        System.out.println("Caso 4");

       
        maria.setEstado(Matricula.SUSPENDIDO);
        maria.setEstado(Matricula.ACTIVO);

        //Observador 5
        SeguimientoIntegral obIntegral= new SeguimientoIntegral();
    
        ana.suscribir(obIntegral);
        luis.suscribir(obIntegral);
        maria.suscribir(obIntegral);

        System.out.println("Caso 5");

        
        maria.setEstado(Matricula.SUSPENDIDO);
        maria.setEstado(Matricula.ACTIVO);

        System.out.println();
        luis.setPromedio(6.4);

        System.out.println("caso 6");

        maria.setEstado(Matricula.ACTIVO);
        maria.setPromedio(4.0);

        System.out.println("caso 7");
        ana.setPromedio(6.5);
        ana.setAsistencias(3);

        luis.setPromedio(5.5);
        luis.setAsistencias(8);

        maria.setPromedio(8.5);
        maria.setAsistencias(4);

        //Observador Representante
    
        NotificadorRepresentante obRepresentante= new NotificadorRepresentante();
        maria.suscribir(obRepresentante);
        luis.suscribir(obRepresentante);
        ana.suscribir(obRepresentante);

        System.out.println("Caso 8");

        ana.setPromedio(6.0);
        ana.setAsistencias(8);
        ana.setEstado(Matricula.SUSPENDIDO);











    }
    
}
