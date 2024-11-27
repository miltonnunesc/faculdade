package Encapsulamento;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        MSNMessenger msnMessenger = new MSNMessenger();
        msnMessenger.enviarMensagem();
        msnMessenger.receberMensagem();

        FacebookMessenge facebookMessenge = new FacebookMessenge();
        facebookMessenge.enviarMensagem();
        facebookMessenge.receberMensagem();

        Telegram telegram = new Telegram();
        telegram.enviarMensagem();
        telegram.receberMensagem();
    }
}
