package edu.ups.pap.creacionales;

public class Computadora {
    private String procesador;
    private int memoriaRam;
    private int almacenamiento;
    public Computadora(String procesador, int memoriaRam, int almacenamiento) {
        this.procesador = procesador;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
    }

    public void mostrarInformacion(){
        System.out.println("Procesador :" + procesador);
        System.out.println("Memoria Ram : " + memoriaRam + "GB");
        System.out.println("Almacenamiento : " + almacenamiento + "GB");
        
    }
    
}
