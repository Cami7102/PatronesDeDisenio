package practicaFinal.decorator;

public class Client {
    private static void main(String[] args){
        Personaje p1 = new Personaje("Jaimito");

        IJuego warcraft = new Warcraft();
        warcraft.incluirHabilidad(p1);

        warcraft = new Arma(warcraft);
        warcraft.incluirHabilidad(p1);

        warcraft = new Escudo(warcraft);
        warcraft.incluirHabilidad(p1);

        warcraft = new Curacion(warcraft);
        warcraft.incluirHabilidad(p1);

        warcraft = new Arma(warcraft);
        warcraft.incluirHabilidad(p1);
    }
}
