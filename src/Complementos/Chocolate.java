package Complementos;
import Bebidas.*;
import Decorator.*;

public class Chocolate extends DecoradorCafe {

    public Chocolate (Cafe cafe){
        super(cafe);
    }

    @Override
    public String descripcion() {
        return cafe.descripcion() + " + chocolate ";
    }

    @Override
    public double precio() {
        return cafe.precio() + 3.4;
    }
}

