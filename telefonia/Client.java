package observer.practice.telefonia;

public class Client {
    public static void main (String [] args){
        EmpresaTelefonia notificar = new EmpresaTelefonia();

        notificar.empresaTel(new User(new Persona("Edgar"), "Viva"));
        notificar.enviarNoti(new Notificaciones("2min: 2bs","Paquete ilimitado: Youtube, Instagram, 2hrs Zoom por 7bs",
                "Raspa 2 tarjetas de recarga, registralas una tras otra y te llevas 10bs de credito", "Nuevos paquetes"));

        notificar.empresaTel(new User(new Persona("Jorge"), "Entel"));
        notificar.enviarNoti(new Notificaciones("3min: 2bs","Paquete ilimitado: Youtube, Instagram,Whatsapp, 2hrs Zoom y TikTok por 7bs",
                "Raspa 2 tarjetas de recarga, registralas una tras otra y te llevas 20bs de credito", "Nuevos paquetes"));

            notificar.empresaTel(new User(new Persona("Isabel"), "Tigo"));
        notificar.enviarNoti(new Notificaciones("2min: 3bs","Paquete ilimitado: Youtube, Instagram por 7bs",
                "Raspa 2 tarjetas de recarga, registralas una tras otra y te llevas 3bs de credito", "Nuevos paquetes"));


    }
}
