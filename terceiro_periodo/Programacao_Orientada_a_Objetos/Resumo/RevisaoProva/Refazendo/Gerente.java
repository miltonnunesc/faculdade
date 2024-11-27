package RevisaoProva.Refazendo;

public class Gerente extends Funcionario{

    public Gerente(String nome, String CPF, double salarioBase){
        super(nome, CPF, salarioBase);
    }

    public double calcularSalario(){
        return salarioBase * 3;
    }
}
