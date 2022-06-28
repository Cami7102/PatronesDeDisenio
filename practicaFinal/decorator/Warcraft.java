package practicaFinal.decorator;

public class Warcraft implements IJuego {

    @Override
    public void seleccionarPersonaje(Personaje personaje) {
        System.out.println("Creando personaje!");
        personaje.setArmadura(1);
        personaje.setArmas("Ninguna");
        personaje.setNivel(1);
        personaje.setAtaque(1);
        personaje.setVida(1);
        personaje.setDefensa(1);
        personaje.showInfo();
    }

    @Override
    public void incluirHabilidad(Personaje personaje) {
        //TODO
    }
}
