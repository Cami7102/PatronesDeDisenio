package command.practice.juego;

public class Client {
    public static void main (String[]args){
        Juego residentEvil = new Juego();
        residentEvil.setName("Resident Evil");

        Disparar disparar= new Disparar(residentEvil);
        ModoDefen modoDefen = new ModoDefen(residentEvil);
        Atacar atacar= new Atacar(residentEvil);

        MakeGame makeGame= new MakeGame();

        makeGame.addCommand(disparar);
        makeGame.addCommand(modoDefen);
        makeGame.addCommand(atacar);

        makeGame.makeGameCmd();
    }
}
