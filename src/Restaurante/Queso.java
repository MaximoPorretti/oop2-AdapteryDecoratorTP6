package Restaurante;

public class Queso extends ComboDecorator {
    public Queso(Combo c){ super(c); }
    @Override public String getDescripcion(){ return combo.getDescripcion()+", + Queso"; }
    @Override public double getPrecio()     { return combo.getPrecio()+300; }
}