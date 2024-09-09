public class Retangulo {
        double largura;
        double altura;

        double calcularArea() {
            return largura * altura;
        }

        void exibirArea() {
            System.out.printf("A area do Retangulo e: %.0f\n\n", calcularArea());
        }
}