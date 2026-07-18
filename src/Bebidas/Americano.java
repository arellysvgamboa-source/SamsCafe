package Bebidas;

public class Americano extends Cafe {

    @Override
    public String descripcion() {
        return "Cafe Americano";
    }

    @Override
    public double precio() {
        return 7.8;
    }
}
