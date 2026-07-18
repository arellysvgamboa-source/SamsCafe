package Bebidas;

public class Latte extends Cafe{
    @Override
    public String descripcion() {
        return "Latte";
    }

    @Override
    public double precio() {
        return 8.5;
    }
}
