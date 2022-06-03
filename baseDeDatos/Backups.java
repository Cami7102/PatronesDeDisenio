package memento.practice.baseDeDatos;

public class Backups {
    private String alias;

    public Backups (String alias){
        this.alias=alias;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void showInfo() {
        System.out.println("Alias: "+alias);
    }
}
