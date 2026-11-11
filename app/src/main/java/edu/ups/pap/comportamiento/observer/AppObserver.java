package edu.ups.pap.comportamiento.observer;

//NotifyAll---> Sirve para 

public class AppObserver {
    
    public static void main(String[] args) {
        Producto p = new Producto("001" , 20.50, "Pizza");


        //p.suscribir(cp -> System.out.println("Correo: " +  cp));
        //p.suscribir(cp -> System.out.println("Registro: " +  cp));

        //p.suscribir(producto ->{

            //String codigoViejo= cp.getCodigo();

        
           // if(codigoViejo!=producto.getCodigo()){

            //    System.out.println("El codigo viejo es " + codigoViejo + " El nuevo codigo es" + producto.getCodigo());
            //}
        //});
        p.suscribir(cp ->{
            System.out.println("Se modifico el "+ cp.atributo()) ;
            System.out.println("Old = " + cp.anterior() + "/ New = " + cp.nuevo());
        });
        

        //que el consumero acctue pero si solamente cuando el codigo cambiar
        

        //Cuando cambie cualquier atributo voy a notificar a todos los consumers

        //p.notifyAll();
        System.out.println("Cambio el precio");
       
        p.setPrecio(15.50);
        System.out.println("Cambio el nombre");
        p.setNombre("PIZZA");
        System.out.println("Cambio el codigo");
        p.setCodigo("010");
    }
    
}
