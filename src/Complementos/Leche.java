package Complementos;
import Bebidas.*;
import Decorator.*;

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
