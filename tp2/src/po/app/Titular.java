package po.app;

import java.time.LocalDate;

public class Titular {
    private  DocumentoID docID;
    private String nome;
    private LocalDate ddn;
    private String morada;
    private String email;
    private int telefone;


    public Titular(String codigoDoc,TipoDocumento tipoDoc,String nome,LocalDate ddn,String email){
        this.docID=new DocumentoID(codigoDoc,tipoDoc);
        this.nome=nome;
        this.ddn=ddn;
        this.email=email;
    }
    public Titular(DocumentoID docID,String nome,LocalDate ddn,String morada,String email,int telefone){
        this.docID=docID;
        this.nome=nome;
        this.ddn=ddn;
        this.morada=morada;
        this.email=email;
        this.telefone=telefone;

    }

    public Titular(DocumentoID docID,String nome,LocalDate ddn,String email){
        this.docID=docID;
        this.nome=nome;
        this.ddn=ddn;
        this.email=email;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public DocumentoID getDocID() {
        return docID;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDdn() {
        return ddn;
    }

    public String getMorada() {
        return morada;
    }

    public String getEmail() {
        return email;
    }

    public int getTelefone() {
        return telefone;
    }
}
