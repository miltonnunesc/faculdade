package RevisaoProva.Refazendo;

public class PacoteSimples extends Pacote{
    public PacoteSimples(double peso){
        super(peso);
    }

    @Override
    public double calcularCustoEnvio() {
        double taxaPorQuilo = 5.0;
        return getPeso() * taxaPorQuilo;
    }
}