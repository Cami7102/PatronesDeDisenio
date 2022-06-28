package practicaFinal.proxy;

import java.util.ArrayList;
import java.util.List;

public class Servidor2 implements IServidor {
    private List<Usuario> usu = new ArrayList<>();

    @Override
    public void login(Usuario usuario) {
        usu.add(usuario);
    }

    @Override
    public void atender() {
        for (Usuario usua: usu){
            System.out.println("Servidor2 atendiendo " + usua.getNumero());
            usua.showInfo();
        }
    }
}
