package edu.ups.pap.creacionales.practica.configuracion.pedidos;

public class PedidoEnLinea extends Pedido {

    public PedidoEnLinea(String codigo, String cliente, double subtotal) {
        super(codigo, cliente, subtotal);
    }

    @Override
    public void procesar() {
        System.out.println("Procesando pedido en Linea ... ");
    }

    @Override
    public void generarComprobante() {
        System.out.println("Generando comprobante en linea ... ");
       
    }
    
    
}
