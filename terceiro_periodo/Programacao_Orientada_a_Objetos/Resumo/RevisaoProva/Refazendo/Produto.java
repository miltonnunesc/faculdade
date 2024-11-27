package RevisaoProva.Refazendo;

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
        return precoUnitario * quantidade;
    }
}