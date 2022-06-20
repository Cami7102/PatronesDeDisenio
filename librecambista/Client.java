package visitor.practice.librecambista;

public class Client {
    public static void main (String[]args){
        Librecambista librecambista= new Librecambista();

        Bolivia bolivia= new Bolivia();
        bolivia.setCambio("bolivianos", 70.0);
        bolivia.accept(librecambista);
        bolivia.setCambio("dolares", 100.0);
        bolivia.accept(librecambista);
/*
        Argentina argentina= new Argentina();
        argentina.setCambio("pesos", 70);
        argentina.accept(librecambista);
        argentina.setCambio("dolares", 70);
        argentina.accept(librecambista);

        Brasil brasil= new Brasil();
        brasil.setCambio("reales", 70);
        brasil.accept(librecambista);
        brasil.setCambio("dolares", 70);
        brasil.accept(librecambista);

        Italia italia= new Italia();
        italia.setCambio("euros", 70);
        italia.accept(librecambista);
        italia.setCambio("dolares", 70);
        italia.accept(librecambista);
 */
    }
}
