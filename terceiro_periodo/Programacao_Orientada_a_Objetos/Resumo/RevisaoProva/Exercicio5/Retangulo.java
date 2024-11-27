package RevisaoProva.Exercicio5;

public class Retangulo implements FiguraGeometrica{
    private double base;
    private double altura;

    public Retangulo (double base, double altura){
        super();
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return base * altura;
        }
}