package edu.ups.pap.creacionales;

public class BuilderDemo {
    public static void runBuilder(){
        Computadora computadora= new ComputadoraBuilder().setProcesador("Intel i7").setMemoriaRam(15).setAlmacenamiento(512).build();


        computadora.mostrarInformacion();


    }

    
}
