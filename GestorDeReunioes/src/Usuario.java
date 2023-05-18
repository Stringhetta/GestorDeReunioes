import java.util.List;

public class Usuario {

    private String nome;
    private String senha;
    private String email;
    List<Evento> eventos;

    // Construtor
    public Usuario(String nome, String senha, String email, List<Evento> eventos) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.eventos = eventos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(List<Evento> eventos) {
        this.eventos = eventos;
    }

    public void adicionarEvento(Evento eventos){
        //Metodo para adicionar o evento
    }

    public void removerEvento(Evento eventos){
        //Metodo para remover o evento
    }
}
