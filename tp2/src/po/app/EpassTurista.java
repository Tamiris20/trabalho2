package po.app;

public class EpassTurista extends PassSazonal {
    private Duracao duracao;


    public EpassTurista(Duracao duracao) {
        this.duracao=duracao;

    }

    public EpassTurista(EpassTurista outro) {
        this.duracao=outro.duracao;

    }

    public Duracao getDuracao() {
        return duracao;
    }

}
