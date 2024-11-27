package Encapsulamento;

public class SistemaMensagemInstantanea {
    public void enviarMensagem(){
        if(validarConectadoInternet()){
            System.out.println("Enviando mensagem...");
        } else {
            System.out.println("Computador Offline.");
        }
    }

    public void receberMensagem(){ 
        System.out.println("Recebendo mensagem...");
    }

    private boolean validarConectadoInternet(){
        System.out.println("Validando se está conectado a internet...");
        return true;
    }

    private void salvarHistoricoMensagem(){
        System.out.println("Salvando historico de mesangens...");
    }
}
