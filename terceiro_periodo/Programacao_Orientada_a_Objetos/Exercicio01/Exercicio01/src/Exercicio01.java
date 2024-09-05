
// 1 - Aluno, Professor, Turma.

    public class Aluno {
        String nome;
        int matricula;
    }

    public class Professor {
        String nome;
        String especializacao;
    }

    public class Turma {
        String nome;
        int serie;
        String Professor;
        int aluno;
    }

// 2 - Atributos: Nome, Matrícula
// Comportamentos/Metódos: Realizar Matrícula, Consultar Notas

    public class Aluno {
        String nome;
        int matricula;

        void RealizarMatricula(Turma turma) {

        }

        void ConsultarNota() {

        }
    }

// 3 - Classe é a definição de um tipo de objeto. Ela descreve os atributos (propriedades) e métodos (comportamentos) que os objetos desse tipo terão.
// Já o Objeto é é uma instância de uma classe.

    public class Carro {
        String marca;
        int ano;

        void ligar(){
            System.out.println("O carro está ligado.");
        }
    }

    Carro c1 = new Carro();

    c1.marca = "Toyota";
    c1.ano = 2024;
    c1.ligar();

// 4 - Em uma Biblioteca há os usuários ou clientes que irá emprestar um livro.
// Pode ser realizado um relacionamento do tipo "possui" entre o Usuário e o Empréstimo do Livro.

    public class Biblioteca {
        String nome;
        String livros; 
    }

    public class Livro {
        String titulo;
        String autor;

        String verTitulo() {
            return titulo;
        }

        String verAutor() {
            return autor;
        }
    }


// 5 - Porque permite representar conceitos do mundo real de maneira mais intuitiva e natural dentro de um programa.

    public class Carro {
        String marca;
        String modelo;
        String cor;
        int ano;

        public void ligar() {
            System.out.println("O carro está ligado.");
        }
    
        public void acelerar() {
            System.out.println("O carro está acelerando.");
        }
    }

    public class Main {
        public static void main(String[] args) {
            // Criando um objeto do mundo real
            Carro c1 = new Carro();

            c1.marca = "Toyota";
            c1.modelo = "Corolla";
            c1.cor = "Prata";
            c1.ano = 2022;
    
            // Chamando comportamentos (métodos) do objeto
            c1.ligar();
            c1.acelerar();
        }
    }
    

