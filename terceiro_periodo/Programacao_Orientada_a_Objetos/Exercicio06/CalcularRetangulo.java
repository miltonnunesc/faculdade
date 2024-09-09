public class CalcularRetangulo {
    public static void main(String[] args) {
        Retangulo r1 = new Retangulo();

        r1.altura = 10;
        r1.largura = 50;

        r1.calcularArea();
        r1.exibirArea();

        Retangulo r2 = new Retangulo();
        
        r2.altura = 37;
        r2.largura = 94;
        
        r2.calcularArea();
        r2.exibirArea();
    }
}