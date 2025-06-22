package Motor;

public class MotorElectricoAdapter implements Motor {
    private MotorElectrico motorElectrico;

    public MotorElectricoAdapter() {
        this.motorElectrico = new MotorElectrico();
    }

    @Override
    public void arrancar() {
        motorElectrico.conectarYActivar();
    }

    @Override
    public void acelerar() {
        motorElectrico.moverMasRapido();
    }

    @Override
    public void apagar() {
        motorElectrico.detenerYDesconectar();
    }
}
