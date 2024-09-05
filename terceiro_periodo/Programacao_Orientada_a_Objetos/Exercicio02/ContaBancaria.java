public class ContaBancaria {
    int numero;
    String titular;
    double saldo;

    void Depositar(double deposito) {
        System.out.printf("Deposito de R$%.2f realizado.\n\n", deposito);
        saldo += deposito;
    }

    void Sacar(double saque){
        System.out.printf("Saque de R$%.2f realizado.\n\n", saque);
        saldo -= saque;
    }

    double ConsultarSaldo(){
        System.out.printf("Saldo atual: R$%.2f\n\n", saldo);
        return saldo;
    }
    
}