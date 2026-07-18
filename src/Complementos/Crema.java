package Complementos;
import Bebidas.*;
import Decorator.*;

public class Crema extends DecoradorCafe {

    public Crema (Cafe cafe){
        super(cafe);
    }

    @Override
    public String descripcion() {
        return cafe.descripcion() + " + crema ";
    }

    @Override
    public double precio() {
        return cafe.precio() + 1.5;
    }
}
