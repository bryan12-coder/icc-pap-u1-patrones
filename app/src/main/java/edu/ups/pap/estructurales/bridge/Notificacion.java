package edu.ups.pap.estructurales.bridge;

public abstract class Notificacion {
    protected final CanalDeEnvio canal;

    //Contructor dependiente de canal de envio

    public Notificacion(CanalDeEnvio canal){
        this.canal=canal;
    }

    public abstract void notificar(String mensaje);
    
}
