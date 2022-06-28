package practicaFinal.proxy;

public class Client {
    public static void main(String[] args){
        IServidor proxy = new Proxy();

        proxy.login(new Usuario("PariGamePlays", 123));
        proxy.login(new Usuario("RatoncitoCiego7", 456));

        proxy.atender();
    }
}
