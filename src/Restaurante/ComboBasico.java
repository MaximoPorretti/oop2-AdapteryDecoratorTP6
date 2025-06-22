package Restaurante;

/* === Combos base ======================= */
public class ComboBasico implements Combo {
    @Override public String getDescripcion() { return "Combo Básico (hamburguesa + bebida)"; }
    @Override public double getPrecio()      { return 2500; }
}
