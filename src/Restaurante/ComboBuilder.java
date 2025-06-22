package Restaurante;
/* === c) Builder fluido ================= */
public class ComboBuilder {
    private Combo combo;

    public ComboBuilder basico(){ combo = new ComboBasico(); return this; }
    public ComboBuilder familiar(){ combo = new ComboFamiliar(); return this; }
    public ComboBuilder especial(){ combo = new ComboEspecial(); return this; }

    // ­extras
    public ComboBuilder addTomate(){ combo = new Tomate(combo); return this; }
    public ComboBuilder addPapas() { combo = new Papas(combo);  return this; }
    public ComboBuilder addCarne() { combo = new Carne(combo);  return this; }
    public ComboBuilder addQueso() { combo = new Queso(combo);  return this; }

    public Combo build(){ return combo; }
}
