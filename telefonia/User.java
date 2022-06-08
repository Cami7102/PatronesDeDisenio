package observer.practice.telefonia;

public class User implements IUser {
    String empresaTelefonia;
    Persona persona;

    public User(Persona persona, String empresaTelefonia) {
        this.persona = persona;
        this.empresaTelefonia = empresaTelefonia;
    }

    @Override
    public void update(String msg, Notificaciones newNotificacion) {
        System.out.println("******* Notificacion: "+msg+" *****");
        System.out.println("Empresa de Telefonia: "+empresaTelefonia);
        System.out.println("persona: "+persona.getName());
        newNotificacion.showInfo();
    }

    @Override
    public String getTelefoniaNotificacion() {
        return empresaTelefonia;
    }

    public Persona getPersona() {
        return persona;
    }
}
