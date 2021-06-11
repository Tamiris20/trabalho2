package po.app;

import java.time.LocalDate;

public class PassStandard extends Epass{
 private Titular titular;
 private int  pontos;
 private int numeroViagens;
 private String chaveValida;

 public PassStandard(String codigoDoc,TipoDocumento tipoDoc,LocalDate ddn,String nome,String email){

  //super(codigoDoc,tipoDoc,ddn,nome,email);
  //this.titular=new Titular(new codigoDoc,tipoDoc,nome,ddn,email);

 }
 public PassStandard(DocumentoID docID,LocalDate ddn,String nome,String email){
  //super(docID,ddn,nome,email);


 }
 public PassStandard(DocumentoID docID,String nome,LocalDate ddn,String morada,String email,int telemovel){
  //super

 }
 public PassStandard(PassStandard pass){

 }

 public String getChaveValida() {
  return chaveValida;
 }

 public Titular getTitular() {
  return titular;
 }

 public int getPontos() {
  return pontos;
 }

 public void setChaveValida(String chaveValida) {
  this.chaveValida = chaveValida;
 }
}
