package Instancia_Construtores;

public class Sistema {
    public static void main(String[] args) {
        Cliente gleyson = new Cliente("Gleyson");
        gleyson.SolicitarLimiteCredito(200.0);
        gleyson.comprar(50.0);
        
        Cliente izabely = new Cliente("Izabely");
        izabely.SolicitarLimiteCredito(80.0);
        izabely.comprar(22.0);

        System.out.println("Limite do(a) " + gleyson.nome + " é " + gleyson.LimiteCredito);
        System.out.println("Limite do(a) " + izabely.nome + " é " + izabely.LimiteCredito);
    }
}
