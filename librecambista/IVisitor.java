package visitor.practice.librecambista;

public interface IVisitor {
    void cambioMoneda(Bolivia bolivia);
    void cambioMoneda(Argentina argentina);
    void cambioMoneda(Brasil brasil);
    void cambioMoneda(Italia italia);
}
