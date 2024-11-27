package RevisaoProva.Exercicio5;

public class Circulo implements FiguraGeometrica{
    private double raio;

    public Circulo(double raio) {
        super();
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
