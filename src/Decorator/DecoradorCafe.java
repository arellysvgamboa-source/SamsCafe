package Decorator;
import Bebidas.*;

public abstract class DecoradorCafe extends Cafe {
    protected Cafe cafe;
    public DecoradorCafe(Cafe cafe){
        this.cafe = cafe;
    }
}
