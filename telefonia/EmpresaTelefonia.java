package observer.practice.telefonia;

import java.util.ArrayList;
import java.util.List;

public class EmpresaTelefonia implements ITelefonia{
    private List<Notificaciones> notificacionList = new ArrayList<>();
    private  List <IUser> users= new ArrayList<>();

    public EmpresaTelefonia(){}

    public void enviarNoti(Notificaciones notificaciones){
        notificacionList.add(notificaciones);
        notifyObservers(notificaciones);
    }

    @Override
    public void empresaTel(IUser observer) {
        users.add(observer);
    }

    @Override
    public void detach(IUser observer) {
        users.remove(observer);
    }

    @Override
    public void notifyObservers(Notificaciones notificaciones) {
        for (IUser user:users ) {
            if (user.getTelefoniaNotificacion().equals(notificaciones.getPreciosLlamadas())){
                user.update("Nueva notificacion",notificaciones);
            }else if(user.getTelefoniaNotificacion().equals(notificaciones.getPromociones())){
                user.update("Nueva notificacion", notificaciones);
            }else if(user.getTelefoniaNotificacion().equals(notificaciones.getPremios())){
                user.update("Nueva notificacion", notificaciones);
            }else
                user.getTelefoniaNotificacion().equals(notificaciones.getNoticia());
                user.update("Nueva notificacion", notificaciones);
            }
        }
    }
