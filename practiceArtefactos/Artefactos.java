package adapter.practiceArtefactos;

public class Artefactos implements IElectronico{

    private IElectrodomesticos artefactos;

    public Artefactos(IElectrodomesticos artefactos) {
        this.artefactos = artefactos;
    }

    @Override
    public void showInfo() {
        artefactos.showInfoElec();
    }
}
