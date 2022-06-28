package practicaFinal.decorator;

public class Escudo extends Habilidades{

    public Escudo(IJuego juego) {
        super(juego);
    }

    @Override
    public void incluirHabilidad(Personaje personaje){
        System.out.println("Sacando escudo");
        int defensa = personaje.getDefensa() * 35 / 100;
        personaje.setDefensa(defensa);
        int armadura = personaje.getArmadura() * 10 / 100;
        personaje.setArmadura(armadura);
        personaje.showInfo();
    }
}
