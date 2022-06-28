package practicaFinal.proxy;

public class Proxy implements IServidor {
    private IServidor servidor1;
    private IServidor servidor2;

    public Proxy() {
        System.out.println("***Servidores y proxy***");
        System.out.println();
        servidor1 = new Servidor1();
        servidor2 = new Servidor2();
    }

    @Override
    public void login(Usuario usuario) {
        if(usuario.getNumero() % 2 == 0){
            servidor1.login(usuario);
        } else {
            servidor2.login(usuario);
        }
    }

    @Override
    public void atender() {
        servidor1.atender();
        servidor2.atender();
    }
}
