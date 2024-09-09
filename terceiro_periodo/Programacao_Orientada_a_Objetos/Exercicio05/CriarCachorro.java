public class CriarCachorro {
    public static void main(String[] args) {
        Cachorro c1 = new Cachorro();

        c1.raca = "Pastor Alemao";
        c1.porte = "Grande";
        c1.cor = "Alaranjada";
        c1.tem_rabo = true;

        c1.late();

        Cachorro c2 = new Cachorro();

        c2.raca = "Shih Tzu";
        c2.porte = "Pequeno";
        c2.cor = "Branca";
        c2.tem_rabo = true;

        c2.late();

        Cachorro c3 = new Cachorro();

        c3.raca = "Rottweiler";
        c3.porte = "Grande";
        c3.cor = "Preta";
        c3.tem_rabo = false;

        c3.late();
    }
}
