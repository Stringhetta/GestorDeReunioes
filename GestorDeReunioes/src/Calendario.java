import java.util.List;

public class Calendario {

    List<Evento> eventos;

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

    public void listarEventos(){

    }

    public boolean verificarDisponibilidade(Evento eventos){
        return false; // Retornar true ou false
    }

}
