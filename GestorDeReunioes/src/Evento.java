import java.time.LocalDateTime;
import java.util.List;

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
}
