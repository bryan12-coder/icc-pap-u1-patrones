package edu.ups.pap.creacionales.practica.configuracion.creadores;

import edu.ups.pap.creacionales.practica.configuracion.pedidos.Pedido;

public abstract class CreadorPedido {
     public abstract Pedido crearPedido(
            String codigo, String cliente, double subtotal);

    
}
