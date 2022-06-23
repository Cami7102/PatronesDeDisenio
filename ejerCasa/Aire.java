package bridge.practice.ejerCasa;

public class Aire  implements IEnvio{

    @Override
    public void enviar(Paquete paquete) {
        String precioEnvio = String.valueOf(paquete.getPrecio()+ paquete.getPrecio()*0.1);
        System.out.println("Paquete enviado por aire");
        paquete.showInfo();
        System.out.println("Precio por aire: "+precioEnvio);
    }
}
