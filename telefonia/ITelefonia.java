package observer.practice.telefonia;

public interface ITelefonia {
    void empresaTel(IUser observer);
    void detach(IUser observer);
    void notifyObservers(Notificaciones notificaciones);
}
