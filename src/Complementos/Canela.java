package Complementos;
import Bebidas.*;
import Decorator.*;

public class Canela extends DecoradorCafe {

    public Canela (Cafe cafe){
        super(cafe);
    }

    @Override
    public String descripcion() {
        return cafe.descripcion() + " + canela ";
    }

    @Override
    public double precio() {
        return cafe.precio() + 1.8;
    }
}
