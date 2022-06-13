package practicaSegundoParcial.memento;

public class Client {
    public static void main(String[] args){
        Tesis tesis= new Tesis();
        Estado estado= new Estado();

        Version version;
        version= new Version("Dispensador de comida para perritos", "230 hojas");

        version.setTitulo("Dispensador de comida para perritos");
        version.setHojas("230 hojas");

        estado.setVersion(version);
        tesis.createVersion("1",estado.createVersion());
        version= new Version("Dispensador de comida","5 hojas");

        estado.setVersion(version);
        tesis.createVersion("2",estado.createVersion());
        version= new Version("Dispensador de comida","10 hojas");

        estado.setVersion(version);
        tesis.createVersion("3",estado.createVersion());
        version= new Version("Dispensador de comida","20 hojas");

        estado.setVersion(version);
        tesis.createVersion("4",estado.createVersion());
        version= new Version("Dispensador de comida","30 hojas");

        estado.setVersion(version);
        tesis.createVersion("5",estado.createVersion());
        version= new Version("Dispensador de comida","40 hojas");

        version = estado.restoreVersion(tesis.getVersion("3"));
        version.showInfo();
    }
}
