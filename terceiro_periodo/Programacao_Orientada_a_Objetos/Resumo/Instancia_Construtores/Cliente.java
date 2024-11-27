package Instancia_Construtores;

public class Cliente {
    String nome;
    Double LimiteCredito = 10.0;

    public Cliente (String nome){
        this.nome = nome;
    }

    public void SolicitarLimiteCredito(Double valorSolicitado) {
        LimiteCredito = valorSolicitado;
    }

    public void comprar(Double valorProduto) {
        LimiteCredito = LimiteCredito - valorProduto;
    }
}
