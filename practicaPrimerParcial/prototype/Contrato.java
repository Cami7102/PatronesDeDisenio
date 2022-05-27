package practicaPrimerParcial.prototype;

public class Contrato {
    private String sueldo;
    private String cargaHoraria;
    private Boolean  cursoEducacionSuperior;
    private Boolean  accesoPlataforma;
    private Boolean  marcadoBiometrico;
    private String marcadoHoraDeEntrada;
    private String marcadoHoraDeSalida;
    private DatosDocente datosDocente = new DatosDocente();

    public Contrato() {
    }


    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Boolean getCursoEducacionSuperior() {
        return cursoEducacionSuperior;
    }

    public void setCursoEducacionSuperior(Boolean cursoEducacionSuperior) {
        this.cursoEducacionSuperior = cursoEducacionSuperior;
    }

    public Boolean getAccesoPlataforma() {
        return accesoPlataforma;
    }

    public void setAccesoPlataforma(Boolean accesoPlataforma) {
        this.accesoPlataforma = accesoPlataforma;
    }

    public Boolean getMarcadoBiometrico() {
        return marcadoBiometrico;
    }

    public void setMarcadoBiometrico(Boolean marcadoBiometrico) {
        this.marcadoBiometrico = marcadoBiometrico;
    }

    public String getMarcadoHoraDeEntrada() {
        return marcadoHoraDeEntrada;
    }

    public void setMarcadoHoraDeEntrada(String marcadoHoraDeEntrada) {
        this.marcadoHoraDeEntrada = marcadoHoraDeEntrada;
    }

    public String getMarcadoHoraDeSalida() {
        return marcadoHoraDeSalida;
    }

    public void setMarcadoHoraDeSalida(String marcadoHoraDeSalida) {
        this.marcadoHoraDeSalida = marcadoHoraDeSalida;
    }

    public DatosDocente getDatosDocente() {
        return datosDocente;
    }

    public void setDatosDocente(DatosDocente datosDocente) {
        this.datosDocente = datosDocente;
    }

    @Override
    public Object clone() {

        DatosDocente cloneD = new DatosDocente();
        cloneD.setNombre(this.getDatosDocente().getNombre());
        cloneD.setApellido(this.getDatosDocente().getApellido());

        Contrato clone = new Contrato();
        clone.setSueldo(this.getSueldo());
        clone.setCargaHoraria(this.getCargaHoraria());
        clone.setCursoEducacionSuperior(this.getCursoEducacionSuperior());
        clone.setAccesoPlataforma(this.getAccesoPlataforma());
        clone.setMarcadoBiometrico(this.getMarcadoBiometrico());
        clone.setMarcadoHoraDeEntrada(this.getMarcadoHoraDeEntrada());
        clone.setMarcadoHoraDeSalida(this.getMarcadoHoraDeSalida());
        clone.setDatosDocente(cloneD);
        return clone;
    }

    public void showInfo(){
        System.out.println(" \n ****  Contrato de un docente  *** \n ");
        System.out.println("Sueldo: "+sueldo);
        System.out.println("Carga horaria: "+cargaHoraria);
        System.out.println("Curso de educacion superior: "+cursoEducacionSuperior);
        System.out.println("Acceso a la plataforma: "+accesoPlataforma);
        System.out.println("Marcado biometrico: "+marcadoBiometrico);
        System.out.println("Marcado hora de entrada: "+marcadoHoraDeEntrada);
        System.out.println("Marcado hora de salida: "+marcadoHoraDeSalida);
        System.out.println("Nombre del docente: "+datosDocente.getNombre());
        System.out.println("Apellido del docente: "+datosDocente.getApellido());
    }
}
