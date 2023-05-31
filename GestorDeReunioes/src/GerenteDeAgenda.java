import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GerenteDeAgenda {
    private static final String USUARIOS_FILE = "usuarios.txt";
    private static final String EVENTOS_FILE = "eventos.txt";

    private List<Usuario> usuarios;

    public GerenteDeAgenda() {
        this.usuarios = new ArrayList<>();
    }

    public boolean criarUsuarioSenha(String usuario, String senha, String email) {
        carregarUsuarios();
        // Verificar se o email já está em uso por outro usuário
        for (Usuario u : usuarios) {
            if (u.getEmail().equals(email)) {
                System.out.println("\nErro: O email já está em uso por outro usuário.");
                return false;
            }
        }
        // Validar o email fornecido
        if (!validarEmail(email)) {
            System.out.println("\nErro: O email fornecido é inválido.");
            return false; // Retorna para interromper a execução do método
        }
        // Criar novo usuário e adicionar à lista
        Usuario novoUsuario = new Usuario(usuario, senha, email, null);
        usuarios.add(novoUsuario);

        salvarUsuarios();
        return true;
    }

    public boolean verificarCredenciais(String usuario, String senha) {
        carregarUsuarios();
        for (Usuario u : usuarios) {
            if (u.getNome().equals(usuario) && u.getSenha().equals(senha)) {
                return true;
            }
        }
        return false;
    }

    public void gravarEvento(Evento evento) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(EVENTOS_FILE, true))) {
            writer.write(evento.toFileLine());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Evento> lerEventos(List<Usuario> usuarios) {
        List<Evento> eventos = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(EVENTOS_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Evento evento = Evento.fromFileLine(line, usuarios);
                if (evento != null) {
                    eventos.add(evento);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return eventos;
    }

    private void salvarUsuarios() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(USUARIOS_FILE))) {
            for (Usuario u : usuarios) {
                writer.write(u.toFileLine());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void carregarUsuarios() {
        usuarios.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(USUARIOS_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Usuario usuario = Usuario.fromFileLine(line);
                if (usuario != null) {
                    usuarios.add(usuario);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean validarEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        return email.matches(regex);
    }

}