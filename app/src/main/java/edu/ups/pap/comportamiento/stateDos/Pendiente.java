package edu.ups.pap.comportamiento.stateDos;

public class Pendiente implements EstadoPedido{

    @Override
    public void pagar(Pedido pedido) {
        System.out.println("PagoSystem.out.println(); Realizado" );
        pedido.changeStare(new Pagado());
    }

    @Override
    public void enviar(Pedido pedido) {
       System.out.println("Debes pagar primero");
      
    }

    @Override
    public void entregar(Pedido pedido) {
       System.out.println("El pedido no ha sido ENVIADO");
       
    }

    @Override
    public void cancelar(Pedido pedido) {
       System.out.println("Pedido Cancelado");
       pedido.changeStare(new Cancelado());
    }

    @Override
    public String nombre() {
        return "PENDIENTE";
       
    }
    
}
