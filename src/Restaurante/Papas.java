package Restaurante;

public class Papas extends ComboDecorator {
    public Papas(Combo c){ super(c); }
    @Override public String getDescripcion(){ return combo.getDescripcion()+", + Papas"; }
    @Override public double getPrecio()     { return combo.getPrecio()+550; }
}