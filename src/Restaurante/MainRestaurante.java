package Restaurante;

public class MainRestaurante {
    public static void main(String[] args) {
    Combo comboA = new ComboBuilder()
            .basico()
            .addTomate()
            .addQueso()
            .build();

    Combo comboB = new ComboBuilder()
            .especial()
            .addPapas()
            .addCarne()
            .addQueso()
            .build();

    mostrar(comboA);
    System.out.println("-----------");
    mostrar(comboB);
}

    private static void mostrar(Combo c){
        System.out.println("Pedido: " + c.getDescripcion());
        System.out.printf ("Total : $ %.2f%n", c.getPrecio());
    }
}
