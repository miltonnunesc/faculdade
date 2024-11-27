package RevisaoProva.Exercicio2;

public class Produto {
    String nome;
    double precoUnitario;

    public Produto(String nome, double precoUnitario){
        this.nome = nome;
        this.precoUnitario = precoUnitario;
    }

    public double calcularPrecoTotal(){
        return precoUnitario;
    }

    public double calcularPrecoTotal(int quantidade){
        if(quantidade < 0){
            System.out.println("Quantidade inválida.");
        }
        return precoUnitario * quantidade;
    }
}
