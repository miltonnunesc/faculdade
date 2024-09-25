public class Principal {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Sonic", "1", 22);

        System.out.println("Nome: " + a1.getNome());
        System.out.println("Idade: " + a1.getIdade());
        System.out.println("Matricula: " + a1.getMatricula());

        a1.setNome("Shadow");
        a1.setIdade(50);
        a1.setMatricula("2");

        System.out.println("\nNome: " + a1.getNome());
        System.out.println("Idade: " + a1.getIdade());
        System.out.println("Matricula: " + a1.getMatricula());
    }
}
