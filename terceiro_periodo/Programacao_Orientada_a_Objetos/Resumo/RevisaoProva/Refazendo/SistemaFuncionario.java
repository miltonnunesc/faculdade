package RevisaoProva.Refazendo;

public class SistemaFuncionario {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Paulo", "123.456.789-00", 3000);

        Vendedor vendedor1 = new Vendedor("Carlos", "234.567.890-11", 2000, 10000);
        Vendedor vendedor2 = new Vendedor("Bianca", "345.678.901-22", 2000, 20000);
        Vendedor vendedor3 = new Vendedor("Diego", "456.789.012-33", 2000, 5000);

        gerente.imprimirDados();
        vendedor1.imprimirDados();
        vendedor2.imprimirDados();
        vendedor3.imprimirDados();

        double somaSalarios = gerente.calcularSalario() + vendedor1.calcularSalario() + vendedor2.calcularSalario() + vendedor3.calcularSalario();

        System.out.println("Soma total dos salários: R$" + somaSalarios);
    }
}
