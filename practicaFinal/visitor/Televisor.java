package practicaFinal.visitor;

public class Televisor implements IArtefactos{
    private String modelo;
    private String pulgadas;

    public Televisor(String modelo, String pulgadas) {
        this.modelo = modelo;
        this.pulgadas = pulgadas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(String pulgadas) {
        this.pulgadas = pulgadas;
    }

    @Override
    public void showInfo() {
        System.out.println("***Informacion del Televisor***");
        System.out.println("Modelo: "+modelo);
        System.out.println("Pulgadas: "+pulgadas);
    }
}
