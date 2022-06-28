package practicaFinal.visitor;

import java.util.Random;

public class Aplicacion implements IAplicacion{

    @Override
    public void mantCelular(Celular c) {
        System.out.println("Realizar mantenimiento al celular para su mejor funcionamiento");
        c.showInfo();
    }

    @Override
    public void mantComputadora(Computadora co) {
        if(new Random().nextInt(10) % 2 == 0){
            System.out.println("Realizar mantenimiento a la computadora para su mejor funcionamiento");
        } else {
        }
        co.showInfo();
    }

    @Override
    public void mantTelevisor(Televisor t) {
        System.out.println("Realizar mantenimiento al televisor para su mejor funcionamiento");
        t.showInfo();
    }
}
