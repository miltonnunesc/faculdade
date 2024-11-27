package RevisaoProva.Exercicio2;

public class Sistema {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Manteiga", 15.99);
        Produto produto2 = new Produto("Celular", 3.450);

        produto1.calcularPrecoTotal();
        produto1.calcularPrecoTotal(3);

        System.out.println("Preço total de 1 unidade da " + produto1.nome + ": R$ " + produto1.calcularPrecoTotal());
        System.out.println("Preço total de 1 unidade do " + produto2.nome + ": R$ " + produto2.calcularPrecoTotal());

        System.out.println("Preço total de 5 unidades da Manteiga: R$ " + produto1.calcularPrecoTotal(5));
        System.out.println("Preço total de 3 unidades do Celular: R$ " + produto2.calcularPrecoTotal(3));

        System.out.println("Teste com quantidade inválida: R$ " + produto2.calcularPrecoTotal(0));
    }
}
