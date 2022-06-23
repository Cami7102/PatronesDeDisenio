package bridge.practice.ejerCasa;

public class SRL implements IEmpresa{

    private IEnvio envio;

    public SRL() {}

    public IEnvio getEnvio() {
        return envio;
    }

    public void setEnvio(IEnvio envio) {
        this.envio = envio;
    }

    @Override
    public void empacar(Paquete paquete) {
        System.out.println("La empresa SRL acaba de recibir un paquete");
        envio.enviar(paquete);
    }
}
