public class Principal {
    public static void main(String[] args) {
        Disciplina disciplina = new Disciplina("Matemática", 80);
        Aluno p1 = new Aluno("Toph", 1, 8, 4, 9, 10, 6, disciplina);

        double media = p1.calcularMedia();
        System.out.println("A média do aluno " + p1.getNome() + " é: " + media);

        String situacao = p1.situacaoAluno();
        System.out.println("Situação: " + situacao);

        System.out.println("Disciplina: " + p1.getDisciplina().getNome());
    }
}   