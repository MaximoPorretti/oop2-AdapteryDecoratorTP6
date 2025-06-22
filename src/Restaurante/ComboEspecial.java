package Restaurante;

public class ComboEspecial implements Combo {
    @Override public String getDescripcion() { return "Combo Especial (doble carne + queso + bebida)"; }
    @Override public double getPrecio()      { return 4300; }
}