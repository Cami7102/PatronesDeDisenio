package practicaFinal.visitor;

public class Celular implements IArtefactos{
    private String empresa;
    private String miu;

    public Celular(String empresa, String miu) {
        this.empresa = empresa;
        this.miu = miu;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getMiu() {
        return miu;
    }

    public void setMiu(String miu) {
        this.miu = miu;
    }

    @Override
    public void showInfo() {
        System.out.println("***Informacion del Celular***");
        System.out.println("Empresa: "+empresa);
        System.out.println("MIU: "+miu);
    }
}
