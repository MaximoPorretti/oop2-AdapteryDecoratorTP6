package Motor;

public class ClienteMotores {
    public static void main(String[] args) {
        Motor comun = new MotorComun();
        Motor economico = new MotorEconomico();
        Motor electrico = new MotorElectricoAdapter();

        System.out.println(">>>>>>== Motor Común ==<<<<<<");
        comun.arrancar();
        comun.acelerar();
        comun.apagar();

        System.out.println("\n>>>>== Motor Económico ==<<<<");
        economico.arrancar();
        economico.acelerar();
        economico.apagar();

        System.out.println("\n>>>>>== Motor Eléctrico (adaptado) ==<<<<<");
        electrico.arrancar();
        electrico.acelerar();
        electrico.apagar();
    }
}
