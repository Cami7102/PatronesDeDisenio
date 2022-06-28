package practicaFinal.composite;

public abstract class Component {
    private String tipo;
    private int palabras;

    public Component(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPalabras() {
        return palabras;
    }

    public void setPalabras(int palabras) {
        this.palabras = palabras;
    }

    public abstract void numPalabras();
    public abstract void add(Component component);
    public abstract void remove(Component component);
}
