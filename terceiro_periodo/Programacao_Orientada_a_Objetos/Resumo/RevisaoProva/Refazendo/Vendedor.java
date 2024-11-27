package RevisaoProva.Refazendo;

public class Vendedor extends Funcionario{
    double totalVendaMes;

    public Vendedor(String nome, String CPF, double salarioBase, double totalVendaMes){
        super(nome, CPF, salarioBase);
        this.totalVendaMes = totalVendaMes;
    }

    public double calcularSalario(){
        return salarioBase + (totalVendaMes * 0.05);
    }
}
