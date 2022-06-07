package command.practice.juego;

public class ModoDefen implements ICommand {
    private Juego juego;

    public ModoDefen(Juego juego){
        this.juego=juego;
    }

    @Override
    public void execute() {
        System.out.println("executing command: Modo defensa");
        juego.modoDefen();
    }
}
