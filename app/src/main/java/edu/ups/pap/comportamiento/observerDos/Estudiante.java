package edu.ups.pap.comportamiento.observerDos;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Estudiante {
    private String codigo;
    private String nombre;
    private double promedio;
    private int asistencias;
    private Matricula estado;

    private  final List<Consumer<CambioEstudiante>> observer;
    

    public Estudiante(String codigo, String nombre, double promedio, int asistencias, Matricula estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.promedio = promedio;
        this.asistencias = asistencias;
        this.estado = estado;
        this.observer= new ArrayList<>();
    }

    public void suscribir(Consumer<CambioEstudiante> observador){
        observer.add(observador);
    }
    public void notificar(CambioEstudiante p){
        for (Consumer<CambioEstudiante> consumer : observer) {
            consumer.accept(p);
            
        }
    }

    public String getCodigo() {

        return codigo;
    }

    public void setCodigo(String codigo) {
        if(this.codigo==codigo){
            return;
        }
        String codigoold=this.codigo;
        this.codigo = codigo;
        CambioEstudiante ce= new CambioEstudiante(this,"codigo", codigoold,codigo);
        notificar(ce);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(this.nombre==nombre){
            return;
        }
        String nombreold=this.nombre;
        this.nombre = nombre;
        CambioEstudiante ce= new CambioEstudiante(this,"nombre", nombreold,nombre);
        notificar(ce);
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        if(this.promedio==promedio){
            return ;
        }
        double promedioOld= this.promedio;
        this.promedio = promedio;
        CambioEstudiante ce= new CambioEstudiante(this,"promedio", promedioOld,promedio);
        notificar(ce);
    }

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        if(this.asistencias==asistencias){
            return;
        }
        int asistenciasOld= this.asistencias;
        this.asistencias = asistencias;
        CambioEstudiante ce= new CambioEstudiante(this,"asistencias", asistenciasOld,asistencias);
        notificar(ce);
    }

    public Matricula getEstado() {
        return estado;
    }

    public void setEstado(Matricula estado) {
        if(this.estado==estado){
            return;
        }
        Matricula estadoOld= this.estado;
        this.estado = estado;
        CambioEstudiante ce= new CambioEstudiante(this,"estado", estadoOld,estado);
        notificar(ce);
    }

    @Override
    public String toString() {
        return "Estudiante [codigo=" + codigo + ", nombre=" + nombre + ", promedio=" + promedio + ", asistencias="
                + asistencias + ", estado=" + estado + "]";
    }
    

    
    
}
