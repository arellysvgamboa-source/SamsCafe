package Bebidas;

public class Expresso extends Cafe {

    @Override
    public String descripcion() {
        return "Cafe expreso";
    }

    @Override
    public double precio() {
        return 5.6;
    }
}
