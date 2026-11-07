package edu.ups.pap.estructurales.practica2;

public class CanalPush implements CanalEnvio {

    @Override
    public void enviar(String mensaje, String destinatario) {
        System.out.println("Enviando notificacion psuh a " + destinatario + "Con el mensaje" + mensaje);
    }

   

    
}
