package command.practice.juego;

public class Disparar implements ICommand {
    private Juego juego;

    public Disparar(Juego juego){
        this.juego=juego;
    }

    @Override
    public void execute() {
        System.out.println("executing command: Disparar");
        juego.disparar();
    }
}
