package edu.ups.pap.estructurales.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite porque llega a agrupar productos de tipo ElementoMenu
 * y calcula un precio en este caso es la sumatoria de todos los elementosMenu
 * GrupoMenu
 */

public class GrupoMenu implements ElementoMenu {

    private List<ElementoMenu> items;
    

    public GrupoMenu() {
        items= new ArrayList<>();
    }

    @Override
    public double precio() {
        //Sumatoria de todos
        //double suma=0;
        //for (ElementoMenu elementoMenu : items) {
        //    suma= suma+ elementoMenu.precio();
            
       // }
       // return suma;

       return items.stream().mapToDouble(ElementoMenu::precio).sum();//---> cuatro puntos referencia a un metodo

        
    }
    public  void addItem(ElementoMenu item){
        this.items.add(item);
    }
    
}
