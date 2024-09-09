public class Cachorro {
    String raca;
    String porte;
    String cor;
    boolean tem_rabo;

    void late() {
        String rabo;

        if(tem_rabo == false) {
            rabo = "eu nao tenho rabo...";
        } else {
            rabo = "eu tenho rabo...";
        }

        System.out.println("Eu sou o " + raca + " de porte " + porte + ", minha cor e " + cor + " e " + rabo + "\n");
    }
}