package practicaSegundoParcial.chainOfResponsability;

public class Ordenes {
    private String cuerpo;
    private Boolean entrevistas;
    private Boolean disciplina;
    private Boolean desbloqueosManifestaciones;
    private Boolean limpiezas;

    public Ordenes(String cuerpo, Boolean entrevistas, Boolean disciplina, Boolean desbloqueosManifestaciones, Boolean limpiezas) {
        this.cuerpo = cuerpo;
        this.entrevistas = entrevistas;
        this.disciplina = disciplina;
        this.desbloqueosManifestaciones = desbloqueosManifestaciones;
        this.limpiezas = limpiezas;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public Boolean getEntrevistas() {
        return entrevistas;
    }

    public void setEntrevistas(Boolean entrevistas) {
        this.entrevistas = entrevistas;
    }

    public Boolean getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Boolean disciplina) {
        this.disciplina = disciplina;
    }

    public Boolean getDesbloqueosManifestaciones() {
        return desbloqueosManifestaciones;
    }

    public void setDesbloqueosManifestaciones(Boolean desbloqueosManifestaciones) {
        this.desbloqueosManifestaciones = desbloqueosManifestaciones;
    }

    public Boolean getLimpiezas() {
        return limpiezas;
    }

    public void setLimpiezas(Boolean limpiezas) {
        this.limpiezas = limpiezas;
    }
}
