public class ContaCorrente {
    long numero;
    int agencia;
    double saldo;

    void Depositar(double deposito) {
        System.out.printf("Deposito de R$%.2f realizado.\n\n", deposito);
        saldo += deposito;
    }

    void Sacar(double saque) {
        System.out.printf("Saque de R$%.2f realizado.\n\n", saque);
        saldo -= saque;
    }

    double ConsultarSaldo() {
        System.out.printf("Saldo: R$%.2f\n\n", saldo);
        return saldo;
    }
}
