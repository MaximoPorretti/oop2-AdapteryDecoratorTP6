package Restaurante;

/* === Decorador base ==================== */
public abstract class ComboDecorator implements Combo {
    protected final Combo combo;
    protected ComboDecorator(Combo combo) { this.combo = combo; }
}