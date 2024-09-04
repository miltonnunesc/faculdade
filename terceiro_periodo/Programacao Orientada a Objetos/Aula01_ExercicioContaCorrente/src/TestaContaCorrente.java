public class TestaContaCorrente {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente();

        c1.agencia = 1234;
        c1.numero = 1897;
        c1.saldo = 8;

        c1.Depositar(500);

        c1.ConsultarSaldo();

        c1.Sacar(77);

        c1.ConsultarSaldo();

    }
}
