package RevisaoProva.Exercicio5;

public class Quadrado implements FiguraGeometrica{
    private double lado;

    public Quadrado(double lado) {
    super();
        this.lado = lado;
    }

    public double calcularArea() {
        return lado * lado;
    }
}
