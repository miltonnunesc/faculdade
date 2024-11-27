package RevisaoProva.Exercicio3;

public class PacoteSimples extends Pacote {
    public PacoteSimples(double peso){
        super(peso);
    }

    public double calcularCustoEnvio(){
        double taxaPorQuilo = 5.0;
        return getPeso() * taxaPorQuilo;
    }
}
