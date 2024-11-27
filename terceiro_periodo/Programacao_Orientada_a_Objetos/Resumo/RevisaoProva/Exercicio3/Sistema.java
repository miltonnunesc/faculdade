package RevisaoProva.Exercicio3;

public class Sistema {
    public static void main(String[] args) {
        Pacote pacote1 = new PacoteSimples(3.5);
        Pacote pacote2 = new PacoteExpresso(3.5);

        System.out.println("Custo pacote Simples: R$" + pacote1.calcularCustoEnvio());
        System.out.println("Custo pacote Expresso: R$" + pacote2.calcularCustoEnvio());
    }
}
