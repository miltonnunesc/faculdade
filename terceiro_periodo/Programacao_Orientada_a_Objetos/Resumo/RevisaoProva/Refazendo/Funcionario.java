package RevisaoProva.Refazendo;

public abstract class Funcionario {
    String nome;
    String CPF;
    double salarioBase;

    public Funcionario(String nome, String CPF, double salarioBase){
        this.nome = nome;
        this.CPF = CPF;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();

    public void imprimirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + CPF);
        System.out.println("Salario base: R$" + salarioBase);
        System.out.println("Salário Final: R$" + calcularSalario());
        System.out.println("---------------------------");

    }
}
