package edu.ups.pap.estructurales.practica2;

public class CanalCorreo implements CanalEnvio {

    @Override
    public void enviar(String mensaje, String destinatario) {
        System.out.println("Enviando notificacion por correo a" + destinatario + "Con el mensaje" + mensaje);
    }
    
}
