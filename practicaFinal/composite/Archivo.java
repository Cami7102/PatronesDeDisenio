package practicaFinal.composite;

public class Archivo extends Component{
    
    public Archivo(String tipo){
        super(tipo);
    }

    @Override
    public void numPalabras() {
        System.out.println("***El numero de palabras en el tipo de archivo "+getTipo() + "es menor" + getPalabras());
    }

    @Override
    public void add() {
// TODO: 28/06/2022  
    }

    @Override
    public void remove() {
// TODO: 28/06/2022
    }
}
