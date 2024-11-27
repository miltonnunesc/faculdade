package RevisaoProva.Refazendo;

public class PacoteExpresso extends Pacote{
    public PacoteExpresso(double peso){
        super(peso);
    }

    @Override
    public double calcularCustoEnvio() {
        double taxaPorQuilo = 10.0;
        double taxaAdicional = 20.0;
        return (getPeso() * taxaPorQuilo) + taxaAdicional;
    }
}
