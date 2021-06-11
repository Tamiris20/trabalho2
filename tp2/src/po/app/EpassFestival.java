package po.app;

public class EpassFestival extends PassSazonal {
    private double saldoCartaoPgmt;
    private String nomeEvento;

    public EpassFestival(double saldo,String evento){
        this.saldoCartaoPgmt=saldoCartaoPgmt;
        this.nomeEvento=nomeEvento;

    }
    public EpassFestival(String evento){
        this.nomeEvento=nomeEvento;

    }
    public EpassFestival(EpassFestival outro){
        this.saldoCartaoPgmt=outro.saldoCartaoPgmt;
        this.nomeEvento=outro.nomeEvento;

    }

    public double getSaldoCartaoPgmt() {
        return saldoCartaoPgmt;
    }

    public void setSaldoCartaoPgmt(double saldoCartaoPgmt) {
        this.saldoCartaoPgmt = saldoCartaoPgmt;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }
}
