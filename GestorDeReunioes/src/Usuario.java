import java.util.List;

public class Usuario {
    private String nome;
    private String senha;
    private String email;
    private List<Evento> eventos;

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

    public void adicionarEvento(Evento evento) {
        eventos.add(evento);
    }

    public void removerEvento(Evento evento) {
        eventos.remove(evento);
    }

    public Evento buscarEvento(String nomeEvento) {
        for (Evento evento : eventos) {
            if (evento.getNome().equals(nomeEvento)) {
                return evento;
            }
        }
        return null;
    }

    public static Usuario buscarUsuarioPorNome(String nomeUsuario, List<Usuario> usuarios) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNome().equals(nomeUsuario)) {
                return usuario;
            }
        }
        return null;
    }

    public String toFileLine() {
        StringBuilder sb = new StringBuilder();
        sb.append(nome).append(",");
        sb.append(senha).append(",");
        sb.append(email);
        return sb.toString();
    }

    public static Usuario fromFileLine(String line) {
        String[] parts = line.split(",");
        if (parts.length == 3) {
            String nome = parts[0];
            String senha = parts[1];
            String email = parts[2];
            return new Usuario(nome, senha, email, null);
        }
        return null;
    }
}
