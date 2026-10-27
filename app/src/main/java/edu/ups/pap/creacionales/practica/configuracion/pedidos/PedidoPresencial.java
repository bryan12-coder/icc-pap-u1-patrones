package edu.ups.pap.creacionales.practica.configuracion.pedidos;

public class PedidoPresencial extends Pedido{

    public PedidoPresencial(String codigo, String cliente, double subtotal) {
        super(codigo, cliente, subtotal);
    }

    @Override
    public void procesar() {
        System.out.println("Procesando pedido presencial ... ");
    }

    @Override
    public void generarComprobante() {
        System.out.println("Generando comprobante presencial ... ");
    }
    
    
    
}
