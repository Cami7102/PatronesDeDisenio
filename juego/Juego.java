package command.practice.juego;

public class Juego {
    private String name;

    public Juego(){
    }

    public String getName() {
        return name;
    }

    public Juego setName(String name) {
        this.name = name;
        return this;
    }

    public void disparar(){
        System.out.println("Dispara!!");
    }
    public void modoDefen(){
        System.out.println("Modo defensa!!");
        System.out.println("Te encuentras a salvo");
    }
    public void atacar(){
        System.out.println("Ataca!!");
        System.out.println("Perfecto :)");
    }
}
