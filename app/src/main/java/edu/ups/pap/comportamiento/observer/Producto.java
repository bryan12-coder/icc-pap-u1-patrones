package edu.ups.pap.comportamiento.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

//Consumer --> Clase q tiene codigo que las podemos usar
//Establece una accion

public class Producto {

    private String codigo;
    private double precio;
    private String nombre;



    public final List<Consumer<CambioProducto>> observadores;
    
    

    public Producto(String codigo, double precio, String nombre) {
        this.codigo = codigo;
        this.precio = precio;
        this.nombre = nombre;
        this.observadores= new ArrayList<>();
    }
    public void suscribir(Consumer<CambioProducto> observador){
        observadores.add(observador);

    }
    private void notifyAll(CambioProducto p){
        for (Consumer<CambioProducto> observador : observadores) {
            observador.accept(p); 
        }

    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        String codigoold=this.codigo;
        this.codigo = codigo;
        CambioProducto cp= new CambioProducto(this,"codigo", codigoold,codigo );

        notifyAll(cp);
    }
    public double getPrecio() {
        return precio;
        
    }
    public void setPrecio(double precio) {
        double precioold=this.precio;
        this.precio = precio;
        CambioProducto cp1= new CambioProducto(this, "Precio", precioold, precio);
        notifyAll(cp1);
       
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        String nombreold= this.nombre;
        this.nombre = nombre;
        CambioProducto cp3= new CambioProducto(this, "Nombre", nombreold, nombre);
        notifyAll(cp3);
       
        
    }
    public List<Consumer<CambioProducto>> getObservadores() {
        return observadores;
    }
    @Override
    public String toString() {
        return "Producto [codigo=" + codigo + ", precio=" + precio + ", nombre=" + nombre + "]";
    }
    

    
}
