package visitor.practice.librecambista;

public interface IPais {
    void accept(IVisitor visitor);
    void setCambio(String moneda, double cantidad);
}
