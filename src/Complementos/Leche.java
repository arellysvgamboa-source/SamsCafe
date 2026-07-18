package Complementos;

import Bebidas.Cafe;
import Decorator.DecoradorCafe;

public class Leche extends DecoradorCafe {

    public Leche (Cafe cafe){
        super(cafe);
    }

    @Override
    public String descripcion() {
        return cafe.descripcion() + " + leche ";
    }

    @Override
    public double precio() {
        return cafe.precio() + 2.5;
    }
}
