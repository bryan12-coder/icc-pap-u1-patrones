package edu.ups.pap.estructurales.practica2;

public class AppNotificaciones {

    //Esta es la notificacion academica de por correo
    //Caso 1 

    public static void main(String[] args) {
        //Esta es la notificacion academica de por correo
    //Caso 1 
        CanalEnvio correo= new CanalCorreo();

        NotificacionAcademica notifA= new NotificacionAcademica(correo);
        notifA.notificar("estudiante@univerdidad.ed", "Sus calificaciones ya estan disponibles");

        //Caso 2
        //Notificacion Administrativa por SMS
        NotificacionAdministrativa notifad= new NotificacionAdministrativa(correo);
        notifad.notificar("0991234567", "Existe un tramite pendiente por favor comuniquese");
        //Caso 3
        //Notificacion de seguridad
        CanalEnvio push= new CanalPush();
        CanalEnvio proxy10= new ProxyCanalEnvio(push, true);
        NotificacionSeguridad notiS= new NotificacionSeguridad(proxy10);
        notiS.notificar("Usuario123", "Alerta seguridad");

        //Caso 4
        //Notificacion acedmica sin autorizacion
        CanalEnvio sms= new CanalSMS();
        CanalEnvio proxy2= new ProxyCanalEnvio(sms, false);
        NotificacionAcademica notifa2= new NotificacionAcademica(proxy2);
        notifa2.notificar("0987654321", "Su autorizacion esta desabilitada");

        // Caso 5
        //Reutilizacion del mismo canal con diferentes notificaciones
        CanalEnvio correo2= new CanalCorreo();
        NotificacionAcademica notif2= new NotificacionAcademica(correo2);
        NotificacionAdministrativa noti3= new NotificacionAdministrativa(correo2);
        notif2.notificar("estudiante@universidad.edu", "Nueva actividad");
        noti3.notificar("docente@universidad", "Tiene un tramite pendiente");
        //Caso 6
        //Combinacion de bridge y proxy con diferentes canales
        CanalEnvio proxyCorreo= new ProxyCanalEnvio(correo2, true);
        CanalEnvio proxySMS= new ProxyCanalEnvio(sms, false);
        Notificacion n7 = new NotificacionSeguridad(proxyCorreo);
        Notificacion n8 = new NotificacionSeguridad(proxySMS);

        n7.notificar("estudiante@universidad.edu",
                "Alerta de acceso");

        n8.notificar("0991234567",
                "Alerta de seguridad");

        
        
    }

    



    
}
