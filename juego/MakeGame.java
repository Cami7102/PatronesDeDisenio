package command.practice.juego;

import java.util.ArrayList;
import java.util.List;

public class MakeGame {
    private List<ICommand> commandsJuego = new ArrayList<>();

    public MakeGame(){}

    public void addCommand(ICommand command){
        commandsJuego.add(command);
    }

    public void makeGameCmd(){
        for (ICommand command  : commandsJuego) {
            command.execute();
        }
        commandsJuego.clear();
    }
}
