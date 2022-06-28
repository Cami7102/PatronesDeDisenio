package practicaFinal.decorator;

public class Curacion extends Habilidades{

    public Curacion(IJuego juego) {
        super(juego);
    }

    @Override
    public void incluirHabilidad(Personaje personaje){
        System.out.println("Curando al personaje!");
        int vida = personaje.getVida() * 80 / 100;
        personaje.setDefensa(vida);
        personaje.showInfo();
    }
}
