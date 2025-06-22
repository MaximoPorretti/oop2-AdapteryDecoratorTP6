package Restaurante;

public class Carne extends ComboDecorator {
    public Carne(Combo c){ super(c); }
    @Override public String getDescripcion(){ return combo.getDescripcion()+", + Extra Carne"; }
    @Override public double getPrecio()     { return combo.getPrecio()+800; }
}