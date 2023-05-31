import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

public class Evento {

    private String nome;
    private String descricao;
    private LocalDateTime dataHoraInicio;
    private LocalDateTime dataHoraTermino;
    List<Usuario> participantes;


    // Construtor
    public Evento(String nome, String descricao, LocalDateTime dataHoraInicio, LocalDateTime dataHoraTermino, List<Usuario> participantes) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataHoraInicio = dataHoraInicio;
        this.dataHoraTermino = dataHoraTermino;
        this.participantes = participantes;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getDataHoraInicio() {
        return dataHoraInicio;
    }

    public void setDataHoraInicio(LocalDateTime dataHoraInicio) {
        this.dataHoraInicio = dataHoraInicio;
    }

    public LocalDateTime getDataHoraTermino() {
        return dataHoraTermino;
    }

    public void setDataHoraTermino(LocalDateTime dataHoraTermino) {
        this.dataHoraTermino = dataHoraTermino;
    }

    public List<Usuario> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(List<Usuario> participantes) {
        this.participantes = participantes;
    }

    public void adicionarParticipantes(Usuario participante){
        // Metodo para adicionar Participantes
    }

    public void removerParticipantes(Usuario participante){
        // Metodo para remover Participantes
    }

    public String toFileLine() {
        StringBuilder sb = new StringBuilder();
        sb.append(nome).append(",");
        sb.append(descricao).append(",");
        sb.append(dataHoraInicio).append(",");
        sb.append(dataHoraTermino).append(",");
        for (Usuario participante : participantes) {
            sb.append(participante.getNome()).append(";");
        }
        return sb.toString();
    }

    public static Evento fromFileLine(String line, List<Usuario> usuarios) {
        String[] parts = line.split(",");
        if (parts.length == 5) {
            String nome = parts[0];
            String descricao = parts[1];
            LocalDateTime dataHoraInicio = LocalDateTime.parse(parts[2]);
            LocalDateTime dataHoraTermino = LocalDateTime.parse(parts[3]);
            String[] participantesArray = parts[4].split(";");
            List<Usuario> participantes = new ArrayList<>();
            for (String participante : participantesArray) {
                    Usuario usuario =Usuario.buscarUsuarioPorNome(participante, usuarios);
                if (usuario != null) {
                    participantes.add(usuario);
                }
            }
            return new Evento(nome, descricao, dataHoraInicio, dataHoraTermino, participantes);
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Evento: ").append(nome).append("\n");
        sb.append("Descrição: ").append(descricao).append("\n");
        sb.append("Data/Hora de Início: ").append(dataHoraInicio).append("\n");
        sb.append("Data/Hora de Término: ").append(dataHoraTermino).append("\n");
        sb.append("Participantes: ");
        for (Usuario participante : participantes) {
            sb.append(participante.getNome()).append(", ");
        }
        return sb.toString();
    }
}
