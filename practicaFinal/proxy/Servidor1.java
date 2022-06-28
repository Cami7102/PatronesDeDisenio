package practicaFinal.proxy;

import java.util.ArrayList;
import java.util.List;

public class Servidor1 implements IServidor {
    private List<Usuario> usu = new ArrayList<>();

    @Override
    public void login(Usuario usuario) {
        usu.add(usuario);
    }

    @Override
    public void atender() {
        for (Usuario usua: usu){
            System.out.println("Servidor1 atendiendo " + usua.getNumero());
            usua.showInfo();
        }
    }
}
