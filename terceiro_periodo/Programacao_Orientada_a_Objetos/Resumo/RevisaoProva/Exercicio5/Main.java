package RevisaoProva.Exercicio5;

public class Main {
    public static void main(String[] args) {
        FiguraGeometrica figura = new Retangulo(2, 5);
        System.out.println(figura.calcularArea());

        figura = new Quadrado(5);
        System.out.println(figura.calcularArea());

        figura = new Circulo(7);
        System.out.println(figura.calcularArea());
    }
}
