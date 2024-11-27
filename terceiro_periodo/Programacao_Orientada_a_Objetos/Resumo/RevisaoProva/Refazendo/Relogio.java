package RevisaoProva.Refazendo;

public class Relogio {
    public void imprimirTempoRestanteDia(int horaAtual){
        if(horaAtual < 0 || horaAtual > 24){
            System.out.println("Horas inválida.");
            return;
        }

        int horasRestantes = 24 - horaAtual;
        System.out.printf("Faltam %d horas para encerrar o dia.\n", horasRestantes);
    }

    public void imprimirTempoRestanteDia(int horaAtual, int minutoAtual){
        if(horaAtual < 0 || horaAtual > 24 || minutoAtual < 0 || minutoAtual > 60){
            System.out.println("Horas inválida.");
            return;
        }

        int horasRestantes = 23 - horaAtual;
        int minutosRestantes = 60 -minutoAtual;

        if(minutoAtual == 60){
            horasRestantes++;
            minutoAtual = 0;
        }

        System.out.printf("Faltam %d horas e %d minutos para encerrar o dia.\n", horasRestantes, minutosRestantes);
    }
}
