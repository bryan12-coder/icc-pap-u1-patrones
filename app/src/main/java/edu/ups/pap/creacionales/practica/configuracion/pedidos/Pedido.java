package edu.ups.pap.creacionales.practica.configuracion.pedidos;

import edu.ups.pap.creacionales.practica.configuracion.ConfigracionSistema;

public abstract class Pedido {
    protected String codigo;
    protected String cliente;
    protected double subtotal;

    public Pedido(String codigo, String cliente, double subtotal) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.subtotal = subtotal;
    }

    public abstract void procesar();

    public abstract void generarComprobante();

    public void mostrarInformacion() {

        ConfigracionSistema config = ConfigracionSistema.getInstancia();

        double valorImpuesto =
                subtotal * config.getImpuesto() / 100;

        double total = subtotal + valorImpuesto;

        System.out.println("Código: " + codigo);
        System.out.println("Cliente: " + cliente);
        System.out.printf("Subtotal: $%.2f%n", subtotal);
        System.out.printf("Impuesto: $%.2f%n", valorImpuesto);
        System.out.printf("Total: $%.2f%n", total);
    }

    
}
