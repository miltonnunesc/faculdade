public class Pessoa {
    String nome;
    String cidade;
    byte idade;
    
    void Apresentar() {
        System.out.println("Olá! Me chamo " + nome + ", tenho " + idade + " anos de idade e moro na cidade de " + cidade + ". Prazer em te conhecer!\n");
    }
}