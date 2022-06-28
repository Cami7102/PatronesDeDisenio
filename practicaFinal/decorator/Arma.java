package practicaFinal.decorator;

import java.util.Random;

public class Arma extends Habilidades{

    private String[] armas = {"espada", "hacha", "escopeta"};


    public Arma(IJuego juego) {
        super(juego);
    }

@Override
    public void incluirHabilidad(Personaje personaje) {
        System.out.println("***Armas para el personaje***");
        int num = new Random().nextInt(5);
        personaje.setArmas(armas[num]);
        int ataque = personaje.getAtaque() * 30 / 100;
        personaje.setAtaque(ataque);
        int nivel = personaje.getNivel() * 2;
        personaje.setNivel(nivel);
        personaje.showInfo();
    }
}
