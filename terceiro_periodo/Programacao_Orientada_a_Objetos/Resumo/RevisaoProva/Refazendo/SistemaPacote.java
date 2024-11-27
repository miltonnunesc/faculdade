package RevisaoProva.Refazendo;

public class SistemaPacote {
    public static void main(String[] args) {
        Pacote pacote1 = new PacoteSimples(4);
        Pacote pacote2 = new PacoteExpresso(4);

        System.out.println("Custo pacote Simples: R$" + pacote1.calcularCustoEnvio());
        System.out.println("Custo pacote Expresso: R$" + pacote2.calcularCustoEnvio());
    }
}
