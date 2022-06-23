package bridge.practice.ejerCasa;

public class SA implements IEmpresa{

    private IEnvio envio;

    public SA() {}

    public IEnvio getEnvio() {
        return envio;
    }

    public void setEnvio(IEnvio envio) {
        this.envio = envio;
    }

    @Override
    public void empacar(Paquete paquete) {
        System.out.println("La empresa SA acaba de recibir un paquete");
        envio.enviar(paquete);
    }
}
