package practicaFinal.decorator;

public class Personaje {
    private String nombre;
    private String nivel;
    private String armas;
    private int armadura;
    private int ataque;
    private int defensa;
    private int vida;

    public Personaje(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getArmas() {
        return armas;
    }

    public void setArmas(String armas) {
        this.armas = armas;
    }

    public int getArmadura() {
        return armadura;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void showInfo(){
        System.out.println("***Personaje***");
        System.out.println("Nombre del personaje: " + nombre);
        System.out.println("Nivel: " + nivel);
        System.out.println("Armas: "+ armas);
        System.out.println("Porcentaje de armadura: "+armadura);
        System.out.println("Puntod de ataque: "+ataque);
        System.out.println("Puntod de defensa: "+defensa);
        System.out.println("Puntod de vida: "+vida);
    }
}
