package edu.ups.pap.estructurales.practica2;

public class NotificacionAdministrativa extends Notificacion{
    NotificacionAdministrativa(CanalEnvio canal){
        super(canal);
    }

    @Override
    public void notificar(String destinatario, String mensaje) {
        
        canal.enviar(mensaje, destinatario);
    }

    

   

    


    


    
   
    
}
