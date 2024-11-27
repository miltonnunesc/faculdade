package RevisaoProva.Refazendo;

public class SistemaProduto {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Teclado", 200);
        Produto produto2 = new Produto("Mouse", 150);

        System.out.println("Preço total para uma unidade de Teclado: R$" + produto1.calcularPrecoTotal());
        System.out.println("Preço total para uma unidade de Mouse: R$" + produto2.calcularPrecoTotal());

        System.out.println("Preço total para três unidades de Teclado: R$" + produto1.calcularPrecoTotal(3));
        System.out.println("Preço total para três unidades de Mouse: R$" + produto2.calcularPrecoTotal(3));
    }
}