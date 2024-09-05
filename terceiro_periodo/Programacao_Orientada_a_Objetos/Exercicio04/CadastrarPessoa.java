public class CadastrarPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();

        p1.nome = "Maria Clara";
        p1.idade = 21;
        p1.cidade = "Belo Horizonte";

        p1.Apresentar();

        Pessoa p2 = new Pessoa();

        p2.nome = "Daniel Rocha";
        p2.idade = 22;
        p2.cidade = "Contagem";

        p2.Apresentar();
    }
}
