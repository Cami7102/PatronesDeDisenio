package prototype.practice;

public class Celular {
    private String  tamano;
    private String  cpu;
    private String  memory;
    private String  versionAndroid;
    private String  camara;
    private String  bluetooth;
    private String  cantidadDeMemoriasExternas;
    private String  tipoBateria;
    private Sim sim = new Sim();
    private Accesorios accesorios = new Accesorios();

    public Celular() {
    }
// get set

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getVersionAndroid() {
        return versionAndroid;
    }

    public void setVersionAndroid(String versionAndroid) {
        this.versionAndroid = versionAndroid;
    }

    public String getCamara() {
        return camara;
    }

    public void setCamara(String camara) {
        this.camara = camara;
    }

    public String getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(String bluetooth) {
        this.bluetooth = bluetooth;
    }

    public String getCantidadDeMemoriasExternas() {
        return cantidadDeMemoriasExternas;
    }

    public void setCantidadDeMemoriasExternas(String cantidadDeMemoriasExternas) {
        this.cantidadDeMemoriasExternas = cantidadDeMemoriasExternas;
    }

    public String getTipoBateria() {
        return tipoBateria;
    }

    public void setTipoBateria(String tipoBateria) {
        this.tipoBateria = tipoBateria;
    }

    public Sim getSim() {
        return sim;
    }

    public void setSim(Sim sim) {
        this.sim = sim;
    }

    public Accesorios getAccesorios() {
        return accesorios;
    }

    public void setAccesorios(Accesorios accesorios) {
        this.accesorios = accesorios;
    }

    @Override
    public Object clone() {

        Accesorios cloneA = new Accesorios();
        cloneA.setAudifonos(this.getAccesorios().getAudifonos());
        cloneA.setCargador(this.getAccesorios().getCargador());
        cloneA.setEstuche(this.getAccesorios().getEstuche());

        Sim cloneS = new Sim();
        cloneS.setNombreEmpresaTel(this.getSim().getNombreEmpresaTel());
        cloneS.setNumeroTelefono(this.getSim().getNumeroTelefono());

        Celular clone = new Celular();
        clone.setTamano(this.getTamano());
        clone.setCpu(this.getCpu());
        clone.setMemory(this.getMemory());
        clone.setCamara(this.getCamara());
        clone.setCantidadDeMemoriasExternas(this.getCantidadDeMemoriasExternas());
        clone.setTipoBateria(this.getTipoBateria());
        clone.setBluetooth(this.getBluetooth());
        clone.setVersionAndroid(this.getVersionAndroid());
        clone.setSim(cloneS);
        clone.setAccesorios(cloneA);
        return clone;
    }

    public void showInfo(){
        System.out.println(" \n ****  Information del celular SamsungR10  *** \n ");
        System.out.println("tamaño: "+tamano);
        System.out.println("cpu: "+cpu);
        System.out.println("memory: "+memory);
        System.out.println("version Android: "+versionAndroid);
        System.out.println("camara: "+camara);
        System.out.println("bluetooth: "+bluetooth);
        System.out.println("cantidad de memorias externas: "+cantidadDeMemoriasExternas);
        System.out.println("tipo de bateria: "+tipoBateria);
        System.out.println("sim Empresa: "+sim.getNombreEmpresaTel());
        System.out.println("sim numero: "+sim.getNumeroTelefono());
        System.out.println("accesorio1: "+accesorios.getAudifonos());
        System.out.println("accesorio2: "+accesorios.getCargador());
        System.out.println("accesorio3: "+accesorios.getEstuche());
    }
}
