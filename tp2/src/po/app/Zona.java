package po.app;

public class Zona {
    private int id;
    private String nome;


    public Zona(String nome){
        this.nome=nome;

    }
    public Zona(Zona nZona){
        this.nome=nZona.nome;
   }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
