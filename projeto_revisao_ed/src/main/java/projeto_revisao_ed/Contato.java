package projeto_revisao_ed;

public class Contato {
    private String nome;
    private String telefone;
    private String email;


    //Contrutores
    public Contato(){    
    }

    public Contato(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }


    @Override
    public String toString(){
        return "Contato\n" + "Nome: " + nome + "\nTelefone: " + telefone + "\nEmail: " + email + "\n";
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    

    
}
