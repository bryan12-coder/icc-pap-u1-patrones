package edu.ups.pap.creacionales.practica.configuracion.creadores;

import edu.ups.pap.creacionales.practica.configuracion.pedidos.Pedido;
import edu.ups.pap.creacionales.practica.configuracion.pedidos.PedidoEnLinea;

public class CreadorEnLinea extends CreadorPedido{

    @Override
    public Pedido crearPedido(String codigo, String cliente, double subtotal) {
       return new PedidoEnLinea(codigo, cliente, subtotal);
    }
    
}
