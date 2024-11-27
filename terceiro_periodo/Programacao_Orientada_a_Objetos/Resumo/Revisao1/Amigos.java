package Revisao1;
public class Amigos {
    public static void main(String[] args) {
        ListaAmigos amigo1 = new ListaAmigos("Daniel Rocha", "Rocha", 14/04/2004, "daniel@hotmail.com", "319123456789", "danirocha", "Jose Alves", 12, "Belo Horizonte", "MG");

        System.out.println(amigo1.apelido + " tem o email: " + amigo1.getEmail());
    }
}
