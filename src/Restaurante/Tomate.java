package Restaurante;

/* === Adicionales ======================= */
public class Tomate extends ComboDecorator {
    public Tomate(Combo c){ super(c); }
    @Override public String getDescripcion(){ return combo.getDescripcion()+", + Tomate"; }
    @Override public double getPrecio()     { return combo.getPrecio()+250; }
}