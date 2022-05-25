package builder.practice;

public class Pizza {
    private String ingredientes;
    private String tipoMasa;
    private String tipoQueso;

    public Pizza(){}

    public void showInfo() {
        System.out.println("ingredientes "+ingredientes);
        System.out.println("tipoMasa "+tipoMasa);
        System.out.println("tipoQueso "+tipoQueso);
    }
}
