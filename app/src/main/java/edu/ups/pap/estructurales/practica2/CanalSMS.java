package edu.ups.pap.estructurales.practica2;



public class CanalSMS implements CanalEnvio {

    @Override
    public void enviar(String mensaje, String destinatario) {
        System.out.println("Enviando notificacion por SMS a " + destinatario + "Con el mensaje" + mensaje);
    }

    
    
}
