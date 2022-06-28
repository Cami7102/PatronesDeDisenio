package practicaFinal.decorator;

public abstract class Habilidades implements IJuego{

    protected IJuego juego;

    public Habilidades(IJuego juego) {
        this.juego = juego;
    }

    public void seleccionarPersonaje(Personaje personaje) {
        personaje.showInfo();
    }

    public void incluirHabilidad(Personaje personaje) {
        personaje.showInfo();
    }
}
