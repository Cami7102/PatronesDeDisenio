package state.practice.computadora;

public class Computadora {
    private IStateCompu stateCompu;
    private Memoria memoria;
    private CPU cpu;
private ProgramasAbiertos programasAbiertos;

    public Computadora() {
        memoria= new Memoria();
        memoria.setCapacidad(6);
        cpu= new CPU();
        cpu.setCapacidad(4);
        programasAbiertos= new ProgramasAbiertos();
        programasAbiertos.setCantidad("2");
        stateCompu = new Apagado();
    }

    public IStateCompu getStateCompu() {
        return stateCompu;
    }

    public void setStateCompu(IStateCompu stateCompu) {
        this.stateCompu = stateCompu;
    }

    public Memoria getMemoria() {
        return memoria;
    }

    public void setMemoria(Memoria memoria) {
        this.memoria = memoria;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public ProgramasAbiertos getProgramasAbiertos() {
        return programasAbiertos;
    }

    public void setProgramasAbiertos(ProgramasAbiertos programasAbiertos) {
        this.programasAbiertos = programasAbiertos;
    }

    public void resourceManager() throws InterruptedException {
        stateCompu.resourceManager(this);
    }
}
