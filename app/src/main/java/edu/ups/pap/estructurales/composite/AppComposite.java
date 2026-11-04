package edu.ups.pap.estructurales.composite;

public class AppComposite {

    public static void main(String[] args) {
        GrupoMenu combo= new GrupoMenu();
        GrupoMenu hamburguesa= new GrupoMenu();
        hamburguesa.addItem(new ProductoMenu("Queso", 0.5));
        hamburguesa.addItem(new ProductoMenu("Carne", 1.00));
        hamburguesa.addItem(new ProductoMenu("Pan", 0.5));
        hamburguesa.addItem(new ProductoMenu("Lechuga", 0.25));


        ProductoMenu bebida= new ProductoMenu("Coca Cola", 1.35);

        combo.addItem(hamburguesa);// Agrege un grupo menu hamburguesa
        
        combo.addItem(bebida);//Agrege un producto menu bebida

        System.out.println("Total del combo $ " + combo.precio());

    }
    
}
