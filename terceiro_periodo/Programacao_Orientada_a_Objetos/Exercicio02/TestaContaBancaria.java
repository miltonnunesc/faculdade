public class TestaContaBancaria {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria();

        c1.numero = 1234;
        c1.titular = "Pedro Silva";
        c1.saldo = 98745;

        c1.Depositar(1000);
        c1.Sacar(41723);
        c1.ConsultarSaldo();
        
    }
}