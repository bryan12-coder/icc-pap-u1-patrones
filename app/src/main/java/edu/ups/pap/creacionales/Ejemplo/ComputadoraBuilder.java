package edu.ups.pap.creacionales.Ejemplo;

public class ComputadoraBuilder {
    private String procesador;
    private int memoriaRam;
    private int almacenamiento;
    public ComputadoraBuilder setProcesador(String procesador) {
        this.procesador = procesador;
        return this;
    }
    public ComputadoraBuilder setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
        return this;
    }
    public ComputadoraBuilder setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
        return this;
    }

    public Computadora build(){
        return new Computadora(procesador, memoriaRam, almacenamiento);

    }

    

    
}
