package practicaFinal.visitor;

public class Computadora implements IArtefactos{
    private String empresa;
    private String memoria;

    public Computadora(String empresa, String memoria) {
        this.empresa = empresa;
        this.memoria = memoria;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    @Override
    public void showInfo() {
        System.out.println("***Informacion de la Computadora***");
        System.out.println("Empresa: "+empresa);
        System.out.println("Memoria: "+memoria);
    }
}
