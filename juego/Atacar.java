package command.practice.juego;

public class Atacar implements ICommand {
    private Juego juego;

    public Atacar(Juego juego){
        this.juego=juego;
    }

    @Override
    public void execute() {
        System.out.println("executing command: Atacar");
        juego.atacar();
    }
}
