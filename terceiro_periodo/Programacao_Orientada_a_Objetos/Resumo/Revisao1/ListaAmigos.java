package Revisao1;
public class ListaAmigos {
    String nome;
    String apelido;
    int nascimento;
    String email;
    String whatsapp;
    String instagram;
    String rua;
    int numero;
    String cidade;
    String sigla_estado;

    public ListaAmigos(String nome, String apelido, int nascimento, String email, String whatsapp, String instagram, String rua, int numero, String cidade, String sigla_estado) {
        this.nome = nome;
        this.apelido = apelido;
        this.nascimento = nascimento;
        this.email = email;
        this.whatsapp = whatsapp;
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.sigla_estado = sigla_estado;
    }

    public String getEmail() {
        return email;
    }
}
