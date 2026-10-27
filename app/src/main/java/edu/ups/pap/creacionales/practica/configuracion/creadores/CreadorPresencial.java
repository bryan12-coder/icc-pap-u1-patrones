package edu.ups.pap.creacionales.practica.configuracion.creadores;

import edu.ups.pap.creacionales.practica.configuracion.pedidos.Pedido;
import edu.ups.pap.creacionales.practica.configuracion.pedidos.PedidoPresencial;

public class CreadorPresencial extends CreadorPedido{

    @Override
    public Pedido crearPedido(String codigo, String cliente, double subtotal) {
        return new PedidoPresencial(codigo, cliente, subtotal);
    }

    
}
