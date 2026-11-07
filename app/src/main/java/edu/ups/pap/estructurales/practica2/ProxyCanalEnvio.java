package edu.ups.pap.estructurales.practica2;

public class ProxyCanalEnvio implements CanalEnvio {
    private CanalEnvio canalReal;
    private boolean autorizado;

    public ProxyCanalEnvio(CanalEnvio canalReal, boolean autorizado){
        this.autorizado= autorizado;
        this.canalReal= canalReal;

    }
    public  void enviar(String destinatario, String mensaje){
        if(autorizado){
            canalReal.enviar(mensaje, destinatario);
        }else{
            System.out.println("Envio bloqueado: el usuario no esta autorizado");
        }
    }
    
}
