package practicaFinal.adapter;

public class Empresa implements IAplicacionesMoviles {

    private IAplicacionesWeb aplicaciones;

    public Empresa(IAplicacionesWeb aplicaciones) {
        this.aplicaciones = aplicaciones;
    }

    @Override
    public void showInfoMov() {
        aplicaciones.showInfoWeb();
    }
}
