public class Circulo {
    double raio;

    void CalcularArea(double area) {
        area = Math.PI * Math.pow(raio, 2);
        System.out.printf("Area do Circulo: %.2f\n\n", area);
    }

    void CalcularPerimetro(double perimetro) {
        perimetro = 2 * Math.PI * raio;
        System.out.printf("Perimetro do Circulo: %.2f", perimetro);
    }
}