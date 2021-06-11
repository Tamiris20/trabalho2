package po.app;

import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Epass {
    private long codigo;
    private double saldo;
    private double precoViagem;
    private LocalDate dataCarrega;
    private LocalDate dataValida;
    private static long ultCod;
    private LocalDateTime emissao;

    static{

        if(Long.valueOf(ultCod)==null)
            ultCod=0;
    }

    public Epass(){
        this.codigo=ultCod+1;
        this.emissao=LocalDateTime.now();
        ultCod++;
    }

    public Epass(double saldo,double precoViagem){
       this.codigo=ultCod+1;
       ultCod++;
        this.saldo=saldo;
        this.precoViagem=precoViagem;
        this.emissao=LocalDateTime.now();

    }
    public Epass(double precoViagem){
        this.precoViagem=precoViagem;

    }
    public Epass(double saldo,double precoViagem,LocalDate dataCarrega,LocalDate dataValida){
        this.saldo=saldo;
        this.precoViagem=precoViagem;
        this.dataCarrega=dataCarrega;
        this.dataValida=dataValida;

    }
    public Epass(double saldo,LocalDate dataCarrega){
        this.saldo=saldo;
        this.dataCarrega=dataCarrega;

    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setPrecoViagem(double precoViagem) {
        this.precoViagem = precoViagem;
    }

    public void setDataCarrega(LocalDate dataCarrega) {
        this.dataCarrega = dataCarrega;
    }

    public void setDataValida(LocalDate dataValida) {
        this.dataValida = dataValida;
    }

    public long getCodigo() {
        return codigo;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getPrecoViagem() {
        return precoViagem;
    }

    public LocalDate getDataCarrega() {
        return dataCarrega;
    }

    public LocalDate getDataValida() {
        return dataValida;
    }

    /*public String toString(){




    //public boolean equals(Epass outro){
        //compara se dois objetos da classe epass sao iguais
        //compara se todos os objetos sao iguais

    //}*/
}

