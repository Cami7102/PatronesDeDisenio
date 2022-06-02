package mediator.practice;

public abstract class Persona {
    protected ICanalDeComunicacion canalDeComunicacion;
    private String ci;
    private String name;
    private String cargo;
    private String grado;
    private String lenguaje;
    private String certificaciones;

    public Persona(ICanalDeComunicacion canalDeComunicacion){
        this.canalDeComunicacion=canalDeComunicacion;
    }

    public ICanalDeComunicacion getCanalDeComunicacion() {
        return canalDeComunicacion;
    }

    public void setCanalDeComunicacion(ICanalDeComunicacion canalDeComunicacion) {
        this.canalDeComunicacion = canalDeComunicacion;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public String getCertificaciones() {
        return certificaciones;
    }

    public void setCertificaciones(String certificaciones) {
        this.certificaciones = certificaciones;
    }

    public abstract void send(String msg);
    public abstract void received(String msg);
}
